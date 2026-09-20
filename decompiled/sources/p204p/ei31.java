package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ei31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final iz50 f59780a;

    public ei31(iz50 iz50Var) {
        this.f59780a = iz50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ei31) && this.f59780a == ((ei31) obj).f59780a;
    }

    public final int hashCode() {
        return this.f59780a.hashCode();
    }
}
