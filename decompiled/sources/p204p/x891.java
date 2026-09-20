package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class x891 implements z891 {

    /* JADX INFO: renamed from: a */
    public final String f259095a;

    /* JADX INFO: renamed from: b */
    public final String f259096b;

    /* JADX INFO: renamed from: c */
    public final String f259097c;

    public x891(String str, String str2, String str3) {
        this.f259095a = str;
        this.f259096b = str2;
        this.f259097c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x891)) {
            return false;
        }
        x891 x891Var = (x891) obj;
        return wj50.m88271j(this.f259095a, x891Var.f259095a) && wj50.m88271j(this.f259096b, x891Var.f259096b) && wj50.m88271j(this.f259097c, x891Var.f259097c);
    }

    public final int hashCode() {
        return this.f259097c.hashCode() + s571.m77243b(this.f259095a.hashCode() * 31, 31, this.f259096b);
    }
}
