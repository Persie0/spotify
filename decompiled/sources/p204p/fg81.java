package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fg81 {

    /* JADX INFO: renamed from: a */
    public final String f69248a;

    /* JADX INFO: renamed from: b */
    public final String f69249b;

    public fg81(String str, String str2) {
        this.f69248a = str;
        this.f69249b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg81)) {
            return false;
        }
        fg81 fg81Var = (fg81) obj;
        return wj50.m88271j(this.f69248a, fg81Var.f69248a) && wj50.m88271j(this.f69249b, fg81Var.f69249b);
    }

    public final int hashCode() {
        int iHashCode = this.f69248a.hashCode() * 31;
        String str = this.f69249b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
