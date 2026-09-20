package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class drl implements erl {

    /* JADX INFO: renamed from: a */
    public final String f52352a;

    /* JADX INFO: renamed from: b */
    public final String f52353b;

    /* JADX INFO: renamed from: c */
    public final int f52354c;

    public drl(String str, String str2, int i) {
        this.f52352a = str;
        this.f52353b = str2;
        this.f52354c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drl)) {
            return false;
        }
        drl drlVar = (drl) obj;
        return wj50.m88271j(this.f52352a, drlVar.f52352a) && wj50.m88271j(this.f52353b, drlVar.f52353b) && this.f52354c == drlVar.f52354c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f52354c) + s571.m77243b(this.f52352a.hashCode() * 31, 31, this.f52353b);
    }
}
