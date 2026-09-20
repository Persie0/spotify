package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fg5 {

    /* JADX INFO: renamed from: a */
    public final String f69222a;

    /* JADX INFO: renamed from: b */
    public final boolean f69223b;

    /* JADX INFO: renamed from: c */
    public final String f69224c;

    /* JADX INFO: renamed from: d */
    public final int f69225d;

    public fg5(String str, int i, String str2, boolean z) {
        this.f69222a = str;
        this.f69223b = z;
        this.f69224c = str2;
        this.f69225d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fg5)) {
            return false;
        }
        fg5 fg5Var = (fg5) obj;
        return wj50.m88271j(this.f69222a, fg5Var.f69222a) && this.f69223b == fg5Var.f69223b && wj50.m88271j(this.f69224c, fg5Var.f69224c) && this.f69225d == fg5Var.f69225d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f69225d) + s571.m77243b(s571.m77245d(this.f69222a.hashCode() * 31, 31, this.f69223b), 31, this.f69224c);
    }
}
