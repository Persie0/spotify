package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class awe1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final String f20493a;

    /* JADX INFO: renamed from: b */
    public final d850 f20494b;

    public awe1(String str, d850 d850Var) {
        this.f20493a = str;
        this.f20494b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awe1)) {
            return false;
        }
        awe1 awe1Var = (awe1) obj;
        return wj50.m88271j(this.f20493a, awe1Var.f20493a) && wj50.m88271j(this.f20494b, awe1Var.f20494b);
    }

    public final int hashCode() {
        return this.f20494b.hashCode() + (this.f20493a.hashCode() * 31);
    }
}
