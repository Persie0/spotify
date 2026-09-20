package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cpq {

    /* JADX INFO: renamed from: a */
    public final String f40594a;

    /* JADX INFO: renamed from: b */
    public final boolean f40595b;

    public cpq(String str, boolean z) {
        this.f40594a = str;
        this.f40595b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpq)) {
            return false;
        }
        cpq cpqVar = (cpq) obj;
        return wj50.m88271j(this.f40594a, cpqVar.f40594a) && this.f40595b == cpqVar.f40595b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40595b) + (this.f40594a.hashCode() * 31);
    }
}
