package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ovi0 {

    /* JADX INFO: renamed from: a */
    public final String f170511a;

    /* JADX INFO: renamed from: b */
    public final String f170512b;

    public ovi0(String str, String str2) {
        this.f170511a = str;
        this.f170512b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovi0)) {
            return false;
        }
        ovi0 ovi0Var = (ovi0) obj;
        return wj50.m88271j(this.f170511a, ovi0Var.f170511a) && wj50.m88271j(this.f170512b, ovi0Var.f170512b);
    }

    public final int hashCode() {
        return this.f170512b.hashCode() + (this.f170511a.hashCode() * 31);
    }
}
