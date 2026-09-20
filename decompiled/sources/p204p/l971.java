package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class l971 {

    /* JADX INFO: renamed from: a */
    public final dh31 f131022a;

    /* JADX INFO: renamed from: b */
    public t571 f131023b;

    /* JADX INFO: renamed from: c */
    public final yum0 f131024c;

    /* JADX INFO: renamed from: d */
    public final yum0 f131025d;

    /* JADX INFO: renamed from: e */
    public final yum0 f131026e;

    /* JADX INFO: renamed from: f */
    public final py51 f131027f;

    /* JADX INFO: renamed from: g */
    public final qqi0 f131028g;

    public l971(String str, long j, dh31 dh31Var) {
        this.f131022a = dh31Var;
        this.f131023b = new t571(new u571(str, dvg1.m37114p(str.length(), j), null, null, null, null, 60), null, null, null, 14);
        Boolean bool = Boolean.FALSE;
        this.f131024c = sam.m77645B(bool);
        this.f131025d = sam.m77645B(new u571(str, j, null, null, null, null, 60));
        this.f131026e = sam.m77645B(bool);
        this.f131027f = new py51(this, 10);
        this.f131028g = new qqi0(0, new j971[16]);
    }

    /* JADX INFO: renamed from: a */
    public static final void m58497a(l971 l971Var, uw40 uw40Var, boolean z, int i) {
        u571 u571VarM58500d = l971Var.m58500d();
        if (l971Var.f131023b.m80094c().m31896x() == 0 && ic71.m50235c(u571VarM58500d.f226936d, l971Var.f131023b.m80099h())) {
            if (wj50.m88271j(u571VarM58500d.f226937e, l971Var.f131023b.m80097f()) && wj50.m88271j(u571VarM58500d.f226938f, l971Var.f131023b.m80098g()) && wj50.m88271j(u571VarM58500d.f226933a, l971Var.f131023b.m80096e())) {
                return;
            }
            l971Var.m58505i(l971Var.m58500d(), new u571(l971Var.f131023b.toString(), l971Var.f131023b.m80099h(), l971Var.f131023b.m80097f(), l971Var.f131023b.m80098g(), vtg1.m86383j(l971Var.f131023b.m80097f(), l971Var.f131023b.m80096e()), null, 32), z);
            return;
        }
        boolean z2 = false;
        boolean z3 = l971Var.f131023b.m80094c().m31896x() != 0;
        u571 u571Var = new u571(l971Var.f131023b.toString(), l971Var.f131023b.m80099h(), l971Var.f131023b.m80097f(), l971Var.f131023b.m80098g(), vtg1.m86383j(l971Var.f131023b.m80097f(), l971Var.f131023b.m80096e()), null, 32);
        if (uw40Var == null) {
            if (z3 && z) {
                z2 = true;
            }
            l971Var.m58505i(u571VarM58500d, u571Var, z2);
            l971Var.m58501e(u571VarM58500d, u571Var, l971Var.f131023b.m80094c(), i);
            return;
        }
        t571 t571Var = new t571(u571Var, l971Var.f131023b.m80094c(), u571VarM58500d, null, 8);
        uw40Var.mo33950i(t571Var);
        boolean zM29794e0 = bm51.m29794e0(t571Var.m80092a(), u571Var);
        boolean z4 = !zM29794e0;
        boolean zM50235c = ic71.m50235c(t571Var.m80099h(), u571Var.f226936d);
        boolean z5 = !zM50235c;
        if (zM29794e0 && zM50235c) {
            l971Var.m58505i(u571VarM58500d, t571.m80091o(t571Var, 0L, u571Var.f226937e, 13), z);
        } else {
            l971Var.m58504h(t571Var, z4, z5);
        }
        l971Var.m58501e(u571VarM58500d, l971Var.m58500d(), t571Var.m80095d(), i);
    }

    /* JADX INFO: renamed from: b */
    public final void m58498b(t571 t571Var) {
        boolean z = t571Var.m80095d().m31896x() > 0;
        boolean zM50235c = true ^ ic71.m50235c(t571Var.m80099h(), this.f131023b.m80099h());
        if (z) {
            m58501e(m58500d(), t571.m80091o(t571Var, 0L, null, 15), t571Var.m80095d(), 3);
        }
        m58504h(t571Var, z, zM50235c);
    }

    /* JADX INFO: renamed from: c */
    public final void m58499c() {
        this.f131024c.setValue(Boolean.FALSE);
        m58502f(false);
    }

    /* JADX INFO: renamed from: d */
    public final u571 m58500d() {
        return (u571) this.f131025d.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m58501e(u571 u571Var, u571 u571Var2, c97 c97Var, int i) {
        int iM38547C = edb.m38547C(i);
        dh31 dh31Var = this.f131022a;
        if (iM38547C == 0) {
            jwg1.m54447B(dh31Var, u571Var, u571Var2, c97Var, true);
        } else if (iM38547C == 1) {
            dh31Var.m35970f();
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            jwg1.m54447B(dh31Var, u571Var, u571Var2, c97Var, false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m58502f(boolean z) {
        this.f131026e.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final t571 m58503g() {
        yum0 yum0Var = this.f131024c;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            boolean zBooleanValue = ((Boolean) yum0Var.getValue()).booleanValue();
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            if (zBooleanValue) {
                pt40.m70893c("TextFieldState does not support concurrent or nested editing.");
            }
            yum0Var.setValue(Boolean.TRUE);
            return new t571(m58500d(), null, null, null, 14);
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m58504h(t571 t571Var, boolean z, boolean z2) {
        u571 u571VarM80091o = t571.m80091o(this.f131023b, 0L, null, 15);
        if (z) {
            this.f131023b = new t571(new u571(t571Var.toString(), t571Var.m80099h(), null, null, null, null, 60), null, null, null, 14);
        } else if (z2) {
            t571 t571Var2 = this.f131023b;
            long jM80099h = t571Var.m80099h();
            int i = ic71.f100751c;
            t571Var2.m80105n(dvg1.m37112n((int) (jM80099h >> 32), (int) (t571Var.m80099h() & 4294967295L)));
        }
        if (z || z2 || !wj50.m88271j(u571VarM80091o.f226937e, t571Var.m80097f())) {
            this.f131023b.m80093b();
        }
        m58505i(u571VarM80091o, t571.m80091o(this.f131023b, 0L, null, 15), true);
    }

    /* JADX INFO: renamed from: i */
    public final void m58505i(u571 u571Var, u571 u571Var2, boolean z) {
        this.f131025d.setValue(u571Var2);
        qqi0 qqi0Var = this.f131028g;
        Object[] objArr = qqi0Var.f191608a;
        int i = qqi0Var.f191610c;
        for (int i2 = 0; i2 < i; i2++) {
            ((j971) objArr[i2]).mo51429a(u571Var, u571Var2, (!z || bm51.m29794e0(u571Var.f226935c, u571Var2) || u571Var.f226937e == null) ? false : true);
        }
        m58502f(false);
    }

    public final String toString() {
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            return "TextFieldState(selection=" + ((Object) ic71.m50241i(m58500d().f226936d)) + ", text=\"" + ((Object) m58500d().f226935c) + "\")";
        } finally {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l971(String str, int i) {
        str = (i & 1) != 0 ? "" : str;
        this(str, dvg1.m37111m(str.length()));
    }

    public l971(String str, long j) {
        this(str, j, new dh31());
    }
}
