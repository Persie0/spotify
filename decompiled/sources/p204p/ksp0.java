package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ksp0 implements msp0 {

    /* JADX INFO: renamed from: a */
    public final String f125989a;

    /* JADX INFO: renamed from: b */
    public final String f125990b;

    /* JADX INFO: renamed from: c */
    public final String f125991c;

    /* JADX INFO: renamed from: d */
    public final pla1 f125992d;

    /* JADX INFO: renamed from: e */
    public final String f125993e;

    /* JADX INFO: renamed from: f */
    public final boolean f125994f;

    public ksp0(String str, String str2, String str3, pla1 pla1Var, String str4, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? "" : str2;
        pla1Var = (i & 8) != 0 ? new pla1("", "", 12, (String) null) : pla1Var;
        str4 = (i & 16) != 0 ? "" : str4;
        boolean z = (i & 32) == 0;
        this.f125989a = str;
        this.f125990b = str2;
        this.f125991c = str3;
        this.f125992d = pla1Var;
        this.f125993e = str4;
        this.f125994f = z;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: a */
    public final String mo54250a() {
        return this.f125993e;
    }

    @Override // p204p.msp0
    /* JADX INFO: renamed from: e */
    public final String mo54251e() {
        return this.f125990b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksp0)) {
            return false;
        }
        ksp0 ksp0Var = (ksp0) obj;
        return wj50.m88271j(this.f125989a, ksp0Var.f125989a) && wj50.m88271j(this.f125990b, ksp0Var.f125990b) && wj50.m88271j(this.f125991c, ksp0Var.f125991c) && wj50.m88271j(this.f125992d, ksp0Var.f125992d) && wj50.m88271j(this.f125993e, ksp0Var.f125993e) && this.f125994f == ksp0Var.f125994f;
    }

    @Override // p204p.msp0
    public final String getId() {
        return this.f125989a;
    }

    @Override // p204p.msp0
    public final String getPlaylistUri() {
        return this.f125991c;
    }

    @Override // p204p.msp0
    public final pla1 getSender() {
        return this.f125992d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f125994f) + s571.m77243b(ydj.m93448g(this.f125992d, s571.m77243b(s571.m77243b(this.f125989a.hashCode() * 31, 31, this.f125990b), 31, this.f125991c), 31), 31, this.f125993e);
    }
}
