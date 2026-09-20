package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class u1f implements w1f {

    /* JADX INFO: renamed from: a */
    public final boolean f225803a;

    /* JADX INFO: renamed from: b */
    public final Integer f225804b;

    /* JADX INFO: renamed from: c */
    public final f1f f225805c;

    /* JADX INFO: renamed from: d */
    public final d850 f225806d;

    /* JADX INFO: renamed from: e */
    public final boolean f225807e;

    public u1f(boolean z, Integer num, f1f f1fVar, d850 d850Var, boolean z2) {
        this.f225803a = z;
        this.f225804b = num;
        this.f225805c = f1fVar;
        this.f225806d = d850Var;
        this.f225807e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1f)) {
            return false;
        }
        u1f u1fVar = (u1f) obj;
        return this.f225803a == u1fVar.f225803a && wj50.m88271j(this.f225804b, u1fVar.f225804b) && this.f225805c.equals(u1fVar.f225805c) && wj50.m88271j(this.f225806d, u1fVar.f225806d) && this.f225807e == u1fVar.f225807e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f225803a) * 31;
        Integer num = this.f225804b;
        return Boolean.hashCode(this.f225807e) + ((this.f225806d.hashCode() + ((this.f225805c.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }
}
