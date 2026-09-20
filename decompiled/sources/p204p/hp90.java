package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hp90 extends jp90 {

    /* JADX INFO: renamed from: a */
    public final Throwable f93718a;

    /* JADX INFO: renamed from: b */
    public final String f93719b;

    public hp90(String str, Throwable th) {
        this.f93718a = th;
        this.f93719b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp90)) {
            return false;
        }
        hp90 hp90Var = (hp90) obj;
        return wj50.m88271j(this.f93718a, hp90Var.f93718a) && wj50.m88271j(this.f93719b, hp90Var.f93719b);
    }

    public final int hashCode() {
        int iHashCode = this.f93718a.hashCode() * 31;
        String str = this.f93719b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
