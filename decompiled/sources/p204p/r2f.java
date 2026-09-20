package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r2f implements s2f {

    /* JADX INFO: renamed from: a */
    public final String f195134a;

    public r2f(String str) {
        this.f195134a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r2f) && wj50.m88271j(this.f195134a, ((r2f) obj).f195134a);
    }

    public final int hashCode() {
        return this.f195134a.hashCode();
    }

    public final String toString() {
        return this.f195134a;
    }
}
