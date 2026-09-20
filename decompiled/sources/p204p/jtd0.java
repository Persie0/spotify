package p204p;

import android.util.Pair;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class jtd0 implements ctd0, fhs {

    /* JADX INFO: renamed from: a */
    public final ltd0 f115818a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mtd0 f115819b;

    public jtd0(mtd0 mtd0Var, ltd0 ltd0Var) {
        this.f115819b = mtd0Var;
        this.f115818a = ltd0Var;
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: B */
    public final void mo33835B(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var, int i2) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new cqd0(this, pairM54284a, o0a0Var, lhd0Var, i2));
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: C */
    public final void mo33836C(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new ftd0(this, pairM54284a, lhd0Var, 1));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: D */
    public final void mo40363D(int i, vsd0 vsd0Var, Exception exc) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new kgd0(this, pairM54284a, exc, 8));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: E */
    public final void mo41680E(int i, vsd0 vsd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new htd0(this, pairM54284a, 0));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: J */
    public final void mo40364J(int i, vsd0 vsd0Var, m57 m57Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new kgd0(this, pairM54284a, m57Var, 7));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: S */
    public final void mo40365S(int i, vsd0 vsd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new htd0(this, pairM54284a, 1));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: W */
    public final void mo41681W(int i, vsd0 vsd0Var, int i2) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new scb(this, pairM54284a, i2, 11));
        }
    }

    /* JADX INFO: renamed from: a */
    public final Pair m54284a(int i, vsd0 vsd0Var) {
        vsd0 vsd0VarM86307a;
        ltd0 ltd0Var = this.f115818a;
        vsd0 vsd0Var2 = null;
        if (vsd0Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= ltd0Var.f136761c.size()) {
                    vsd0VarM86307a = null;
                    break;
                }
                if (((vsd0) ltd0Var.f136761c.get(i2)).f244411d == vsd0Var.f244411d) {
                    Object obj = vsd0Var.f244408a;
                    Object obj2 = ltd0Var.f136760b;
                    int i3 = jtp0.f115937n;
                    vsd0VarM86307a = vsd0Var.m86307a(Pair.create(obj2, obj));
                    break;
                }
                i2++;
            }
            if (vsd0VarM86307a == null) {
                return null;
            }
            vsd0Var2 = vsd0VarM86307a;
        }
        return Pair.create(Integer.valueOf(i + ltd0Var.f136762d), vsd0Var2);
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: d */
    public final void mo33837d(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new itd0(this, pairM54284a, o0a0Var, lhd0Var, 1));
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: m */
    public final void mo33838m(int i, vsd0 vsd0Var, o0a0 o0a0Var, lhd0 lhd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new itd0(this, pairM54284a, o0a0Var, lhd0Var, 0));
        }
    }

    @Override // p204p.fhs
    /* JADX INFO: renamed from: p */
    public final void mo40372p(int i, vsd0 vsd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new htd0(this, pairM54284a, 2));
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: r */
    public final void mo33839r(int i, vsd0 vsd0Var, final o0a0 o0a0Var, final lhd0 lhd0Var, final IOException iOException, final boolean z) {
        final Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new Runnable() { // from class: p.gtd0
                @Override // java.lang.Runnable
                public final void run() {
                    xwo xwoVar = this.f84146a.f115819b.f147053i;
                    Pair pair = pairM54284a;
                    xwoVar.mo33839r(((Integer) pair.first).intValue(), (vsd0) pair.second, o0a0Var, lhd0Var, iOException, z);
                }
            });
        }
    }

    @Override // p204p.ctd0
    /* JADX INFO: renamed from: u */
    public final void mo33840u(int i, vsd0 vsd0Var, lhd0 lhd0Var) {
        Pair pairM54284a = m54284a(i, vsd0Var);
        if (pairM54284a != null) {
            this.f115819b.f147054j.m56388f(new ftd0(this, pairM54284a, lhd0Var, 0));
        }
    }
}
