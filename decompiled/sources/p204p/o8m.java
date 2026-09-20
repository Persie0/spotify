package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class o8m {

    /* JADX INFO: renamed from: a */
    public final String f162830a;

    /* JADX INFO: renamed from: b */
    public final String f162831b;

    public o8m(String str, String str2) {
        this.f162830a = str;
        this.f162831b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8m)) {
            return false;
        }
        o8m o8mVar = (o8m) obj;
        return wj50.m88271j(this.f162830a, o8mVar.f162830a) && wj50.m88271j(this.f162831b, o8mVar.f162831b);
    }

    public final int hashCode() {
        String str = this.f162830a;
        return this.f162831b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
