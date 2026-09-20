package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f224204a;

    /* JADX INFO: renamed from: b */
    public final String f224205b;

    /* JADX INFO: renamed from: c */
    public final boolean f224206c;

    public tvo0(String str, String str2, boolean z) {
        this.f224204a = str;
        this.f224205b = str2;
        this.f224206c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvo0)) {
            return false;
        }
        tvo0 tvo0Var = (tvo0) obj;
        return wj50.m88271j(this.f224204a, tvo0Var.f224204a) && wj50.m88271j(this.f224205b, tvo0Var.f224205b) && this.f224206c == tvo0Var.f224206c;
    }

    public final int hashCode() {
        int iHashCode = this.f224204a.hashCode() * 31;
        String str = this.f224205b;
        return Boolean.hashCode(this.f224206c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
