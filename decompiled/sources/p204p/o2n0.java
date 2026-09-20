package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o2n0 {

    /* JADX INFO: renamed from: a */
    public final String f161073a;

    /* JADX INFO: renamed from: b */
    public final zfw f161074b;

    public o2n0(String str, zfw zfwVar) {
        this.f161073a = str;
        this.f161074b = zfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2n0)) {
            return false;
        }
        o2n0 o2n0Var = (o2n0) obj;
        return wj50.m88271j(this.f161073a, o2n0Var.f161073a) && this.f161074b == o2n0Var.f161074b;
    }

    public final int hashCode() {
        String str = this.f161073a;
        return this.f161074b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
