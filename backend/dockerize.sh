#!/bin/bash
set -e

# Your Docker Hub username
USERNAME="kunal2142"

# Map:  build-folder  ->  image-name
declare -A SERVICES=(
  ["service-discovery"]="service-discovery"
  ["product"]="shopre-product-service"
  ["user-authentication"]="shopre-user-authentication-service"
  ["order-and-cart-management"]="shopre-order-and-cart-management-service"
  ["shopre-api-gateway"]="shopre-api-gateway"
)

for FOLDER in "${!SERVICES[@]}"; do
  IMAGE="${SERVICES[$FOLDER]}"
  echo "-----------------------------------------------"
  echo "Building & pushing: $USERNAME/$IMAGE  (from ./$FOLDER)"
  echo "-----------------------------------------------"

  if [ ! -d "$FOLDER" ]; then
    echo "Directory $FOLDER not found! Skipping..."
    continue
  fi

  # Build for amd64 and push in one step (buildx recommended for cross-arch)
  docker buildx build \
    --platform linux/amd64 \
    -t "$USERNAME/$IMAGE" \
    "./$FOLDER" \
    --push
done

echo "-----------------------------------------------"
echo "All services built and pushed successfully!"
echo "-----------------------------------------------"
