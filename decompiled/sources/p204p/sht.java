package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sht {

    /* JADX INFO: renamed from: a */
    public final String f209259a;

    /* JADX INFO: renamed from: b */
    public final d850 f209260b;

    public sht(String str, d850 d850Var) {
        this.f209259a = str;
        this.f209260b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sht)) {
            return false;
        }
        sht shtVar = (sht) obj;
        return wj50.m88271j(this.f209259a, shtVar.f209259a) && wj50.m88271j(this.f209260b, shtVar.f209260b);
    }

    public final int hashCode() {
        return this.f209260b.hashCode() + (this.f209259a.hashCode() * 31);
    }
}
