package p204p;

import android.os.SystemClock;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class rxo implements cq6 {

    /* JADX INFO: renamed from: a */
    public final pu61 f203644a;

    /* JADX INFO: renamed from: b */
    public final zp6 f203645b;

    /* JADX INFO: renamed from: c */
    public final n95 f203646c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f203647d;

    /* JADX INFO: renamed from: e */
    public final n5b1 f203648e;

    /* JADX INFO: renamed from: f */
    public xpi0 f203649f;

    /* JADX INFO: renamed from: g */
    public aq6 f203650g;

    public rxo(n95 n95Var, boolean z) {
        zp6 zp6Var;
        pu61 kicVar = z ? new kic(0) : new okj0(6);
        if (z) {
            xpi0 xpi0Var = new xpi0();
            ae41 ae41Var = new ae41(10);
            ae41Var.f14749b = xpi0Var;
            ae41Var.f14750c = ae41Var.m25672n(xpi0Var.m91707c());
            zp6Var = ae41Var;
        } else {
            xpi0 xpi0Var2 = new xpi0();
            rk80 rk80Var = new rk80();
            float f = 0.15f * xpi0Var2.f264676f;
            rk80Var.f200023a = f;
            rk80Var.f200024b = f;
            rk80Var.f200025c = xpi0Var2;
            rk80Var.f200026d = new xpi0(0.0f, f, xpi0Var2.f264675e, 1.0f + f);
            zp6Var = rk80Var;
        }
        this.f203644a = kicVar;
        this.f203645b = zp6Var;
        this.f203646c = n95Var;
        this.f203647d = new LinkedHashSet();
        this.f203648e = new n5b1();
        kicVar.mo56486h(new jsa(this, 29));
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: a */
    public final void mo33595a(bq6 bq6Var) {
        this.f203647d.remove(bq6Var);
        aq6 aq6Var = this.f203650g;
        if (aq6Var != null) {
            bq6Var.mo30183a(aq6Var);
        }
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: c */
    public final void mo33596c(aq6 aq6Var) {
        this.f203644a.mo56489l(aq6Var);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: d */
    public final void mo33597d(bq6 bq6Var) {
        this.f203647d.add(bq6Var);
        aq6 aq6Var = this.f203650g;
        if (aq6Var != null) {
            bq6Var.mo30184b(aq6Var);
        }
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: e */
    public final void mo33598e(aq6 aq6Var) {
        this.f203644a.mo56484f(aq6Var);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [p.gh00, p.qe70] */
    @Override // p204p.cq6
    /* JADX INFO: renamed from: g */
    public final void mo33599g(int i, Float f, Float f2, float f3) {
        int i2;
        float f4;
        xpi0 xpi0Var = this.f203649f;
        if (xpi0Var == null) {
            n95 n95Var = this.f203646c;
            xpi0 xpi0Var2 = (xpi0) n95Var.f151718b;
            if (xpi0Var2 == null) {
                xpi0Var2 = new xpi0();
                ((qe70) n95Var.f151717a).invoke(xpi0Var2);
                n95Var.f151718b = xpi0Var2;
            }
            xpi0Var = xpi0Var2;
        }
        pu61 pu61Var = this.f203644a;
        pu61Var.mo56485g(xpi0Var);
        zp6 zp6Var = this.f203645b;
        zp6Var.mo25665g(xpi0Var);
        zp6Var.mo25663e(i, f, f2);
        long jUptimeMillis = SystemClock.uptimeMillis();
        float f5 = i;
        n5b1 n5b1Var = this.f203648e;
        n5b1Var.getClass();
        double[] dArr = n5b1Var.f150519b;
        long[] jArr = n5b1Var.f150518a;
        long j = jUptimeMillis - 300;
        while (true) {
            i2 = n5b1Var.f150521d;
            if (i2 <= 0) {
                break;
            }
            int i3 = n5b1Var.f150520c;
            if (jArr[i3] >= j) {
                break;
            }
            n5b1Var.f150520c = (i3 + 1) % 20;
            n5b1Var.f150521d = i2 - 1;
        }
        if (i2 == 0) {
            n5b1Var.f150522e = 0.0d;
            n5b1Var.f150523f = 0.0f;
        }
        double d = n5b1Var.f150522e + ((double) f5);
        n5b1Var.f150522e = d;
        if (i2 == 20) {
            n5b1Var.f150520c = (n5b1Var.f150520c + 1) % 20;
            n5b1Var.f150521d = i2 - 1;
        }
        int i4 = n5b1Var.f150520c;
        int i5 = n5b1Var.f150521d;
        int i6 = (i4 + i5) % 20;
        jArr[i6] = jUptimeMillis;
        dArr[i6] = d;
        n5b1Var.f150521d = i5 + 1;
        xpi0 xpi0VarMo25669k = zp6Var.mo25669k();
        int i7 = n5b1Var.f150521d;
        if (i7 < 2) {
            f4 = 0.0f;
        } else {
            int i8 = n5b1Var.f150520c;
            int i9 = ((i7 + i8) - 1) % 20;
            long j2 = jArr[i9] - jArr[i8];
            if (j2 <= 0) {
                f4 = n5b1Var.f150523f;
            } else {
                f4 = (float) (((((double) 1) - 0.8d) * ((double) n5b1Var.f150523f)) + (((double) ((float) (((dArr[i9] - dArr[i8]) / j2) * 1000.0d))) * 0.8d));
                n5b1Var.f150523f = f4;
            }
        }
        pu61Var.mo56487j(xpi0VarMo25669k, f4 / f3);
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: h */
    public final void mo33600h(xpi0 xpi0Var) {
        this.f203649f = xpi0Var;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [p.gh00, p.qe70] */
    @Override // p204p.cq6
    /* JADX INFO: renamed from: i */
    public final void mo33601i(Float f, Float f2, float f3) {
        xpi0 xpi0Var = this.f203649f;
        if (xpi0Var == null) {
            n95 n95Var = this.f203646c;
            xpi0 xpi0Var2 = (xpi0) n95Var.f151718b;
            if (xpi0Var2 == null) {
                xpi0Var2 = new xpi0();
                ((qe70) n95Var.f151717a).invoke(xpi0Var2);
                n95Var.f151718b = xpi0Var2;
            }
            xpi0Var = xpi0Var2;
        }
        pu61 pu61Var = this.f203644a;
        pu61Var.mo56485g(xpi0Var);
        zp6 zp6Var = this.f203645b;
        zp6Var.mo25665g(xpi0Var);
        zp6Var.mo25663e(0, f, f2);
        n5b1 n5b1Var = this.f203648e;
        n5b1Var.f150520c = 0;
        n5b1Var.f150521d = 0;
        n5b1Var.f150522e = 0.0d;
        n5b1Var.f150523f = 0.0f;
        pu61Var.mo56490n(zp6Var.mo25669k());
    }

    @Override // p204p.cq6
    /* JADX INFO: renamed from: j */
    public final void mo33602j(aq6 aq6Var, xpi0 xpi0Var) {
        this.f203644a.mo56488k(aq6Var, xpi0Var);
    }
}
