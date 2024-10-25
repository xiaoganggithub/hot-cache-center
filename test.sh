# 设置缓存
curl -X POST "http://localhost:8080/cache/myKey" -H "Content-Type: application/json" -d '"test value"'

# 获取缓存
curl -X GET "http://localhost:8080/cache/myKey"

# 删除缓存
curl -X DELETE "http://localhost:8080/cache/myKey"