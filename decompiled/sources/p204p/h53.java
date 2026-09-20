package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class h53 {

    /* JADX INFO: renamed from: a */
    public final String f87708a;

    /* JADX INFO: renamed from: b */
    public final String f87709b;

    /* JADX INFO: renamed from: c */
    public final h66 f87710c;

    /* JADX INFO: renamed from: d */
    public final w9s f87711d;

    public h53(String str, String str2, h66 h66Var, w9s w9sVar) {
        this.f87708a = str;
        this.f87709b = str2;
        this.f87710c = h66Var;
        this.f87711d = w9sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h53)) {
            return false;
        }
        h53 h53Var = (h53) obj;
        return wj50.m88271j(this.f87708a, h53Var.f87708a) && wj50.m88271j(this.f87709b, h53Var.f87709b) && wj50.m88271j(this.f87710c, h53Var.f87710c) && this.f87711d == h53Var.f87711d;
    }

    public final int hashCode() {
        return this.f87711d.hashCode() + ((this.f87710c.hashCode() + s571.m77243b(this.f87708a.hashCode() * 31, 31, this.f87709b)) * 31);
    }
}
