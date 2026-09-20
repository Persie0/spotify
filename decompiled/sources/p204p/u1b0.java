package p204p;

import com.google.protobuf.Empty;
import com.spotify.libs.connect.events.proto.LogoutNonAuth;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class u1b0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final ui7 f225740a;

    /* JADX INFO: renamed from: b */
    public final si7 f225741b;

    /* JADX INFO: renamed from: c */
    public final g1b0 f225742c;

    /* JADX INFO: renamed from: d */
    public sh7 f225743d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f225744e = new AtomicReference(Boolean.FALSE);

    public u1b0(ui7 ui7Var, si7 si7Var, g1b0 g1b0Var) {
        this.f225740a = ui7Var;
        this.f225741b = si7Var;
        this.f225742c = g1b0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m82201a(eh00 eh00Var) {
        sh7 sh7Var = this.f225743d;
        if (sh7Var == null || !sh7Var.m78128a()) {
            return;
        }
        eh00Var.invoke();
    }

    /* JADX INFO: renamed from: b */
    public final void m82202b(sh7 sh7Var, int i) {
        int iM63480b;
        if (((Boolean) this.f225744e.getAndSet(Boolean.TRUE)).booleanValue()) {
            return;
        }
        this.f225743d = sh7Var;
        n1b0 n1b0Var = new n1b0(sh7Var, i);
        g1b0 g1b0Var = this.f225742c;
        qre0 qre0Var = g1b0Var.f75575a;
        r1b0 r1b0VarM12760s = LogoutNonAuth.m12760s();
        r1b0VarM12760s.m74481s();
        String strName = (n1b0Var.m63479a() != sh7.f209130e || (iM63480b = n1b0Var.m63480b()) == 0) ? n1b0Var.m63479a().name() : klh.m56834f(y8a0.m93109n(iM63480b), "-", n1b0Var.m63479a().name());
        r1b0VarM12760s.m74479q(strName);
        r1b0VarM12760s.m74478m(((edi0) g1b0Var.f75576b).f58524b);
        r1b0VarM12760s.m74482t();
        r1b0VarM12760s.m74480r();
        qre0Var.m73616a(r1b0VarM12760s.build());
        if (sh7Var != sh7.f209133h && sh7Var != sh7.f209119L0) {
            mi7 mi7Var = (mi7) this.f225741b.f209366b.getValue();
            mi7Var.f143951a.m74845e(Empty.m1933n()).map(new iq3(mi7Var, 1)).blockingGet();
        }
        this.f225740a.f230608c.onNext(new cm7(sh7Var));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}
