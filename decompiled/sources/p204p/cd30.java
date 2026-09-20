package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cd30 {

    /* JADX INFO: renamed from: a */
    public static final we20[] f36723a;

    /* JADX INFO: renamed from: b */
    public static final Map f36724b;

    static {
        we20 we20Var = new we20(we20.f250413i, "");
        iva ivaVar = we20.f250410f;
        we20 we20Var2 = new we20(ivaVar, Request.GET);
        we20 we20Var3 = new we20(ivaVar, Request.POST);
        iva ivaVar2 = we20.f250411g;
        we20 we20Var4 = new we20(ivaVar2, "/");
        we20 we20Var5 = new we20(ivaVar2, "/index.html");
        iva ivaVar3 = we20.f250412h;
        we20 we20Var6 = new we20(ivaVar3, "http");
        we20 we20Var7 = new we20(ivaVar3, pka1.f178421b);
        iva ivaVar4 = we20.f250409e;
        we20[] we20VarArr = {we20Var, we20Var2, we20Var3, we20Var4, we20Var5, we20Var6, we20Var7, new we20(ivaVar4, "200"), new we20(ivaVar4, "204"), new we20(ivaVar4, "206"), new we20(ivaVar4, "304"), new we20(ivaVar4, "400"), new we20(ivaVar4, "404"), new we20(ivaVar4, "500"), new we20("accept-charset", ""), new we20("accept-encoding", "gzip, deflate"), new we20("accept-language", ""), new we20("accept-ranges", ""), new we20("accept", ""), new we20("access-control-allow-origin", ""), new we20("age", ""), new we20("allow", ""), new we20("authorization", ""), new we20("cache-control", ""), new we20("content-disposition", ""), new we20("content-encoding", ""), new we20("content-language", ""), new we20("content-length", ""), new we20("content-location", ""), new we20("content-range", ""), new we20("content-type", ""), new we20("cookie", ""), new we20("date", ""), new we20("etag", ""), new we20("expect", ""), new we20("expires", ""), new we20("from", ""), new we20("host", ""), new we20("if-match", ""), new we20("if-modified-since", ""), new we20("if-none-match", ""), new we20("if-range", ""), new we20("if-unmodified-since", ""), new we20("last-modified", ""), new we20("link", ""), new we20("location", ""), new we20("max-forwards", ""), new we20("proxy-authenticate", ""), new we20("proxy-authorization", ""), new we20("range", ""), new we20("referer", ""), new we20("refresh", ""), new we20("retry-after", ""), new we20("server", ""), new we20("set-cookie", ""), new we20("strict-transport-security", ""), new we20("transfer-encoding", ""), new we20("user-agent", ""), new we20("vary", ""), new we20("via", ""), new we20("www-authenticate", "")};
        f36723a = we20VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(we20VarArr[i].f250414a)) {
                linkedHashMap.put(we20VarArr[i].f250414a, Integer.valueOf(i));
            }
        }
        f36724b = Collections.unmodifiableMap(linkedHashMap);
    }

    /* JADX INFO: renamed from: a */
    public static void m32340a(iva ivaVar) throws IOException {
        int iMo51747d = ivaVar.mo51747d();
        for (int i = 0; i < iMo51747d; i++) {
            byte bMo51751i = ivaVar.mo51751i(i);
            if (65 <= bMo51751i && bMo51751i < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(ivaVar.m51759r()));
            }
        }
    }
}
