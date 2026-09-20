package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f215379a;

    /* JADX INFO: renamed from: b */
    public final String f215380b;

    public sz31(String str, String str2) {
        this.f215379a = str;
        this.f215380b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz31)) {
            return false;
        }
        sz31 sz31Var = (sz31) obj;
        return wj50.m88271j(this.f215379a, sz31Var.f215379a) && wj50.m88271j(this.f215380b, sz31Var.f215380b);
    }

    public final int hashCode() {
        return this.f215380b.hashCode() + (this.f215379a.hashCode() * 31);
    }
}
