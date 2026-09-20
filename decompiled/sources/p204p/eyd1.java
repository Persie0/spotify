package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class eyd1 {

    /* JADX INFO: renamed from: a */
    public final List f64057a;

    /* JADX INFO: renamed from: b */
    public final Integer f64058b;

    public eyd1(Integer num, List list) {
        this.f64057a = list;
        this.f64058b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyd1)) {
            return false;
        }
        eyd1 eyd1Var = (eyd1) obj;
        return wj50.m88271j(this.f64057a, eyd1Var.f64057a) && wj50.m88271j(this.f64058b, eyd1Var.f64058b);
    }

    public final int hashCode() {
        int iHashCode = this.f64057a.hashCode() * 31;
        Integer num = this.f64058b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public /* synthetic */ eyd1() {
        this(null, lau.f131415a);
    }
}
