package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bd81 {

    /* JADX INFO: renamed from: a */
    public final qf40 f26047a;

    /* JADX INFO: renamed from: b */
    public final String f26048b;

    /* JADX INFO: renamed from: c */
    public final boolean f26049c;

    public bd81(String str, qf40 qf40Var, boolean z) {
        this.f26047a = qf40Var;
        this.f26048b = str;
        this.f26049c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd81)) {
            return false;
        }
        bd81 bd81Var = (bd81) obj;
        return wj50.m88271j(this.f26047a, bd81Var.f26047a) && wj50.m88271j(this.f26048b, bd81Var.f26048b) && this.f26049c == bd81Var.f26049c;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(4, this.f26047a.hashCode() * 31, 961);
        String str = this.f26048b;
        return Boolean.hashCode(false) + s571.m77245d(s571.m77245d(s571.m77245d((iM62800g + (str == null ? 0 : str.hashCode())) * 31, 31, this.f26049c), 31, false), 961, false);
    }
}
