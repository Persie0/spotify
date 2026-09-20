package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class unb1 implements snb1 {

    /* JADX INFO: renamed from: a */
    public final ilb1 f232132a;

    /* JADX INFO: renamed from: b */
    public final boolean f232133b;

    /* JADX INFO: renamed from: c */
    public final boolean f232134c;

    /* JADX INFO: renamed from: d */
    public final boolean f232135d;

    /* JADX INFO: renamed from: e */
    public final boolean f232136e;

    /* JADX INFO: renamed from: f */
    public final int f232137f;

    public /* synthetic */ unb1(ilb1 ilb1Var, boolean z, int i) {
        this(ilb1Var, z, true, true, false, i);
    }

    /* JADX INFO: renamed from: g */
    public static unb1 m83542g(unb1 unb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        boolean z5 = z;
        ilb1 ilb1Var = unb1Var.f232132a;
        if ((i2 & 2) != 0) {
            z5 = unb1Var.f232133b;
        }
        if ((i2 & 4) != 0) {
            z2 = unb1Var.f232134c;
        }
        if ((i2 & 8) != 0) {
            z3 = unb1Var.f232135d;
        }
        unb1Var.getClass();
        if ((i2 & 32) != 0) {
            z4 = unb1Var.f232136e;
        }
        if ((i2 & 64) != 0) {
            i = unb1Var.f232137f;
        }
        int i3 = i;
        unb1Var.getClass();
        boolean z6 = z4;
        boolean z7 = z3;
        return new unb1(ilb1Var, z5, z2, z7, z6, i3);
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: a */
    public final ilb1 mo70434a() {
        return this.f232132a;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: b */
    public final int mo70435b() {
        return this.f232137f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: c */
    public final boolean mo70436c() {
        return this.f232136e;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: d */
    public final boolean mo70437d() {
        return this.f232135d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unb1)) {
            return false;
        }
        unb1 unb1Var = (unb1) obj;
        return wj50.m88271j(this.f232132a, unb1Var.f232132a) && this.f232133b == unb1Var.f232133b && this.f232134c == unb1Var.f232134c && this.f232135d == unb1Var.f232135d && this.f232136e == unb1Var.f232136e && this.f232137f == unb1Var.f232137f;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: f */
    public final boolean mo70438f() {
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232137f) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f232132a.hashCode() * 31, 31, this.f232133b), 31, this.f232134c), 31, this.f232135d), 31, false), 31, this.f232136e);
    }

    @Override // p204p.snb1
    public final boolean isVisible() {
        return this.f232134c;
    }

    @Override // p204p.snb1
    /* JADX INFO: renamed from: l */
    public final boolean mo70439l() {
        return this.f232133b;
    }

    public unb1(ilb1 ilb1Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.f232132a = ilb1Var;
        this.f232133b = z;
        this.f232134c = z2;
        this.f232135d = z3;
        this.f232136e = z4;
        this.f232137f = i;
    }
}
