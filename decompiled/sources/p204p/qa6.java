package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qa6 {

    /* JADX INFO: renamed from: a */
    public final String f186760a;

    /* JADX INFO: renamed from: b */
    public final String f186761b;

    public qa6(String str, String str2) {
        this.f186760a = str;
        this.f186761b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qa6)) {
            return false;
        }
        qa6 qa6Var = (qa6) obj;
        return this.f186760a.equals(qa6Var.f186760a) && this.f186761b.equals(qa6Var.f186761b);
    }

    public final int hashCode() {
        return edb.m38547C(2) + s571.m77243b(this.f186760a.hashCode() * 31, 31, this.f186761b);
    }
}
