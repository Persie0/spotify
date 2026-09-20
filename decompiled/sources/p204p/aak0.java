package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aak0 {

    /* JADX INFO: renamed from: a */
    public final String f13889a;

    /* JADX INFO: renamed from: b */
    public final Integer f13890b;

    public aak0(Integer num, String str) {
        this.f13889a = str;
        this.f13890b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aak0)) {
            return false;
        }
        aak0 aak0Var = (aak0) obj;
        return wj50.m88271j(this.f13889a, aak0Var.f13889a) && wj50.m88271j(this.f13890b, aak0Var.f13890b);
    }

    public final int hashCode() {
        int iHashCode = this.f13889a.hashCode() * 31;
        Integer num = this.f13890b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
