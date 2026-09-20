package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class cuv0 {

    /* JADX INFO: renamed from: a */
    public final String f42228a;

    /* JADX INFO: renamed from: b */
    public final String f42229b;

    /* JADX INFO: renamed from: c */
    public final String f42230c;

    /* JADX INFO: renamed from: d */
    public final int f42231d;

    /* JADX INFO: renamed from: e */
    public final boolean f42232e;

    /* JADX INFO: renamed from: f */
    public final boolean f42233f;

    /* JADX INFO: renamed from: g */
    public final boolean f42234g;

    /* JADX INFO: renamed from: h */
    public final boolean f42235h;

    /* JADX INFO: renamed from: i */
    public final boolean f42236i;

    /* JADX INFO: renamed from: j */
    public final String f42237j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f42238k;

    /* JADX INFO: renamed from: l */
    public final boolean f42239l;

    public cuv0(String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str4, ArrayList arrayList, boolean z6) {
        this.f42228a = str;
        this.f42229b = str2;
        this.f42230c = str3;
        this.f42231d = i;
        this.f42232e = z;
        this.f42233f = z2;
        this.f42234g = z3;
        this.f42235h = z4;
        this.f42236i = z5;
        this.f42237j = str4;
        this.f42238k = arrayList;
        this.f42239l = z6;
    }

    /* JADX INFO: renamed from: a */
    public static cuv0 m33951a(cuv0 cuv0Var, boolean z) {
        String str = cuv0Var.f42228a;
        String str2 = cuv0Var.f42229b;
        String str3 = cuv0Var.f42230c;
        int i = cuv0Var.f42231d;
        boolean z2 = cuv0Var.f42233f;
        boolean z3 = cuv0Var.f42234g;
        boolean z4 = cuv0Var.f42235h;
        boolean z5 = cuv0Var.f42236i;
        String str4 = cuv0Var.f42237j;
        ArrayList arrayList = cuv0Var.f42238k;
        boolean z6 = cuv0Var.f42239l;
        cuv0Var.getClass();
        return new cuv0(str, str2, str3, i, z, z2, z3, z4, z5, str4, arrayList, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuv0)) {
            return false;
        }
        cuv0 cuv0Var = (cuv0) obj;
        return this.f42228a.equals(cuv0Var.f42228a) && this.f42229b.equals(cuv0Var.f42229b) && this.f42230c.equals(cuv0Var.f42230c) && this.f42231d == cuv0Var.f42231d && this.f42232e == cuv0Var.f42232e && this.f42233f == cuv0Var.f42233f && this.f42234g == cuv0Var.f42234g && this.f42235h == cuv0Var.f42235h && this.f42236i == cuv0Var.f42236i && this.f42237j.equals(cuv0Var.f42237j) && this.f42238k.equals(cuv0Var.f42238k) && this.f42239l == cuv0Var.f42239l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42239l) + lq51.m59700f(this.f42238k, s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(mt60.m62800g(this.f42231d, s571.m77243b(s571.m77243b(this.f42228a.hashCode() * 31, 31, this.f42229b), 31, this.f42230c), 31), 31, this.f42232e), 31, this.f42233f), 31, this.f42234g), 31, this.f42235h), 31, this.f42236i), 31, this.f42237j), 31);
    }
}
