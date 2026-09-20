package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class kga1 extends oga1 {

    /* JADX INFO: renamed from: a */
    public final to6 f122349a;

    /* JADX INFO: renamed from: b */
    public final String f122350b;

    public kga1(to6 to6Var, String str) {
        this.f122349a = to6Var;
        this.f122350b = str;
    }

    /* JADX INFO: renamed from: a */
    public final to6 m56326a() {
        return this.f122349a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kga1)) {
            return false;
        }
        kga1 kga1Var = (kga1) obj;
        return wj50.m88271j(this.f122349a, kga1Var.f122349a) && wj50.m88271j(this.f122350b, kga1Var.f122350b);
    }

    public final int hashCode() {
        return this.f122350b.hashCode() + (this.f122349a.hashCode() * 31);
    }
}
