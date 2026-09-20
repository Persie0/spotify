package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dc0 {

    /* JADX INFO: renamed from: a */
    public final int f47399a;

    public dc0(int i) {
        this.f47399a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && this.f47399a == ((dc0) obj).f47399a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f47399a);
    }
}
