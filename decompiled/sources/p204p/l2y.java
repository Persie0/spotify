package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class l2y {

    /* JADX INFO: renamed from: a */
    public final boolean f129119a;

    /* JADX INFO: renamed from: b */
    public final boolean f129120b;

    /* JADX INFO: renamed from: c */
    public final boolean f129121c;

    /* JADX INFO: renamed from: d */
    public final boolean f129122d;

    /* JADX INFO: renamed from: e */
    public final c92 f129123e;

    /* JADX INFO: renamed from: f */
    public final boolean f129124f;

    /* JADX INFO: renamed from: g */
    public final Integer f129125g;

    public l2y(boolean z, boolean z2, boolean z3, boolean z4, c92 c92Var, boolean z5, Integer num) {
        this.f129119a = z;
        this.f129120b = z2;
        this.f129121c = z3;
        this.f129122d = z4;
        this.f129123e = c92Var;
        this.f129124f = z5;
        this.f129125g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2y)) {
            return false;
        }
        l2y l2yVar = (l2y) obj;
        return this.f129119a == l2yVar.f129119a && this.f129120b == l2yVar.f129120b && this.f129121c == l2yVar.f129121c && this.f129122d == l2yVar.f129122d && this.f129123e.equals(l2yVar.f129123e) && this.f129124f == l2yVar.f129124f && wj50.m88271j(this.f129125g, l2yVar.f129125g);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d((this.f129123e.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f129119a) * 31, 31, this.f129120b), 31, this.f129121c), 31, this.f129122d)) * 31, 31, this.f129124f);
        Integer num = this.f129125g;
        return iM77245d + (num == null ? 0 : num.hashCode());
    }
}
