package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l2k {

    /* JADX INFO: renamed from: a */
    public final boolean f129026a;

    /* JADX INFO: renamed from: b */
    public final String f129027b;

    /* JADX INFO: renamed from: c */
    public final int f129028c;

    public l2k(boolean z, String str, int i) {
        this.f129026a = z;
        this.f129027b = str;
        this.f129028c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2k)) {
            return false;
        }
        l2k l2kVar = (l2k) obj;
        return this.f129026a == l2kVar.f129026a && this.f129027b.equals(l2kVar.f129027b) && this.f129028c == l2kVar.f129028c;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Boolean.hashCode(this.f129026a) * 31, 31, this.f129027b);
        int i = this.f129028c;
        return iM77243b + (i == 0 ? 0 : edb.m38547C(i));
    }
}
