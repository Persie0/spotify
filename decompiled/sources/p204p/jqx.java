package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jqx implements tn61 {

    /* JADX INFO: renamed from: a */
    public final up60 f115017a;

    /* JADX INFO: renamed from: b */
    public final int f115018b;

    public jqx(up60 up60Var) {
        this.f115017a = up60Var;
        this.f115018b = up60Var.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqx) && wj50.m88271j(this.f115017a, ((jqx) obj).f115017a);
    }

    public final int hashCode() {
        return this.f115018b;
    }

    public final String toString() {
        return s571.m77251j("ExtendedMetadataTable<", this.f115017a.mo29111F(), ">");
    }
}
