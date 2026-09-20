package p204p;

import com.spotify.canvaslogger.events.proto.CanvasLoad;
import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutCompleted;
import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class qp0 {

    /* JADX INFO: renamed from: a */
    public final qre0 f191108a;

    public /* synthetic */ qp0(qre0 qre0Var) {
        this.f191108a = qre0Var;
    }

    /* JADX INFO: renamed from: e */
    public static String m73407e(String str) {
        return edb.m38564m("checkoutSessionId:", str);
    }

    /* JADX INFO: renamed from: a */
    public void m73408a(String str, String str2, int i, String str3, tmw0 tmw0Var) {
        String strM81147a;
        u0b u0bVarM11196s = CPGpbCheckoutCompleted.m11196s();
        u0bVarM11196s.m82115m(str2);
        u0bVarM11196s.m82116q(m73407e(str));
        if (tmw0Var == null || (strM81147a = tmw0Var.m81147a()) == null) {
            strM81147a = "NONE";
        }
        u0bVarM11196s.m82118s(strM81147a);
        u0bVarM11196s.m82119t(o7t0.m66388b(i));
        if (str3 != null) {
            u0bVarM11196s.m82117r(str3);
        }
        this.f191108a.m73616a(u0bVarM11196s.build());
    }

    /* JADX INFO: renamed from: b */
    public void m73409b(psb psbVar, String str, String str2, String str3) {
        csb csbVarM5525s = CanvasLoad.m5525s();
        csbVarM5525s.m33764q(psbVar.m70770a());
        csbVarM5525s.m33765r(psbVar.m70771b());
        csbVarM5525s.m33766s(str);
        csbVarM5525s.m33767t();
        if (str2 != null && str2.length() != 0) {
            csbVarM5525s.m33763m("error_reason", str2);
        }
        if (str3 != null && str3.length() != 0) {
            csbVarM5525s.m33763m("error_detail", str3);
        }
        this.f191108a.m73616a(csbVarM5525s.build());
    }

    /* JADX INFO: renamed from: c */
    public void m73410c(m761 m761Var, int i, String str, int i2, String str2, String str3) {
        q180 q180VarM12550u = LeavebehindAdEvent.m12550u();
        if (str2 == null) {
            str2 = "";
        }
        q180VarM12550u.m71874r(str2);
        if (str3 == null) {
            str3 = "";
        }
        q180VarM12550u.m71875s(str3);
        q180VarM12550u.m71872m(p1v.m68850g(2));
        q180VarM12550u.m71873q(j4x.m52403a(i));
        q180VarM12550u.m71876t(m761Var.m61049a());
        q180VarM12550u.m71877u(i2 + 1);
        q180VarM12550u.m71878v(str);
        this.f191108a.m73616a(q180VarM12550u.build());
    }

    /* JADX INFO: renamed from: d */
    public void m73411d(int i, String str, String str2, String str3, m761 m761Var) {
        q180 q180VarM12550u = LeavebehindAdEvent.m12550u();
        if (str2 == null) {
            str2 = "";
        }
        q180VarM12550u.m71874r(str2);
        if (str3 == null) {
            str3 = "";
        }
        q180VarM12550u.m71875s(str3);
        q180VarM12550u.m71872m(p1v.m68850g(1));
        q180VarM12550u.m71873q("");
        q180VarM12550u.m71876t(m761Var.m61049a());
        q180VarM12550u.m71877u(i + 1);
        q180VarM12550u.m71878v(str);
        this.f191108a.m73616a(q180VarM12550u.build());
    }

    public qp0(qre0 qre0Var, sp5 sp5Var) {
        this.f191108a = qre0Var;
    }
}
