package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cb91 extends db91 {

    /* JADX INFO: renamed from: a */
    public final String f36055a;

    /* JADX INFO: renamed from: b */
    public final String f36056b;

    public cb91(String str, String str2) {
        this.f36055a = str;
        this.f36056b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb91)) {
            return false;
        }
        cb91 cb91Var = (cb91) obj;
        return wj50.m88271j(this.f36055a, cb91Var.f36055a) && wj50.m88271j(this.f36056b, cb91Var.f36056b);
    }

    public final int hashCode() {
        return this.f36056b.hashCode() + (this.f36055a.hashCode() * 31);
    }
}
