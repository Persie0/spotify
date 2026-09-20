package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sbj {

    /* JADX INFO: renamed from: a */
    public final int f207517a;

    /* JADX INFO: renamed from: b */
    public final String f207518b;

    public sbj(int i, String str) {
        this.f207517a = i;
        this.f207518b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbj)) {
            return false;
        }
        sbj sbjVar = (sbj) obj;
        return this.f207517a == sbjVar.f207517a && wj50.m88271j(this.f207518b, sbjVar.f207518b);
    }

    public final int hashCode() {
        int i = this.f207517a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        String str = this.f207518b;
        return iM38547C + (str != null ? str.hashCode() : 0);
    }
}
