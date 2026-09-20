package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tmr extends pnr {

    /* JADX INFO: renamed from: a */
    public final int f221768a;

    /* JADX INFO: renamed from: b */
    public final Integer f221769b;

    public tmr(int i, Integer num) {
        this.f221768a = i;
        this.f221769b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmr)) {
            return false;
        }
        tmr tmrVar = (tmr) obj;
        return this.f221768a == tmrVar.f221768a && wj50.m88271j(this.f221769b, tmrVar.f221769b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f221768a) * 31;
        Integer num = this.f221769b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }
}
