package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l541 {

    /* JADX INFO: renamed from: a */
    public final hz80 f129822a;

    /* JADX INFO: renamed from: b */
    public final String f129823b;

    public l541(hz80 hz80Var, String str) {
        this.f129822a = hz80Var;
        this.f129823b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l541)) {
            return false;
        }
        l541 l541Var = (l541) obj;
        return wj50.m88271j(this.f129822a, l541Var.f129822a) && wj50.m88271j(this.f129823b, l541Var.f129823b);
    }

    public final int hashCode() {
        int iHashCode = this.f129822a.hashCode() * 31;
        String str = this.f129823b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
