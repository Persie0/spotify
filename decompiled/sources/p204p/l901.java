package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class l901 implements x901 {

    /* JADX INFO: renamed from: a */
    public final String f130975a;

    /* JADX INFO: renamed from: b */
    public final boolean f130976b;

    public l901(String str, boolean z) {
        this.f130975a = str;
        this.f130976b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l901)) {
            return false;
        }
        l901 l901Var = (l901) obj;
        return wj50.m88271j(this.f130975a, l901Var.f130975a) && this.f130976b == l901Var.f130976b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130976b) + (this.f130975a.hashCode() * 31);
    }
}
