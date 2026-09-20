package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yec {

    /* JADX INFO: renamed from: a */
    public final String f271960a;

    /* JADX INFO: renamed from: b */
    public final String f271961b;

    /* JADX INFO: renamed from: c */
    public final int f271962c;

    public yec(String str, String str2, int i) {
        this.f271960a = str;
        this.f271961b = str2;
        this.f271962c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yec)) {
            return false;
        }
        yec yecVar = (yec) obj;
        return wj50.m88271j(this.f271960a, yecVar.f271960a) && wj50.m88271j(this.f271961b, yecVar.f271961b) && this.f271962c == yecVar.f271962c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f271962c) + s571.m77243b(this.f271960a.hashCode() * 31, 31, this.f271961b);
    }
}
