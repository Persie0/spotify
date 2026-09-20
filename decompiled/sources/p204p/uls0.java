package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class uls0 {

    /* JADX INFO: renamed from: a */
    public final String f231626a;

    /* JADX INFO: renamed from: b */
    public final String f231627b;

    /* JADX INFO: renamed from: c */
    public final boolean f231628c;

    /* JADX INFO: renamed from: d */
    public final String f231629d;

    /* JADX INFO: renamed from: e */
    public final String f231630e;

    /* JADX INFO: renamed from: f */
    public final erv0 f231631f;

    /* JADX INFO: renamed from: g */
    public final boolean f231632g;

    /* JADX INFO: renamed from: h */
    public final List f231633h;

    /* JADX INFO: renamed from: i */
    public final boolean f231634i;

    /* JADX INFO: renamed from: j */
    public final boolean f231635j;

    /* JADX INFO: renamed from: k */
    public final boolean f231636k;

    public uls0(String str, String str2, boolean z, String str3, String str4, erv0 erv0Var, boolean z2, List list, boolean z3, boolean z4, boolean z5) {
        this.f231626a = str;
        this.f231627b = str2;
        this.f231628c = z;
        this.f231629d = str3;
        this.f231630e = str4;
        this.f231631f = erv0Var;
        this.f231632g = z2;
        this.f231633h = list;
        this.f231634i = z3;
        this.f231635j = z4;
        this.f231636k = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uls0)) {
            return false;
        }
        uls0 uls0Var = (uls0) obj;
        return wj50.m88271j(this.f231626a, uls0Var.f231626a) && wj50.m88271j(this.f231627b, uls0Var.f231627b) && this.f231628c == uls0Var.f231628c && wj50.m88271j(this.f231629d, uls0Var.f231629d) && wj50.m88271j(this.f231630e, uls0Var.f231630e) && wj50.m88271j(this.f231631f, uls0Var.f231631f) && this.f231632g == uls0Var.f231632g && wj50.m88271j(this.f231633h, uls0Var.f231633h) && this.f231634i == uls0Var.f231634i && this.f231635j == uls0Var.f231635j && this.f231636k == uls0Var.f231636k;
    }

    public final int hashCode() {
        String str = this.f231626a;
        return Boolean.hashCode(this.f231636k) + s571.m77245d(s571.m77245d(s571.m77244c(s571.m77245d((this.f231631f.hashCode() + s571.m77243b(s571.m77243b(s571.m77245d(s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f231627b), 31, this.f231628c), 31, this.f231629d), 31, this.f231630e)) * 31, 31, this.f231632g), 31, this.f231633h), 31, this.f231634i), 31, this.f231635j);
    }
}
