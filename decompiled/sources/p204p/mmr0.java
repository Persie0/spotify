package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class mmr0 {

    /* JADX INFO: renamed from: a */
    public final int f145230a;

    /* JADX INFO: renamed from: b */
    public final int f145231b;

    /* JADX INFO: renamed from: c */
    public final int f145232c;

    /* JADX INFO: renamed from: d */
    public final int f145233d;

    /* JADX INFO: renamed from: e */
    public final int f145234e;

    /* JADX INFO: renamed from: f */
    public final int f145235f;

    /* JADX INFO: renamed from: g */
    public final int f145236g;

    /* JADX INFO: renamed from: h */
    public final int f145237h;

    /* JADX INFO: renamed from: i */
    public final String f145238i;

    /* JADX INFO: renamed from: j */
    public final String f145239j;

    /* JADX INFO: renamed from: k */
    public final int f145240k;

    /* JADX INFO: renamed from: l */
    public final String f145241l;

    /* JADX INFO: renamed from: m */
    public final String f145242m;

    /* JADX INFO: renamed from: n */
    public final int f145243n;

    public mmr0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, int i9, String str3, String str4, int i10, int i11) {
        i = (i11 & 1) != 0 ? 0 : i;
        int i12 = (i11 & 2) != 0 ? 0 : i2;
        int i13 = (i11 & 4) != 0 ? 0 : i3;
        int i14 = (i11 & 8) == 0 ? i4 : 0;
        int i15 = (i11 & 16) != 0 ? -1 : i5;
        int i16 = (i11 & 32) != 0 ? -1 : i6;
        int i17 = (i11 & 64) != 0 ? -1 : i7;
        int i18 = (i11 & 128) != 0 ? -1 : i8;
        String str5 = (i11 & 256) != 0 ? "not_available" : str;
        String str6 = (i11 & 512) != 0 ? "not_available" : str2;
        int i19 = (i11 & 1024) == 0 ? i9 : -1;
        String str7 = (i11 & 2048) != 0 ? "not_available" : str3;
        String str8 = (i11 & 4096) == 0 ? str4 : "not_available";
        this.f145230a = i;
        this.f145231b = i12;
        this.f145232c = i13;
        this.f145233d = i14;
        this.f145234e = i15;
        this.f145235f = i16;
        this.f145236g = i17;
        this.f145237h = i18;
        this.f145238i = str5;
        this.f145239j = str6;
        this.f145240k = i19;
        this.f145241l = str7;
        this.f145242m = str8;
        this.f145243n = i10;
    }

    /* JADX INFO: renamed from: a */
    public final String m62323a() {
        return this.f145238i;
    }

    /* JADX INFO: renamed from: b */
    public final String m62324b() {
        return this.f145241l;
    }

    /* JADX INFO: renamed from: c */
    public final int m62325c() {
        return this.f145234e;
    }

    /* JADX INFO: renamed from: d */
    public final int m62326d() {
        return this.f145236g;
    }

    /* JADX INFO: renamed from: e */
    public final int m62327e() {
        return this.f145233d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmr0)) {
            return false;
        }
        mmr0 mmr0Var = (mmr0) obj;
        return this.f145230a == mmr0Var.f145230a && this.f145231b == mmr0Var.f145231b && this.f145232c == mmr0Var.f145232c && this.f145233d == mmr0Var.f145233d && this.f145234e == mmr0Var.f145234e && this.f145235f == mmr0Var.f145235f && this.f145236g == mmr0Var.f145236g && this.f145237h == mmr0Var.f145237h && wj50.m88271j(this.f145238i, mmr0Var.f145238i) && wj50.m88271j(this.f145239j, mmr0Var.f145239j) && this.f145240k == mmr0Var.f145240k && wj50.m88271j(this.f145241l, mmr0Var.f145241l) && wj50.m88271j(this.f145242m, mmr0Var.f145242m) && this.f145243n == mmr0Var.f145243n;
    }

    /* JADX INFO: renamed from: f */
    public final int m62328f() {
        return this.f145232c;
    }

    /* JADX INFO: renamed from: g */
    public final int m62329g() {
        return this.f145240k;
    }

    /* JADX INFO: renamed from: h */
    public final int m62330h() {
        return this.f145235f;
    }

    public final int hashCode() {
        return edb.m38547C(this.f145243n) + s571.m77243b(s571.m77243b(mt60.m62800g(this.f145240k, s571.m77243b(s571.m77243b(mt60.m62800g(this.f145237h, mt60.m62800g(this.f145236g, mt60.m62800g(this.f145235f, mt60.m62800g(this.f145234e, mt60.m62800g(this.f145233d, mt60.m62800g(this.f145232c, mt60.m62800g(this.f145231b, Integer.hashCode(this.f145230a) * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f145238i), 31, this.f145239j), 31), 31, this.f145241l), 31, this.f145242m);
    }

    /* JADX INFO: renamed from: i */
    public final int m62331i() {
        return this.f145237h;
    }

    /* JADX INFO: renamed from: j */
    public final int m62332j() {
        return this.f145243n;
    }

    /* JADX INFO: renamed from: k */
    public final String m62333k() {
        return this.f145239j;
    }

    /* JADX INFO: renamed from: l */
    public final String m62334l() {
        return this.f145242m;
    }

    /* JADX INFO: renamed from: m */
    public final int m62335m() {
        return this.f145231b;
    }

    /* JADX INFO: renamed from: n */
    public final int m62336n() {
        return this.f145230a;
    }
}
