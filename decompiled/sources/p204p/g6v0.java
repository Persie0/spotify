package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class g6v0 extends h6v0 {

    /* JADX INFO: renamed from: a */
    public final String f77125a;

    public g6v0(String str) {
        this.f77125a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6v0) && wj50.m88271j(this.f77125a, ((g6v0) obj).f77125a);
    }

    public final int hashCode() {
        return this.f77125a.hashCode();
    }
}
