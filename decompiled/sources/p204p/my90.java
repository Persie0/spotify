package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class my90 {

    /* JADX INFO: renamed from: a */
    public final String f148366a;

    /* JADX INFO: renamed from: b */
    public final String f148367b;

    /* JADX INFO: renamed from: c */
    public final String f148368c;

    /* JADX INFO: renamed from: d */
    public final long f148369d;

    public my90(long j, String str, String str2, String str3) {
        this.f148366a = str;
        this.f148367b = str2;
        this.f148368c = str3;
        this.f148369d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my90)) {
            return false;
        }
        my90 my90Var = (my90) obj;
        return wj50.m88271j(this.f148366a, my90Var.f148366a) && wj50.m88271j(this.f148367b, my90Var.f148367b) && wj50.m88271j(this.f148368c, my90Var.f148368c) && this.f148369d == my90Var.f148369d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f148369d) + s571.m77243b(s571.m77243b(this.f148366a.hashCode() * 31, 31, this.f148367b), 31, this.f148368c);
    }
}
