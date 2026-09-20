package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wmq0 {

    /* JADX INFO: renamed from: a */
    public final String f252962a;

    /* JADX INFO: renamed from: b */
    public final String f252963b;

    /* JADX INFO: renamed from: c */
    public final int f252964c;

    public wmq0(String str, String str2, int i) {
        this.f252962a = str;
        this.f252963b = str2;
        this.f252964c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmq0)) {
            return false;
        }
        wmq0 wmq0Var = (wmq0) obj;
        return wj50.m88271j(this.f252962a, wmq0Var.f252962a) && wj50.m88271j(this.f252963b, wmq0Var.f252963b) && this.f252964c == wmq0Var.f252964c;
    }

    public final int hashCode() {
        String str = this.f252962a;
        return f710.m40938f(this.f252964c, s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f252963b), 31);
    }
}
