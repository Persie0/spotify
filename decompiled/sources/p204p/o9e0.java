package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o9e0 extends h1h1 {

    /* JADX INFO: renamed from: b */
    public final String f163007b;

    /* JADX INFO: renamed from: c */
    public final boolean f163008c;

    public o9e0(String str, boolean z) {
        this.f163007b = str;
        this.f163008c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9e0)) {
            return false;
        }
        o9e0 o9e0Var = (o9e0) obj;
        return wj50.m88271j(this.f163007b, o9e0Var.f163007b) && this.f163008c == o9e0Var.f163008c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163008c) + (this.f163007b.hashCode() * 31);
    }
}
