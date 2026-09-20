package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v79 {

    /* JADX INFO: renamed from: a */
    public final String f238101a;

    /* JADX INFO: renamed from: b */
    public final String f238102b;

    /* JADX INFO: renamed from: c */
    public final String f238103c;

    public v79(String str, String str2, String str3) {
        this.f238101a = str;
        this.f238102b = str2;
        this.f238103c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v79)) {
            return false;
        }
        v79 v79Var = (v79) obj;
        return this.f238101a.equals(v79Var.f238101a) && this.f238102b.equals(v79Var.f238102b) && this.f238103c.equals(v79Var.f238103c);
    }

    public final int hashCode() {
        return s571.m77245d(s571.m77243b(s571.m77243b(this.f238101a.hashCode() * 31, 961, this.f238102b), 31, this.f238103c), 31, false);
    }
}
