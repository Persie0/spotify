package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class a73 {

    /* JADX INFO: renamed from: a */
    public final String f12931a;

    /* JADX INFO: renamed from: b */
    public final String f12932b;

    public a73(String str, String str2) {
        this.f12931a = str;
        this.f12932b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a73)) {
            return false;
        }
        a73 a73Var = (a73) obj;
        return wj50.m88271j(this.f12931a, a73Var.f12931a) && wj50.m88271j(this.f12932b, a73Var.f12932b);
    }

    public final int hashCode() {
        return this.f12932b.hashCode() + (this.f12931a.hashCode() * 31);
    }
}
