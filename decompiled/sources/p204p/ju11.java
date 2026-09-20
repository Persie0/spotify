package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ju11 {

    /* JADX INFO: renamed from: a */
    public final String f116013a;

    /* JADX INFO: renamed from: b */
    public final String f116014b;

    public ju11(String str, String str2) {
        this.f116013a = str;
        this.f116014b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju11)) {
            return false;
        }
        ju11 ju11Var = (ju11) obj;
        return wj50.m88271j(this.f116013a, ju11Var.f116013a) && wj50.m88271j(this.f116014b, ju11Var.f116014b);
    }

    public final int hashCode() {
        return this.f116014b.hashCode() + (this.f116013a.hashCode() * 31);
    }
}
