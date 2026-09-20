package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class iwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final String f106393a;

    /* JADX INFO: renamed from: b */
    public final String f106394b;

    public iwc0(String str, String str2) {
        this.f106393a = str;
        this.f106394b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iwc0)) {
            return false;
        }
        iwc0 iwc0Var = (iwc0) obj;
        return wj50.m88271j(this.f106393a, iwc0Var.f106393a) && wj50.m88271j(this.f106394b, iwc0Var.f106394b);
    }

    public final int hashCode() {
        return this.f106394b.hashCode() + (this.f106393a.hashCode() * 31);
    }
}
