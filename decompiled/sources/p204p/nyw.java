package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nyw implements a3x {

    /* JADX INFO: renamed from: a */
    public final String f159942a;

    public nyw(String str) {
        this.f159942a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nyw) && wj50.m88271j(this.f159942a, ((nyw) obj).f159942a);
    }

    public final int hashCode() {
        return this.f159942a.hashCode();
    }
}
