package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class duk implements pe10 {

    /* JADX INFO: renamed from: a */
    public final sjr f53073a;

    public duk(sjr sjrVar) {
        this.f53073a = sjrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duk) && wj50.m88271j(this.f53073a, ((duk) obj).f53073a);
    }

    public final int hashCode() {
        return this.f53073a.hashCode();
    }

    public final String toString() {
        return "CornerRadiusModifier(radius=" + this.f53073a + ')';
    }
}
