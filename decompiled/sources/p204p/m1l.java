package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class m1l implements h2l {

    /* JADX INFO: renamed from: a */
    public final boolean f139027a;

    public m1l(boolean z) {
        this.f139027a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1l) && this.f139027a == ((m1l) obj).f139027a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f139027a);
    }
}
