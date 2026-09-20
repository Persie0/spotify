package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lpo implements qfm0 {

    /* JADX INFO: renamed from: a */
    public final String f135800a;

    public lpo(String str) {
        this.f135800a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lpo) && wj50.m88271j(this.f135800a, ((lpo) obj).f135800a);
    }

    public final int hashCode() {
        return this.f135800a.hashCode();
    }
}
