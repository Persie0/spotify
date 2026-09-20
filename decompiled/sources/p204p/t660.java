package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t660 {

    /* JADX INFO: renamed from: a */
    public final String f217456a;

    /* JADX INFO: renamed from: b */
    public final String f217457b;

    public t660(String str, String str2) {
        this.f217456a = str;
        this.f217457b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t660)) {
            return false;
        }
        t660 t660Var = (t660) obj;
        return wj50.m88271j(this.f217456a, t660Var.f217456a) && wj50.m88271j(this.f217457b, t660Var.f217457b);
    }

    public final int hashCode() {
        return this.f217457b.hashCode() + (this.f217456a.hashCode() * 31);
    }
}
