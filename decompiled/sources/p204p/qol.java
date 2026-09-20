package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qol {

    /* JADX INFO: renamed from: a */
    public final String f190998a;

    /* JADX INFO: renamed from: b */
    public final int f190999b;

    public qol(String str, int i) {
        this.f190998a = str;
        this.f190999b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qol)) {
            return false;
        }
        qol qolVar = (qol) obj;
        return wj50.m88271j(this.f190998a, qolVar.f190998a) && this.f190999b == qolVar.f190999b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f190999b) + (this.f190998a.hashCode() * 31);
    }
}
