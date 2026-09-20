package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o360 {

    /* JADX INFO: renamed from: a */
    public final boolean f161292a;

    /* JADX INFO: renamed from: b */
    public final String f161293b;

    public o360(boolean z, String str) {
        this.f161292a = z;
        this.f161293b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o360)) {
            return false;
        }
        o360 o360Var = (o360) obj;
        return this.f161292a == o360Var.f161292a && wj50.m88271j(this.f161293b, o360Var.f161293b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f161292a) * 31;
        String str = this.f161293b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
