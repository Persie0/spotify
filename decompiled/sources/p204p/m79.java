package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class m79 {

    /* JADX INFO: renamed from: a */
    public final String f140739a;

    /* JADX INFO: renamed from: b */
    public final String f140740b;

    public m79(String str, String str2) {
        this.f140739a = str;
        this.f140740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m79)) {
            return false;
        }
        m79 m79Var = (m79) obj;
        return wj50.m88271j(this.f140739a, m79Var.f140739a) && wj50.m88271j(this.f140740b, m79Var.f140740b);
    }

    public final int hashCode() {
        return this.f140740b.hashCode() + (this.f140739a.hashCode() * 31);
    }
}
