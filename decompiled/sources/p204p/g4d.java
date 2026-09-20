package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class g4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final String f76389a;

    /* JADX INFO: renamed from: b */
    public final String f76390b;

    public g4d(String str, String str2) {
        this.f76389a = str;
        this.f76390b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4d)) {
            return false;
        }
        g4d g4dVar = (g4d) obj;
        return wj50.m88271j(this.f76389a, g4dVar.f76389a) && wj50.m88271j(this.f76390b, g4dVar.f76390b);
    }

    public final int hashCode() {
        return this.f76390b.hashCode() + (this.f76389a.hashCode() * 31);
    }
}
