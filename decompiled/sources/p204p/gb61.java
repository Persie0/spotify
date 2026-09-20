package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class gb61 {

    /* JADX INFO: renamed from: a */
    public final String f78212a;

    /* JADX INFO: renamed from: b */
    public final String f78213b;

    public gb61(String str, String str2) {
        this.f78212a = str;
        this.f78213b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb61)) {
            return false;
        }
        gb61 gb61Var = (gb61) obj;
        return wj50.m88271j(this.f78212a, gb61Var.f78212a) && wj50.m88271j(this.f78213b, gb61Var.f78213b);
    }

    public final int hashCode() {
        return this.f78213b.hashCode() + (this.f78212a.hashCode() * 31);
    }
}
