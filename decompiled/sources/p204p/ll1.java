package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ll1 {

    /* JADX INFO: renamed from: a */
    public final int f134509a;

    public ll1(int i) {
        this.f134509a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll1) && this.f134509a == ((ll1) obj).f134509a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f134509a);
    }
}
