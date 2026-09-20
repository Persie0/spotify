package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class f7c implements oi0 {

    /* JADX INFO: renamed from: a */
    public final int f66639a;

    public f7c(int i) {
        this.f66639a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7c) && this.f66639a == ((f7c) obj).f66639a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66639a);
    }
}
