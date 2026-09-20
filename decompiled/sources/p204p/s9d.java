package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class s9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f206927a;

    public s9d(String str) {
        this.f206927a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9d) && wj50.m88271j(this.f206927a, ((s9d) obj).f206927a);
    }

    public final int hashCode() {
        return this.f206927a.hashCode();
    }
}
