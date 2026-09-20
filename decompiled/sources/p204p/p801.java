package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p801 implements q801 {

    /* JADX INFO: renamed from: a */
    public final b450 f174801a;

    public p801(b450 b450Var) {
        this.f174801a = b450Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p801) && wj50.m88271j(this.f174801a, ((p801) obj).f174801a);
    }

    public final int hashCode() {
        return this.f174801a.hashCode();
    }
}
