public class Codec {
     HashMap<String,String> HashingMap=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortVersion=longUrl.hashCode()+"";
        HashingMap.put(shortVersion,longUrl);
        return shortVersion;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if(HashingMap.containsKey(shortUrl)){
            return HashingMap.get(shortUrl);
        }
        return "";
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

