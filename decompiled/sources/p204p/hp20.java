package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hp20 extends jp20 {

    /* JADX INFO: renamed from: a */
    public final String f93686a;

    /* JADX INFO: renamed from: b */
    public final String f93687b;

    public hp20(String str, String str2) {
        this.f93686a = str;
        this.f93687b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp20)) {
            return false;
        }
        hp20 hp20Var = (hp20) obj;
        return wj50.m88271j(this.f93686a, hp20Var.f93686a) && wj50.m88271j(this.f93687b, hp20Var.f93687b);
    }

    public final int hashCode() {
        return this.f93687b.hashCode() + (this.f93686a.hashCode() * 31);
    }
}
