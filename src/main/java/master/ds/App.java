package master.ds;



import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        buildCookies("_bb_source=\"app\";_bb_vid=\"MTM2ODgxODY1NA==\"; _bb_aid=\"Mjk1NzY0OTE3Mg==\"; _bb_tc=\"1\"; _bb_cid=\"1\"; TDLTOKEN=\"51fe6516-d329-4cb5-bbae-4e38f028b008\"; BBAUTHTOKEN=\"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaGFmZiI6IkJPLTVtb1FEVWlTempBIiwidGltZSI6MTY2NzU0MzEzNi4wMDg4MDYyLCJtaWQiOjMzNjgxNDI2LCJ2aWQiOjM5MzE1NDEyOTYsImRldmljZV9pZCI6IldFQiIsInNvdXJjZV9pZCI6MSwiZWNfbGlzdCI6WzMsNCwxMCwxMiwxMywxNCwxNSwxNiwxMDBdLCJURExUT0tFTiI6IjUxZmU2NTE2LWQzMjktNGNiNS1iYmFlLTRlMzhmMDI4YjAwOCIsInJlZnJlc2hfdG9rZW4iOiI5ZTYzMTYzMS1hODE3LTQwZjUtOTllNi0yNWMzNWJlNTA2M2IiLCJ0ZGxfZXhwaXJ5IjoxNjY3NjI5NTM0LCJleHAiOjE2ODMzMjMxMzZ9.HqNcvjRS6BsXl7E4louZhARyPHlA5SpTd0vVLzN1-X4\"; _bb_home_cache=\"12c005ec.2.member\"; _bb_sa_ids=\"10002\"; _bb_mid=\"MzExNjQ5ODE3Mg==\"; csurftoken=\"qfu7kA.MTM2ODgxODY1NA==.1667568145489.txz9O+jgtK3EbXAbpOOHRfdJQSaioEZh3qiBtj5KryI=\"; csrftoken=\"1hHo0od3lIcDICrov3SYJJlf7UTZLjEc7D5uGhEXpwtXxOr5ypkhHn9ISzz0Gfe2\"; _bb_bb2.0=\"1\"; _bb_rd=\"4\"; _bb_rdt=\"MzEyOTcwMDk1OQ==.1\"; ts=\"2022-11-04 18:52:46.860\"");
        System.out.println( "Hello Programmer!" );
        System.out.println(Math.abs(-1));
    }

    private static void buildCookies(String s) {
        String[] cookiesValues = s.split(";");
        Map<String, String> map = new HashMap<>();
        for (String cookie : cookiesValues) {
            int equalsPos = cookie.indexOf('=');
            String key = cookie.substring(0, equalsPos);
            String value = cookie.substring(equalsPos+1);
            map.put(key, value);
            System.out.println("Key: " + key);
            System.out.println("Value: " + value);
        }
        System.out.println(map);
    }
}
