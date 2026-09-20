package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qbz {

    /* JADX INFO: renamed from: a */
    public final int f187215a;

    /* JADX INFO: renamed from: b */
    public final String f187216b;

    public qbz(int i, String str) {
        this.f187215a = i;
        this.f187216b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbz)) {
            return false;
        }
        qbz qbzVar = (qbz) obj;
        return this.f187215a == qbzVar.f187215a && wj50.m88271j(this.f187216b, qbzVar.f187216b);
    }

    public final int hashCode() {
        return this.f187216b.hashCode() + (edb.m38547C(this.f187215a) * 31);
    }
}
