package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bd00 implements ktx {

    /* JADX INFO: renamed from: a */
    public final int f25969a;

    /* JADX INFO: renamed from: b */
    public final boolean f25970b;

    /* JADX INFO: renamed from: c */
    public final String f25971c;

    /* JADX INFO: renamed from: d */
    public final String f25972d;

    public bd00(String str, int i, String str2, boolean z) {
        this.f25969a = i;
        this.f25970b = z;
        this.f25971c = str;
        this.f25972d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd00)) {
            return false;
        }
        bd00 bd00Var = (bd00) obj;
        return this.f25969a == bd00Var.f25969a && this.f25970b == bd00Var.f25970b && wj50.m88271j(this.f25971c, bd00Var.f25971c) && wj50.m88271j(this.f25972d, bd00Var.f25972d);
    }

    public final int hashCode() {
        return this.f25972d.hashCode() + s571.m77243b(s571.m77245d(edb.m38547C(this.f25969a) * 31, 31, this.f25970b), 31, this.f25971c);
    }
}
