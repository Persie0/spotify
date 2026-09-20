package p204p;

import java.util.Currency;

/* JADX INFO: loaded from: classes3.dex */
public final class sj40 {

    /* JADX INFO: renamed from: a */
    public final String f209755a;

    /* JADX INFO: renamed from: b */
    public final double f209756b;

    /* JADX INFO: renamed from: c */
    public final Currency f209757c;

    public sj40(String str, double d, Currency currency) {
        this.f209755a = str;
        this.f209756b = d;
        this.f209757c = currency;
    }

    /* JADX INFO: renamed from: a */
    public final double m78272a() {
        return this.f209756b;
    }

    /* JADX INFO: renamed from: b */
    public final Currency m78273b() {
        return this.f209757c;
    }

    /* JADX INFO: renamed from: c */
    public final String m78274c() {
        return this.f209755a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj40)) {
            return false;
        }
        sj40 sj40Var = (sj40) obj;
        return wj50.m88271j(this.f209755a, sj40Var.f209755a) && Double.compare(this.f209756b, sj40Var.f209756b) == 0 && wj50.m88271j(this.f209757c, sj40Var.f209757c);
    }

    public final int hashCode() {
        return this.f209757c.hashCode() + xl81.m91399h(this.f209756b, this.f209755a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InAppPurchase(eventName=" + this.f209755a + ", amount=" + this.f209756b + ", currency=" + this.f209757c + ')';
    }
}
