package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ohf0 implements xhf0 {

    /* JADX INFO: renamed from: a */
    public final kze0 f165422a;

    /* JADX INFO: renamed from: b */
    public final d850 f165423b;

    public ohf0(kze0 kze0Var, d850 d850Var) {
        this.f165422a = kze0Var;
        this.f165423b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohf0)) {
            return false;
        }
        ohf0 ohf0Var = (ohf0) obj;
        return this.f165422a == ohf0Var.f165422a && wj50.m88271j(this.f165423b, ohf0Var.f165423b);
    }

    public final int hashCode() {
        return this.f165423b.hashCode() + (this.f165422a.hashCode() * 31);
    }
}
