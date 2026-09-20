package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ky71 {

    /* JADX INFO: renamed from: a */
    public final String f127714a;

    /* JADX INFO: renamed from: b */
    public final String f127715b;

    /* JADX INFO: renamed from: c */
    public final long f127716c;

    public ky71(String str, String str2, long j) {
        this.f127714a = str;
        this.f127715b = str2;
        this.f127716c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky71)) {
            return false;
        }
        ky71 ky71Var = (ky71) obj;
        return wj50.m88271j(this.f127714a, ky71Var.f127714a) && wj50.m88271j(this.f127715b, ky71Var.f127715b) && this.f127716c == ky71Var.f127716c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f127716c) + s571.m77243b(this.f127714a.hashCode() * 31, 31, this.f127715b);
    }
}
