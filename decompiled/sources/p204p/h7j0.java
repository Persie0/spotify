package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.music.R;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class h7j0 implements b7j0 {

    /* JADX INFO: renamed from: a */
    public final m500 f88467a;

    /* JADX INFO: renamed from: b */
    public final l5j0 f88468b;

    /* JADX INFO: renamed from: c */
    public final aii0 f88469c;

    /* JADX INFO: renamed from: d */
    public final wvp f88470d;

    /* JADX INFO: renamed from: e */
    public final ica f88471e;

    /* JADX INFO: renamed from: f */
    public final c7j0 f88472f;

    /* JADX INFO: renamed from: g */
    public final p7j0 f88473g;

    /* JADX INFO: renamed from: h */
    public final s5j0 f88474h;

    /* JADX INFO: renamed from: i */
    public final g9j0 f88475i;

    /* JADX INFO: renamed from: j */
    public final c700 f88476j;

    /* JADX INFO: renamed from: k */
    public final Handler f88477k = new Handler(Looper.getMainLooper());

    public h7j0(m500 m500Var, l5j0 l5j0Var, aii0 aii0Var, wvp wvpVar, ica icaVar, c7j0 c7j0Var, p7j0 p7j0Var, s5j0 s5j0Var, g9j0 g9j0Var) {
        this.f88467a = m500Var;
        this.f88468b = l5j0Var;
        this.f88469c = aii0Var;
        this.f88470d = wvpVar;
        this.f88471e = icaVar;
        this.f88472f = c7j0Var;
        this.f88473g = p7j0Var;
        this.f88474h = s5j0Var;
        this.f88475i = g9j0Var;
        this.f88476j = m500Var.mo15683g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final void m46766a(h7j0 h7j0Var, i500 i500Var, String str, String str2, String str3, boolean z, zzq0 zzq0Var) {
        String str4;
        c700 c700Var = h7j0Var.f88476j;
        c700Var.getClass();
        xi8 xi8Var = new xi8(c700Var);
        m46768m(h7j0Var, xi8Var, null, z, null, 5);
        h7j0Var.m46772k(xi8Var, f7j0.f66718c);
        h7j0Var.m46769d(xi8Var, i500Var, zzq0Var, null);
        xi8Var.m91097h();
        if (str != null) {
            str4 = str;
        } else {
            e600 e600Var = i500Var instanceof e600 ? (e600) i500Var : null;
            if (e600Var != null) {
                str = e600Var.mo24332k(h7j0Var.f88467a);
                str4 = str;
            } else {
                str4 = null;
            }
        }
        h7j0Var.m46775o(new i5j0(i500Var, new h600(str4, str2, str3, zzq0Var, null)));
        h7j0Var.f88468b.mo58247j();
        h7j0Var.f88470d.m89135a();
        h7j0Var.f88474h.m77277a(i500Var, zzq0Var instanceof yzq0 ? 5 : 1, false);
    }

    /* JADX INFO: renamed from: c */
    public static final void m46767c(h7j0 h7j0Var, zzq0 zzq0Var) throws Exception {
        i500 i500Var;
        s5j0 s5j0Var = h7j0Var.f88474h;
        boolean z = zzq0Var instanceof yzq0;
        if (z) {
            s5j0Var.m77280d();
        }
        k5j0 k5j0VarMo58245h = h7j0Var.f88468b.mo58245h();
        i5j0 i5j0Var = k5j0VarMo58245h instanceof i5j0 ? (i5j0) k5j0VarMo58245h : null;
        if (i5j0Var == null || (i500Var = i5j0Var.f98977a) == null) {
            return;
        }
        int i = i5j0Var.f98978b.f87943d instanceof yzq0 ? 5 : 1;
        if (z && i == 1) {
            s5j0Var.m77277a(i500Var, i, true);
        } else {
            s5j0Var.m77277a(i500Var, i, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m46768m(h7j0 h7j0Var, xi8 xi8Var, m05 m05Var, boolean z, zzq0 zzq0Var, int i) {
        if ((i & 1) != 0) {
            m05Var = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            zzq0Var = null;
        }
        if (h7j0Var.f88469c.m26103c() && (zzq0Var instanceof xzq0)) {
            nz4 nz4Var = ((xzq0) zzq0Var).f267737d;
            xi8Var.m91104o(nz4Var.mo63230c(), nz4Var.mo63231g(), 0, 0);
        } else if (m05Var != null && m05Var.f138513a) {
            xi8Var.m91104o(m05Var.f138516d, 0, 0, 0);
        } else if (z) {
            xi8Var.m91104o(R.anim.fade_in_hard, 0, 0, 0);
        }
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: b */
    public final void mo28380b() {
        l5j0 l5j0Var = this.f88468b;
        l5j0Var.mo58246i().clear();
        l5j0Var.mo58248k().clear();
    }

    /* JADX INFO: renamed from: d */
    public final void m46769d(xi8 xi8Var, i500 i500Var, zzq0 zzq0Var, String str) {
        if (i500Var.m49727z0()) {
            return;
        }
        xi8Var.m91100k(zzq0Var instanceof yzq0 ? R.id.fragment_overlay_container : R.id.fragment_container_host, i500Var, str, 1);
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: e */
    public final void mo28381e(String str, String str2, String str3, m05 m05Var, i500 i500Var, zzq0 zzq0Var, boolean z) {
        i530 i530Var = new i530(zzq0Var, this, i500Var, str, str2, str3, z, m05Var);
        if (!this.f88469c.m26102b()) {
            i530Var.invoke();
        } else {
            this.f88477k.post(new gdb(this, false, (eh00) i530Var));
        }
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: f */
    public final void mo28382f() {
        e7j0 e7j0Var = new e7j0(this, 1);
        if (!this.f88469c.m26102b()) {
            e7j0Var.invoke();
        } else {
            this.f88477k.post(new gdb(this, false, (eh00) e7j0Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX INFO: renamed from: g */
    public final void m46770g() {
        boolean z;
        h600 h600VarMo49777a;
        h600 h600VarMo49777a2;
        l5j0 l5j0Var = this.f88468b;
        k5j0 k5j0VarMo58245h = l5j0Var.mo58245h();
        zzq0 zzq0Var = null;
        this.f88472f.f34940b.mo33104m((k5j0VarMo58245h == null || (h600VarMo49777a2 = k5j0VarMo58245h.mo49777a()) == null) ? null : h600VarMo49777a2.f87940a);
        l5j0Var.mo58247j();
        this.f88470d.m89135a();
        p7j0 p7j0Var = this.f88473g;
        BehaviorSubject behaviorSubject = p7j0Var.f174708b;
        l5j0 l5j0Var2 = p7j0Var.f174707a;
        if (l5j0Var2.mo58248k().isEmpty()) {
            k5j0 k5j0VarMo58245h2 = l5j0Var2.mo58245h();
            if (k5j0VarMo58245h2 != null && (h600VarMo49777a = k5j0VarMo58245h2.mo49777a()) != null) {
                zzq0Var = h600VarMo49777a.f87943d;
            }
            if (zzq0Var instanceof yzq0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        behaviorSubject.onNext(Boolean.valueOf(z));
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: h */
    public final void mo28383h(i500 i500Var, String str, String str2, String str3, boolean z, zzq0 zzq0Var) {
        g7j0 g7j0Var = new g7j0(this, i500Var, str, str2, str3, z, zzq0Var);
        if (!this.f88469c.m26102b()) {
            g7j0Var.invoke();
        } else {
            this.f88477k.post(new gdb(this, false, (eh00) g7j0Var));
        }
    }

    @Override // p204p.b7j0
    /* JADX INFO: renamed from: i */
    public final void mo28384i(String str, i500 i500Var, String str2, String str3, String str4, boolean z, zzq0 zzq0Var) {
        i530 i530Var = new i530(str, this, i500Var, str2, str3, str4, z, zzq0Var);
        if (!this.f88469c.m26102b()) {
            i530Var.invoke();
        } else {
            this.f88477k.post(new gdb(this, false, (eh00) i530Var));
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m46771j(i500 i500Var, String str, String str2, String str3, boolean z, m05 m05Var, zzq0 zzq0Var, eh00 eh00Var) {
        c700 c700Var = this.f88476j;
        if (c700Var.f34659L) {
            return;
        }
        m46774n();
        eh00 ha40Var = new ha40(this, i500Var, str, str2, str3, zzq0Var, m05Var, 2);
        xi8 xi8Var = new xi8(c700Var);
        l5j0 l5j0Var = this.f88468b;
        if (z) {
            m46772k(xi8Var, f7j0.f66718c);
            m46773l(xi8Var, f7j0.f66721e);
            l5j0Var.mo58246i().clear();
            l5j0Var.mo58248k().clear();
        }
        boolean z2 = zzq0Var instanceof wzq0;
        ica icaVar = this.f88471e;
        if (z2) {
            ori0 ori0Var = ori0.f168599i;
            mii0 mii0Var = new mii0(11, ha40Var, eh00Var);
            l5j0Var.mo58249l(xi8Var, zzq0Var, c700Var, icaVar);
            ((x0p) icaVar).m89594h(i500Var, str3, new ooa0(this), mii0Var);
            ha40Var = ori0Var;
        } else {
            m46768m(this, xi8Var, m05Var, false, zzq0Var, 2);
            l5j0Var.mo58249l(xi8Var, zzq0Var, c700Var, icaVar);
            m46769d(xi8Var, i500Var, zzq0Var, str3);
        }
        xi8Var.m91097h();
        ha40Var.invoke();
    }

    /* JADX INFO: renamed from: k */
    public final void m46772k(xi8 xi8Var, gh00 gh00Var) {
        k5j0 k5j0VarMo58245h = this.f88468b.mo58245h();
        if (k5j0VarMo58245h != null) {
            if (k5j0VarMo58245h.mo49777a().f87943d instanceof wzq0) {
                ooa0 ooa0Var = new ooa0((Object) this.f88471e, 25);
                gh00Var.invoke(k5j0VarMo58245h);
                ooa0Var.invoke();
                m46775o(null);
                return;
            }
            i500 i500VarMo49778e = k5j0VarMo58245h.mo49778e();
            if (i500VarMo49778e == null || !i500VarMo49778e.m49727z0()) {
                return;
            }
            n5j0 n5j0Var = new n5j0(xi8Var, k5j0VarMo58245h, 2);
            gh00Var.invoke(k5j0VarMo58245h);
            n5j0Var.invoke();
            m46775o(null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m46773l(xi8 xi8Var, gh00 gh00Var) {
        l5j0 l5j0Var = this.f88468b;
        k5j0 k5j0VarMo58250m = l5j0Var.mo58250m();
        if (k5j0VarMo58250m != null) {
            if (k5j0VarMo58250m.mo49777a().f87943d instanceof wzq0) {
                ooa0 ooa0Var = new ooa0((Object) this.f88471e, 26);
                gh00Var.invoke(k5j0VarMo58250m);
                ooa0Var.invoke();
                l5j0Var.mo58253p(null);
                return;
            }
            i500 i500VarMo49778e = k5j0VarMo58250m.mo49778e();
            if (i500VarMo49778e == null || !i500VarMo49778e.m49727z0()) {
                return;
            }
            n5j0 n5j0Var = new n5j0(xi8Var, k5j0VarMo58250m, 3);
            gh00Var.invoke(k5j0VarMo58250m);
            n5j0Var.invoke();
            l5j0Var.mo58253p(null);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m46774n() {
        l5j0 l5j0Var = this.f88468b;
        if (l5j0Var.mo58246i().size() >= 30) {
            l5j0Var.mo58246i().removeLast();
        }
        if (l5j0Var.mo58248k().size() >= 30) {
            l5j0Var.mo58248k().removeLast();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m46775o(i5j0 i5j0Var) {
        h600 h600VarMo49777a;
        l5j0 l5j0Var = this.f88468b;
        l5j0Var.mo58240c(i5j0Var);
        k5j0 k5j0VarMo58245h = l5j0Var.mo58245h();
        this.f88472f.f34940b.mo33104m((k5j0VarMo58245h == null || (h600VarMo49777a = k5j0VarMo58245h.mo49777a()) == null) ? null : h600VarMo49777a.f87940a);
    }
}
