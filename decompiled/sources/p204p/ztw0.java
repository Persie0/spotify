package p204p;

import com.spotify.cosmos.cosmos.Request;

/* JADX INFO: loaded from: classes2.dex */
public final class ztw0 {

    /* JADX INFO: renamed from: a */
    public ph30 f286275a;

    /* JADX INFO: renamed from: d */
    public euw0 f286278d;

    /* JADX INFO: renamed from: e */
    public c95 f286279e = ocu.f163990e;

    /* JADX INFO: renamed from: b */
    public String f286276b = Request.GET;

    /* JADX INFO: renamed from: c */
    public sep f286277c = new sep(1, false);

    /* JADX INFO: renamed from: a */
    public final void m96948a(b3b b3bVar) {
        String strM95444x = z520.m95444x(b3bVar);
        if (strM95444x.length() == 0) {
            this.f286277c.m77924A("Cache-Control");
        } else {
            this.f286277c.m77925B("Cache-Control", strM95444x);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m96949b() {
        m96951d(Request.GET, null);
    }

    /* JADX INFO: renamed from: c */
    public final void m96950c(String str, String str2) {
        this.f286277c.m77925B(str, str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m96951d(String str, euw0 euw0Var) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (euw0Var == null) {
            if (str.equals(Request.POST) || str.equals(Request.PUT) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(s571.m77251j("method ", str, " must have a request body.").toString());
            }
        } else if (!q0f1.m71823O(str)) {
            throw new IllegalArgumentException(s571.m77251j("method ", str, " must not have a request body.").toString());
        }
        this.f286276b = str;
        this.f286278d = euw0Var;
    }

    /* JADX INFO: renamed from: e */
    public final void m96952e(String str) {
        this.f286277c.m77924A(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m96953f(Class cls, Object obj) {
        this.f286279e = this.f286279e.mo31862Q(qpv0.f191387a.mo54112b(cls), obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m96954g(String str) {
        if (bm51.m29803n0(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (bm51.m29803n0(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        rth rthVar = new rth();
        rthVar.m76391l(null, str);
        this.f286275a = rthVar.m76382c();
    }
}
