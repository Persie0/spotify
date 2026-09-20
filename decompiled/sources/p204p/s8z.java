package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s8z extends t8z {

    /* JADX INFO: renamed from: a */
    public final String f206810a;

    public s8z(String str) {
        this.f206810a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8z) && wj50.m88271j(this.f206810a, ((s8z) obj).f206810a);
    }

    public final int hashCode() {
        return this.f206810a.hashCode();
    }
}
