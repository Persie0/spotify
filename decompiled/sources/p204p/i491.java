package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i491 {

    /* JADX INFO: renamed from: c */
    public static final i491 f98464c = new i491("", 0);

    /* JADX INFO: renamed from: a */
    public final String f98465a;

    /* JADX INFO: renamed from: b */
    public final int f98466b;

    public i491(String str, int i) {
        this.f98465a = str;
        this.f98466b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i491)) {
            return false;
        }
        i491 i491Var = (i491) obj;
        return wj50.m88271j(this.f98465a, i491Var.f98465a) && this.f98466b == i491Var.f98466b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98466b) + (this.f98465a.hashCode() * 31);
    }
}
