package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jba {

    /* JADX INFO: renamed from: a */
    public final String f110717a;

    /* JADX INFO: renamed from: b */
    public final String f110718b;

    public jba(String str, String str2) {
        this.f110717a = str;
        this.f110718b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jba)) {
            return false;
        }
        jba jbaVar = (jba) obj;
        return wj50.m88271j(this.f110717a, jbaVar.f110717a) && wj50.m88271j(this.f110718b, jbaVar.f110718b);
    }

    public final int hashCode() {
        int iHashCode = this.f110717a.hashCode() * 31;
        String str = this.f110718b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
