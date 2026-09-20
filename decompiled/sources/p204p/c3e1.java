package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class c3e1 {

    /* JADX INFO: renamed from: a */
    public final String f33664a;

    /* JADX INFO: renamed from: b */
    public final Integer f33665b;

    /* JADX INFO: renamed from: c */
    public final u0m f33666c;

    public c3e1(String str, Integer num, u0m u0mVar) {
        this.f33664a = str;
        this.f33665b = num;
        this.f33666c = u0mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3e1)) {
            return false;
        }
        c3e1 c3e1Var = (c3e1) obj;
        return wj50.m88271j(this.f33664a, c3e1Var.f33664a) && wj50.m88271j(this.f33665b, c3e1Var.f33665b) && this.f33666c == c3e1Var.f33666c;
    }

    public final int hashCode() {
        int iHashCode = this.f33664a.hashCode() * 31;
        Integer num = this.f33665b;
        return this.f33666c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }
}
