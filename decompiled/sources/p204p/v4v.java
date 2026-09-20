package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class v4v {

    /* JADX INFO: renamed from: a */
    public final qf40 f237243a;

    /* JADX INFO: renamed from: b */
    public final bw40 f237244b;

    /* JADX INFO: renamed from: c */
    public final boolean f237245c;

    /* JADX INFO: renamed from: d */
    public final k931 f237246d;

    /* JADX INFO: renamed from: e */
    public final boolean f237247e;

    public v4v(qf40 qf40Var, bw40 bw40Var, boolean z, k931 k931Var, boolean z2) {
        this.f237243a = qf40Var;
        this.f237244b = bw40Var;
        this.f237245c = z;
        this.f237246d = k931Var;
        this.f237247e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4v)) {
            return false;
        }
        v4v v4vVar = (v4v) obj;
        return wj50.m88271j(this.f237243a, v4vVar.f237243a) && wj50.m88271j(this.f237244b, v4vVar.f237244b) && this.f237245c == v4vVar.f237245c && wj50.m88271j(this.f237246d, v4vVar.f237246d) && this.f237247e == v4vVar.f237247e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f237247e) + ((this.f237246d.hashCode() + s571.m77245d((this.f237244b.hashCode() + (this.f237243a.hashCode() * 31)) * 31, 31, this.f237245c)) * 31);
    }
}
