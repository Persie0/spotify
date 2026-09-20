package p204p;

import com.spotify.connectivity.pubsubokhttp.MoshiDealerMessageParser$MoshiDealerMessage;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r0i0 extends hk60 {

    /* JADX INFO: renamed from: a */
    public final xl60.C2578b f194509a = xl60.C2578b.m91389a("type", "method", "uri", "message_ident", "key", "headers", "payloads", "payload");

    /* JADX INFO: renamed from: a */
    public static String m74390a(xl60 xl60Var) throws IOException {
        if (xl60Var.mo51068B() == xl60.EnumC2579c.NULL) {
            xl60Var.mo51074Q();
            return null;
        }
        gqa gqaVarMo51086x = xl60Var.mo51086x();
        try {
            String strMo45428s1 = gqaVarMo51086x.mo45428s1();
            gqaVarMo51086x.close();
            return wl51.m88492p1(strMo45428s1, '\"');
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n0e1.m63430g(gqaVarMo51086x, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m74391b(xl60 xl60Var) {
        if (xl60Var.mo51068B() != xl60.EnumC2579c.NULL) {
            return xl60Var.mo51087y();
        }
        xl60Var.mo51074Q();
        return null;
    }

    @Override // p204p.hk60
    public final Object fromJson(xl60 xl60Var) throws IOException {
        xl60Var.mo51076c();
        String strM74391b = null;
        String strM74391b2 = null;
        String strM74391b3 = null;
        String strM74391b4 = null;
        String strM74391b5 = null;
        LinkedHashMap linkedHashMap = null;
        String strM74390a = null;
        String strM74390a2 = null;
        while (xl60Var.mo51079i()) {
            switch (xl60Var.mo51071K(this.f194509a)) {
                case -1:
                    xl60Var.mo51073P();
                    xl60Var.mo51074Q();
                    break;
                case 0:
                    strM74391b = m74391b(xl60Var);
                    break;
                case 1:
                    strM74391b2 = m74391b(xl60Var);
                    break;
                case 2:
                    strM74391b3 = m74391b(xl60Var);
                    break;
                case 3:
                    strM74391b4 = m74391b(xl60Var);
                    break;
                case 4:
                    strM74391b5 = m74391b(xl60Var);
                    break;
                case 5:
                    if (xl60Var.mo51068B() != xl60.EnumC2579c.NULL) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        xl60Var.mo51076c();
                        while (xl60Var.mo51079i()) {
                            linkedHashMap2.put(xl60Var.mo51084s(), xl60Var.mo51087y());
                        }
                        xl60Var.mo51078f();
                        linkedHashMap = linkedHashMap2;
                    } else {
                        xl60Var.mo51074Q();
                        linkedHashMap = null;
                    }
                    break;
                case 6:
                    strM74390a = m74390a(xl60Var);
                    break;
                case 7:
                    strM74390a2 = m74390a(xl60Var);
                    break;
            }
        }
        xl60Var.mo51078f();
        return new MoshiDealerMessageParser$MoshiDealerMessage(strM74391b, strM74391b2, strM74391b3, strM74391b4, strM74391b5, linkedHashMap, strM74390a, strM74390a2);
    }

    @Override // p204p.hk60
    public final void toJson(rm60 rm60Var, Object obj) throws IOException {
        MoshiDealerMessageParser$MoshiDealerMessage moshiDealerMessageParser$MoshiDealerMessage = (MoshiDealerMessageParser$MoshiDealerMessage) obj;
        if (moshiDealerMessageParser$MoshiDealerMessage == null) {
            rm60Var.mo56895t();
            return;
        }
        Map map = moshiDealerMessageParser$MoshiDealerMessage.headers;
        rm60Var.mo56891e();
        rm60Var.mo56894s("type").mo56887N(moshiDealerMessageParser$MoshiDealerMessage.type);
        rm60Var.mo56894s("method").mo56887N(moshiDealerMessageParser$MoshiDealerMessage.method);
        rm60Var.mo56894s("uri").mo56887N(moshiDealerMessageParser$MoshiDealerMessage.uri);
        rm60Var.mo56894s("message_ident").mo56887N(moshiDealerMessageParser$MoshiDealerMessage.messageIdent);
        rm60Var.mo56894s("key").mo56887N(moshiDealerMessageParser$MoshiDealerMessage.key);
        rm60Var.mo56894s("headers");
        if (map != null) {
            rm60Var.mo56891e();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                rm60Var.mo56894s(str).mo56887N((String) entry.getValue());
            }
            rm60Var.mo56893i();
        } else {
            rm60Var.mo56895t();
        }
        rm60Var.mo56894s("payloads");
        String str2 = moshiDealerMessageParser$MoshiDealerMessage.payloads;
        if (str2 != null) {
            fqa fqaVarMo56889Q = rm60Var.mo56889Q();
            try {
                fqaVarMo56889Q.mo42406b0(str2);
                fqaVarMo56889Q.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    n0e1.m63430g(fqaVarMo56889Q, th);
                    throw th2;
                }
            }
        } else {
            rm60Var.mo56895t();
        }
        rm60Var.mo56894s("payload");
        String str3 = moshiDealerMessageParser$MoshiDealerMessage.payload;
        if (str3 != null) {
            fqa fqaVarMo56889Q2 = rm60Var.mo56889Q();
            try {
                fqaVarMo56889Q2.mo42406b0(str3);
                fqaVarMo56889Q2.close();
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    n0e1.m63430g(fqaVarMo56889Q2, th3);
                    throw th4;
                }
            }
        } else {
            rm60Var.mo56895t();
        }
        rm60Var.mo56893i();
    }
}
