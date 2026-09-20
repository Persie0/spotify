package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ujw0 implements wjw0 {

    /* JADX INFO: renamed from: a */
    public final String f231168a;

    /* JADX INFO: renamed from: b */
    public final String f231169b;

    public ujw0(String str, String str2) {
        this.f231168a = str;
        this.f231169b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujw0)) {
            return false;
        }
        ujw0 ujw0Var = (ujw0) obj;
        return wj50.m88271j(this.f231168a, ujw0Var.f231168a) && wj50.m88271j(this.f231169b, ujw0Var.f231169b);
    }

    public final int hashCode() {
        return this.f231169b.hashCode() + (this.f231168a.hashCode() * 31);
    }
}
