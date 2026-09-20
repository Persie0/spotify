package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class hvz0 implements jvz0 {

    /* JADX INFO: renamed from: a */
    public final String f95821a;

    public hvz0(String str) {
        this.f95821a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hvz0) && wj50.m88271j(this.f95821a, ((hvz0) obj).f95821a);
    }

    public final int hashCode() {
        return this.f95821a.hashCode();
    }
}
