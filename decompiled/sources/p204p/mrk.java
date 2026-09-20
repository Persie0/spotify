package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mrk {

    /* JADX INFO: renamed from: a */
    public final int f146574a;

    /* JADX INFO: renamed from: b */
    public final String f146575b;

    public mrk(int i, String str) {
        this.f146574a = i;
        this.f146575b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrk)) {
            return false;
        }
        mrk mrkVar = (mrk) obj;
        return this.f146574a == mrkVar.f146574a && wj50.m88271j(this.f146575b, mrkVar.f146575b);
    }

    public final int hashCode() {
        int i = this.f146574a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        String str = this.f146575b;
        return iM38547C + (str != null ? str.hashCode() : 0);
    }
}
