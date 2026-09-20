package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cmr {

    /* JADX INFO: renamed from: a */
    public final String f39764a;

    public cmr(String str) {
        this.f39764a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cmr) && wj50.m88271j(this.f39764a, ((cmr) obj).f39764a);
    }

    public final int hashCode() {
        return this.f39764a.hashCode();
    }
}
