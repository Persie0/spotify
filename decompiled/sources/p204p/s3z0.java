package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s3z0 extends w3z0 {

    /* JADX INFO: renamed from: d */
    public final String f205370d;

    public s3z0(String str) {
        this.f205370d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3z0) && wj50.m88271j(this.f205370d, ((s3z0) obj).f205370d);
    }

    public final int hashCode() {
        return this.f205370d.hashCode();
    }
}
