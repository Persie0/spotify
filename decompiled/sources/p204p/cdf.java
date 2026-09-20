package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cdf implements hdf {

    /* JADX INFO: renamed from: a */
    public final String f36881a;

    public cdf(String str) {
        this.f36881a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdf) && wj50.m88271j(this.f36881a, ((cdf) obj).f36881a);
    }

    public final int hashCode() {
        return this.f36881a.hashCode();
    }
}
