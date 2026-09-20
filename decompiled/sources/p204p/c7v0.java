package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class c7v0 {

    /* JADX INFO: renamed from: a */
    public final z650 f35033a;

    /* JADX INFO: renamed from: b */
    public final String f35034b;

    /* JADX INFO: renamed from: c */
    public final String f35035c;

    /* JADX INFO: renamed from: d */
    public final String f35036d;

    /* JADX INFO: renamed from: e */
    public final String f35037e;

    public c7v0(String str, String str2, String str3, String str4, z650 z650Var) {
        this.f35033a = z650Var;
        this.f35034b = str;
        this.f35035c = str2;
        this.f35036d = str3;
        this.f35037e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7v0)) {
            return false;
        }
        c7v0 c7v0Var = (c7v0) obj;
        return wj50.m88271j(this.f35033a, c7v0Var.f35033a) && wj50.m88271j(this.f35034b, c7v0Var.f35034b) && wj50.m88271j(this.f35035c, c7v0Var.f35035c) && wj50.m88271j(this.f35036d, c7v0Var.f35036d) && wj50.m88271j(this.f35037e, c7v0Var.f35037e);
    }

    public final int hashCode() {
        z650 z650Var = this.f35033a;
        return this.f35037e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((z650Var == null ? 0 : z650Var.f279709a.hashCode()) * 31, 31, this.f35034b), 31, this.f35035c), 31, this.f35036d);
    }
}
