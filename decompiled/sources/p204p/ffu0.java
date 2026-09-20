package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ffu0 implements hfu0 {

    /* JADX INFO: renamed from: a */
    public final String f69087a;

    /* JADX INFO: renamed from: b */
    public final String f69088b;

    /* JADX INFO: renamed from: c */
    public final String f69089c;

    /* JADX INFO: renamed from: d */
    public final String f69090d;

    /* JADX INFO: renamed from: e */
    public final dfu0 f69091e;

    /* JADX INFO: renamed from: f */
    public final boolean f69092f;

    /* JADX INFO: renamed from: g */
    public final boolean f69093g;

    /* JADX INFO: renamed from: h */
    public final afu0 f69094h;

    /* JADX INFO: renamed from: i */
    public final String f69095i;

    /* JADX INFO: renamed from: j */
    public final String f69096j;

    /* JADX INFO: renamed from: k */
    public final List f69097k;

    /* JADX INFO: renamed from: l */
    public final weu0 f69098l;

    /* JADX INFO: renamed from: m */
    public final List f69099m;

    /* JADX INFO: renamed from: n */
    public final boolean f69100n;

    /* JADX INFO: renamed from: o */
    public final boolean f69101o;

    /* JADX INFO: renamed from: p */
    public final String f69102p;

    public ffu0(String str, String str2, String str3, String str4, dfu0 dfu0Var, boolean z, boolean z2, afu0 afu0Var, String str5, String str6, List list, weu0 weu0Var, List list2, boolean z3, boolean z4, String str7) {
        this.f69087a = str;
        this.f69088b = str2;
        this.f69089c = str3;
        this.f69090d = str4;
        this.f69091e = dfu0Var;
        this.f69092f = z;
        this.f69093g = z2;
        this.f69094h = afu0Var;
        this.f69095i = str5;
        this.f69096j = str6;
        this.f69097k = list;
        this.f69098l = weu0Var;
        this.f69099m = list2;
        this.f69100n = z3;
        this.f69101o = z4;
        this.f69102p = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffu0)) {
            return false;
        }
        ffu0 ffu0Var = (ffu0) obj;
        return wj50.m88271j(this.f69087a, ffu0Var.f69087a) && wj50.m88271j(this.f69088b, ffu0Var.f69088b) && wj50.m88271j(this.f69089c, ffu0Var.f69089c) && wj50.m88271j(this.f69090d, ffu0Var.f69090d) && wj50.m88271j(this.f69091e, ffu0Var.f69091e) && this.f69092f == ffu0Var.f69092f && this.f69093g == ffu0Var.f69093g && wj50.m88271j(this.f69094h, ffu0Var.f69094h) && wj50.m88271j(this.f69095i, ffu0Var.f69095i) && wj50.m88271j(this.f69096j, ffu0Var.f69096j) && wj50.m88271j(this.f69097k, ffu0Var.f69097k) && wj50.m88271j(this.f69098l, ffu0Var.f69098l) && wj50.m88271j(this.f69099m, ffu0Var.f69099m) && this.f69100n == ffu0Var.f69100n && this.f69101o == ffu0Var.f69101o && wj50.m88271j(this.f69102p, ffu0Var.f69102p);
    }

    public final int hashCode() {
        return this.f69102p.hashCode() + s571.m77245d(s571.m77245d(s571.m77244c((this.f69098l.hashCode() + s571.m77244c(s571.m77243b(s571.m77243b((this.f69094h.hashCode() + s571.m77245d(s571.m77245d((this.f69091e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f69087a.hashCode() * 31, 31, this.f69088b), 31, this.f69089c), 31, this.f69090d)) * 31, 31, this.f69092f), 31, this.f69093g)) * 31, 31, this.f69095i), 31, this.f69096j), 31, this.f69097k)) * 31, 31, this.f69099m), 31, this.f69100n), 31, this.f69101o);
    }
}
