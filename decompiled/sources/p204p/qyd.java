package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qyd {

    /* JADX INFO: renamed from: a */
    public final boolean f193871a;

    /* JADX INFO: renamed from: b */
    public final String f193872b;

    public qyd(boolean z, String str) {
        this.f193871a = z;
        this.f193872b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qyd)) {
            return false;
        }
        qyd qydVar = (qyd) obj;
        return this.f193871a == qydVar.f193871a && wj50.m88271j(this.f193872b, qydVar.f193872b);
    }

    public final int hashCode() {
        return this.f193872b.hashCode() + (Boolean.hashCode(this.f193871a) * 31);
    }
}
