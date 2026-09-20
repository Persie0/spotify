package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class nh7 {

    /* JADX INFO: renamed from: a */
    public final Integer f153888a;

    /* JADX INFO: renamed from: b */
    public final String f153889b;

    public nh7(Integer num, String str) {
        this.f153888a = num;
        this.f153889b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh7)) {
            return false;
        }
        nh7 nh7Var = (nh7) obj;
        return wj50.m88271j(this.f153888a, nh7Var.f153888a) && wj50.m88271j(this.f153889b, nh7Var.f153889b);
    }

    public final int hashCode() {
        Integer num = this.f153888a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f153889b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
