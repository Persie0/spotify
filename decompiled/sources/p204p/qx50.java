package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qx50 {

    /* JADX INFO: renamed from: a */
    public final String f193514a;

    public /* synthetic */ qx50(String str) {
        this.f193514a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qx50) {
            return wj50.m88271j(this.f193514a, ((qx50) obj).f193514a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f193514a.hashCode();
    }

    public final String toString() {
        return s571.m77251j("Id(value=", this.f193514a, ")");
    }
}
