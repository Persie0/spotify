package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sdf implements udf {

    /* JADX INFO: renamed from: a */
    public final String f208007a;

    public sdf(String str) {
        this.f208007a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sdf) && wj50.m88271j(this.f208007a, ((sdf) obj).f208007a);
    }

    public final int hashCode() {
        return this.f208007a.hashCode();
    }
}
