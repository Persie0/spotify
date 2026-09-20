package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oo00 {

    /* JADX INFO: renamed from: a */
    public final no00 f167426a;

    /* JADX INFO: renamed from: b */
    public final mo00 f167427b;

    /* JADX INFO: renamed from: c */
    public final boolean f167428c;

    /* JADX INFO: renamed from: d */
    public final boolean f167429d;

    public oo00(no00 no00Var, mo00 mo00Var, boolean z, boolean z2) {
        this.f167426a = no00Var;
        this.f167427b = mo00Var;
        this.f167428c = z;
        this.f167429d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo00)) {
            return false;
        }
        oo00 oo00Var = (oo00) obj;
        return wj50.m88271j(this.f167426a, oo00Var.f167426a) && wj50.m88271j(this.f167427b, oo00Var.f167427b) && this.f167428c == oo00Var.f167428c && this.f167429d == oo00Var.f167429d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167429d) + s571.m77245d((this.f167427b.hashCode() + (this.f167426a.hashCode() * 31)) * 31, 31, this.f167428c);
    }
}
