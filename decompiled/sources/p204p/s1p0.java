package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s1p0 implements u1p0 {

    /* JADX INFO: renamed from: a */
    public final String f204775a;

    public s1p0(String str) {
        this.f204775a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1p0) && wj50.m88271j(this.f204775a, ((s1p0) obj).f204775a);
    }

    public final int hashCode() {
        return this.f204775a.hashCode();
    }
}
