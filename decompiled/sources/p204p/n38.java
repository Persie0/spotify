package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n38 {

    /* JADX INFO: renamed from: a */
    public final String f149950a;

    /* JADX INFO: renamed from: b */
    public final String f149951b;

    /* JADX INFO: renamed from: c */
    public final boolean f149952c;

    public n38(String str, String str2, boolean z) {
        this.f149950a = str;
        this.f149951b = str2;
        this.f149952c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n38)) {
            return false;
        }
        n38 n38Var = (n38) obj;
        return wj50.m88271j(this.f149950a, n38Var.f149950a) && wj50.m88271j(this.f149951b, n38Var.f149951b) && this.f149952c == n38Var.f149952c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149952c) + s571.m77243b(this.f149950a.hashCode() * 31, 31, this.f149951b);
    }
}
