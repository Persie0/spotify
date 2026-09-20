package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class y8c extends c9c {

    /* JADX INFO: renamed from: a */
    public final int f270268a;

    public y8c(int i) {
        this.f270268a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y8c) && this.f270268a == ((y8c) obj).f270268a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f270268a);
    }
}
