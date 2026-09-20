package p204p;

import com.spotify.concertcampaignview.p047v1.CtaType;

/* JADX INFO: loaded from: classes9.dex */
public final class q1a1 {

    /* JADX INFO: renamed from: a */
    public final v6q0 f184277a;

    /* JADX INFO: renamed from: b */
    public final g5u0 f184278b;

    public q1a1(v6q0 v6q0Var, g5u0 g5u0Var) {
        this.f184277a = v6q0Var;
        this.f184278b = g5u0Var;
    }

    public final boolean equals(Object obj) {
        Object obj2 = 10;
        Object obj3 = 30;
        Object obj4 = 120;
        Object objValueOf = Double.valueOf(0.1d);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1a1)) {
            return false;
        }
        q1a1 q1a1Var = (q1a1) obj;
        if (!this.f184277a.equals(q1a1Var.f184277a) || !this.f184278b.equals(q1a1Var.f184278b) || !objValueOf.equals(objValueOf) || !obj4.equals(obj4)) {
            return false;
        }
        Object obj5 = Boolean.TRUE;
        return obj5.equals(obj5) && obj5.equals(obj5) && obj3.equals(obj3) && obj5.equals(obj5) && obj2.equals(obj2);
    }

    public final int hashCode() {
        int iHashCode = (Double.valueOf(0.1d).hashCode() + ((this.f184278b.hashCode() + (this.f184277a.hashCode() * 961)) * 31)) * 31;
        Integer num = 120;
        int iHashCode2 = (num.hashCode() + iHashCode) * 31;
        Boolean bool = Boolean.TRUE;
        int iHashCode3 = (bool.hashCode() + ((bool.hashCode() + iHashCode2) * 31)) * 31;
        Integer num2 = 30;
        int iHashCode4 = (bool.hashCode() + ((num2.hashCode() + iHashCode3) * 31)) * 31;
        Integer num3 = 10;
        return Integer.hashCode(CtaType.CTA_NOT_INTERESTED_FIELD_NUMBER) + ((num3.hashCode() + iHashCode4) * 31);
    }
}
