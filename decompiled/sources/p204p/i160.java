package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i160 {

    /* JADX INFO: renamed from: a */
    public final String f97419a;

    /* JADX INFO: renamed from: b */
    public final String f97420b;

    public i160(String str, String str2) {
        this.f97419a = str;
        this.f97420b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i160)) {
            return false;
        }
        i160 i160Var = (i160) obj;
        return wj50.m88271j(this.f97419a, i160Var.f97419a) && wj50.m88271j(this.f97420b, i160Var.f97420b);
    }

    public final int hashCode() {
        return this.f97420b.hashCode() + (this.f97419a.hashCode() * 31);
    }
}
