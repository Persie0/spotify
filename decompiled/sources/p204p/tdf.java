package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tdf implements udf {

    /* JADX INFO: renamed from: a */
    public final String f219301a;

    public tdf(String str) {
        this.f219301a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tdf) && wj50.m88271j(this.f219301a, ((tdf) obj).f219301a);
    }

    public final int hashCode() {
        return this.f219301a.hashCode();
    }
}
