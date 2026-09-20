package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class xpo0 {

    /* JADX INFO: renamed from: a */
    public final int f264699a;

    public xpo0(int i) {
        this.f264699a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xpo0) && this.f264699a == ((xpo0) obj).f264699a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f264699a);
    }
}
