package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wa0 extends od11 {

    /* JADX INFO: renamed from: a */
    public a911 f249308a;

    /* JADX INFO: renamed from: b */
    public final yum0 f249309b;

    public wa0(a911 a911Var, tiv0 tiv0Var) {
        this.f249308a = a911Var;
        this.f249309b = sam.m77645B(tiv0Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d A[PHI: r1
      0x004d: PHI (r1v2 p.tiv0) = (r1v1 p.tiv0), (r1v8 p.tiv0) binds: [B:3:0x0010, B:19:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p204p.od11
    /* JADX INFO: renamed from: a */
    public final od11 mo66731a(bb11 bb11Var, a911 a911Var, long j, long j2, long j3) {
        Object obj;
        be41 be41Var = new be41(j, Offset.m256f(j2, j3), j3);
        tiv0 tiv0VarMo66733c = mo66733c();
        if (tiv0VarMo66733c == null) {
            a911 a911Var2 = this.f249308a;
            if (a911Var2 == null) {
                List listM28608b = bb11Var.m28608b();
                int size = listM28608b.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listM28608b.get(i);
                    if (bb11Var.m28609c().contains((cb11) obj)) {
                        break;
                    }
                    i++;
                }
                cb11 cb11Var = (cb11) obj;
                a911Var2 = cb11Var != null ? cb11Var.f35968Y : null;
            }
            tiv0VarMo66733c = oxg1.m68213f(bb11Var, a911Var2);
            if (tiv0VarMo66733c == null) {
                tiv0VarMo66733c = q0f1.m71836j(j2, j);
            }
        }
        tiv0 tiv0Var = tiv0VarMo66733c;
        oxg1.m68214g(be41Var, j, j2, j3, true);
        return new va0(be41Var, a911Var, tiv0Var);
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: b */
    public final boolean mo66732b() {
        return true;
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: c */
    public final tiv0 mo66733c() {
        return (tiv0) this.f249309b.getValue();
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: e */
    public final be41 mo66735e() {
        return null;
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: f */
    public final tiv0 mo66736f(bb11 bb11Var) {
        Object obj;
        tiv0 tiv0VarMo66733c = mo66733c();
        if (tiv0VarMo66733c != null) {
            return tiv0VarMo66733c;
        }
        if (mo66733c() == null) {
            a911 a911Var = this.f249308a;
            if (a911Var == null) {
                List listM28608b = bb11Var.m28608b();
                int size = listM28608b.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = listM28608b.get(i);
                    if (bb11Var.m28609c().contains((cb11) obj)) {
                        break;
                    }
                    i++;
                }
                cb11 cb11Var = (cb11) obj;
                a911Var = cb11Var != null ? cb11Var.f35968Y : null;
            }
            tiv0 tiv0VarM68213f = oxg1.m68213f(bb11Var, a911Var);
            if (tiv0VarM68213f != null) {
                this.f249309b.setValue(tiv0VarM68213f);
            }
        }
        return mo66733c();
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: g */
    public final od11 mo66737g(a911 a911Var) {
        if (this.f249308a == null) {
            this.f249308a = a911Var;
        }
        return this;
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: h */
    public final od11 mo66738h() {
        return qkj0.f189580a;
    }

    @Override // p204p.od11
    /* JADX INFO: renamed from: i */
    public final void mo66739i(tiv0 tiv0Var) {
        this.f249309b.setValue(tiv0Var);
    }
}
