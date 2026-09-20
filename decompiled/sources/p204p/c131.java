package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c131 {

    /* JADX INFO: renamed from: a */
    public final String f32963a;

    /* JADX INFO: renamed from: b */
    public final String f32964b;

    /* JADX INFO: renamed from: c */
    public final s431 f32965c;

    /* JADX INFO: renamed from: d */
    public final boolean f32966d;

    /* JADX INFO: renamed from: e */
    public final i131 f32967e;

    public c131(String str, String str2, s431 s431Var, boolean z, i131 i131Var) {
        this.f32963a = str;
        this.f32964b = str2;
        this.f32965c = s431Var;
        this.f32966d = z;
        this.f32967e = i131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c131)) {
            return false;
        }
        c131 c131Var = (c131) obj;
        return wj50.m88271j(this.f32963a, c131Var.f32963a) && wj50.m88271j(this.f32964b, c131Var.f32964b) && wj50.m88271j(this.f32965c, c131Var.f32965c) && this.f32966d == c131Var.f32966d && wj50.m88271j(this.f32967e, c131Var.f32967e);
    }

    public final int hashCode() {
        return this.f32967e.hashCode() + s571.m77245d((this.f32965c.hashCode() + s571.m77243b(this.f32963a.hashCode() * 31, 31, this.f32964b)) * 31, 31, this.f32966d);
    }
}
