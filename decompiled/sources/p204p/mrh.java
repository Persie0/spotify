package p204p;

import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class mrh implements ctd0, fhs {

    /* JADX INFO: renamed from: a */
    public final Object f146562a;

    /* JADX INFO: renamed from: b */
    public zk1 f146563b;

    /* JADX INFO: renamed from: c */
    public ehs f146564c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ orh f146565d;

    public mrh(orh orhVar, Object obj) {
        this.f146565d = orhVar;
        this.f146563b = orhVar.m89408e(null);
        this.f146564c = new ehs(orhVar.f256521d.f59657c, 0, null);
        this.f146562a = obj;
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: B */
    public final void mo33835B(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var, int i2) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            zk1Var.getClass();
            zk1Var.m96283j(new aod0(zk1Var, o0a0Var, lhd0VarM62643g, i2, 2));
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: C */
    public final void mo33836C(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            zk1Var.getClass();
            zk1Var.m96283j(new us30(22, zk1Var, lhd0VarM62643g));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: D */
    public final void mo40363D(int i, vsd0 vsd0Var, Exception exc) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m39002e(exc);
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: E */
    public final void mo41680E(int i, vsd0 vsd0Var) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m39003f();
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: J */
    public final void mo40364J(int i, vsd0 vsd0Var, m57 m57Var) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m38998a(m57Var);
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: S */
    public final void mo40365S(int i, vsd0 vsd0Var) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m38999b();
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: W */
    public final void mo41681W(int i, vsd0 vsd0Var, int i2) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m39001d(i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m62642a(int i, vsd0 vsd0Var) {
        vsd0 vsd0VarMo44601D;
        Object obj = this.f146562a;
        orh orhVar = this.f146565d;
        if (vsd0Var != null) {
            vsd0VarMo44601D = orhVar.mo44601D(obj, vsd0Var);
            if (vsd0VarMo44601D == null) {
                return false;
            }
        } else {
            vsd0VarMo44601D = null;
        }
        int iMo44603F = orhVar.mo44603F(i, obj);
        zk1 zk1Var = this.f146563b;
        if (zk1Var.f283580c != iMo44603F || !Objects.equals((vsd0) zk1Var.f283581d, vsd0VarMo44601D)) {
            this.f146563b = new zk1((Serializable) orhVar.f256520c.f283579b, iMo44603F, (Object) vsd0VarMo44601D, 20);
        }
        ehs ehsVar = this.f146564c;
        if (ehsVar.f59655a == iMo44603F && Objects.equals(ehsVar.f59656b, vsd0VarMo44601D)) {
            return true;
        }
        this.f146564c = new ehs(orhVar.f256521d.f59657c, iMo44603F, vsd0VarMo44601D);
        return true;
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: d */
    public final void mo33837d(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            zk1Var.getClass();
            zk1Var.m96283j(new zsd0(zk1Var, o0a0Var, lhd0VarM62643g, 0));
        }
    }

    /* JADX INFO: renamed from: g */
    public final lhd0 m62643g(lhd0 lhd0Var, vsd0 vsd0Var) {
        long j = lhd0Var.f133503f;
        orh orhVar = this.f146565d;
        Object obj = this.f146562a;
        long jMo44602E = orhVar.mo44602E(j, obj);
        long j2 = lhd0Var.f133504g;
        long jMo44602E2 = orhVar.mo44602E(j2, obj);
        return (jMo44602E == j && jMo44602E2 == j2) ? lhd0Var : new lhd0(lhd0Var.f133498a, lhd0Var.f133499b, lhd0Var.f133500c, lhd0Var.f133501d, lhd0Var.f133502e, jMo44602E, jMo44602E2);
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: m */
    public final void mo33838m(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            zk1Var.getClass();
            zk1Var.m96283j(new zsd0(zk1Var, o0a0Var, lhd0VarM62643g, 1));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: p */
    public final void mo40372p(int i, vsd0 vsd0Var) {
        if (m62642a(i, vsd0Var)) {
            this.f146564c.m39000c();
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: r */
    public final void mo33839r(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var, IOException iOException, boolean z) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            zk1Var.getClass();
            zk1Var.m96283j(new atd0(zk1Var, o0a0Var, lhd0VarM62643g, iOException, z));
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: u */
    public final void mo33840u(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        if (m62642a(i, vsd0Var)) {
            zk1 zk1Var = this.f146563b;
            lhd0 lhd0VarM62643g = m62643g(lhd0Var, vsd0Var);
            vsd0 vsd0Var2 = (vsd0) zk1Var.f283581d;
            vsd0Var2.getClass();
            zk1Var.m96283j(new jt4(zk1Var, vsd0Var2, lhd0VarM62643g, 17));
        }
    }
}
