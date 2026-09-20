package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tk71 {

    /* JADX INFO: renamed from: a */
    public final String f221094a;

    /* JADX INFO: renamed from: b */
    public final boolean f221095b;

    public tk71(String str, boolean z) {
        this.f221094a = str;
        this.f221095b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk71)) {
            return false;
        }
        tk71 tk71Var = (tk71) obj;
        return wj50.m88271j(this.f221094a, tk71Var.f221094a) && this.f221095b == tk71Var.f221095b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f221095b) + (this.f221094a.hashCode() * 31);
    }
}
