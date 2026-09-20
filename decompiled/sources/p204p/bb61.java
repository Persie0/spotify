package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bb61 {

    /* JADX INFO: renamed from: a */
    public final String f25445a;

    /* JADX INFO: renamed from: b */
    public final String f25446b;

    /* JADX INFO: renamed from: c */
    public final boolean f25447c;

    public bb61(String str, String str2, boolean z) {
        this.f25445a = str;
        this.f25446b = str2;
        this.f25447c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb61)) {
            return false;
        }
        bb61 bb61Var = (bb61) obj;
        return wj50.m88271j(this.f25445a, bb61Var.f25445a) && wj50.m88271j(this.f25446b, bb61Var.f25446b) && this.f25447c == bb61Var.f25447c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25447c) + s571.m77243b(this.f25445a.hashCode() * 31, 31, this.f25446b);
    }
}
