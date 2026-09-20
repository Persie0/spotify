package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zpd implements bqd {

    /* JADX INFO: renamed from: a */
    public final String f285106a;

    /* JADX INFO: renamed from: b */
    public final boolean f285107b;

    public zpd(String str, boolean z) {
        this.f285106a = str;
        this.f285107b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpd)) {
            return false;
        }
        zpd zpdVar = (zpd) obj;
        return wj50.m88271j(this.f285106a, zpdVar.f285106a) && this.f285107b == zpdVar.f285107b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f285107b) + (this.f285106a.hashCode() * 31);
    }
}
