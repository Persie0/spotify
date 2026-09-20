package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ehn0 {

    /* JADX INFO: renamed from: a */
    public final Integer f59622a;

    /* JADX INFO: renamed from: b */
    public final Integer f59623b;

    public /* synthetic */ ehn0(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehn0)) {
            return false;
        }
        ehn0 ehn0Var = (ehn0) obj;
        return wj50.m88271j(this.f59622a, ehn0Var.f59622a) && wj50.m88271j(this.f59623b, ehn0Var.f59623b);
    }

    public final int hashCode() {
        Integer num = this.f59622a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f59623b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public ehn0(Integer num, Integer num2) {
        this.f59622a = num;
        this.f59623b = num2;
    }
}
