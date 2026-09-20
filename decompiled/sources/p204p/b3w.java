package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b3w implements g3w {

    /* JADX INFO: renamed from: a */
    public final String f23143a;

    public b3w(String str) {
        this.f23143a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3w) && wj50.m88271j(this.f23143a, ((b3w) obj).f23143a);
    }

    public final int hashCode() {
        return this.f23143a.hashCode();
    }
}
