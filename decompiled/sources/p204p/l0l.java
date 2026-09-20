package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class l0l implements h2l {

    /* JADX INFO: renamed from: a */
    public final String f128468a;

    public l0l(String str) {
        this.f128468a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l0l) && wj50.m88271j(this.f128468a, ((l0l) obj).f128468a);
    }

    public final int hashCode() {
        return this.f128468a.hashCode();
    }
}
