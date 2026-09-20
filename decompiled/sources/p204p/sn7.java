package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sn7 implements un7 {

    /* JADX INFO: renamed from: a */
    public final String f210836a;

    /* JADX INFO: renamed from: b */
    public final String f210837b;

    public sn7(String str, String str2) {
        this.f210836a = str;
        this.f210837b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn7)) {
            return false;
        }
        sn7 sn7Var = (sn7) obj;
        return wj50.m88271j(this.f210836a, sn7Var.f210836a) && wj50.m88271j(this.f210837b, sn7Var.f210837b);
    }

    public final int hashCode() {
        return this.f210837b.hashCode() + (this.f210836a.hashCode() * 31);
    }
}
