package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class weg1 {

    /* JADX INFO: renamed from: a */
    public final Integer f250531a;

    /* JADX INFO: renamed from: b */
    public final Integer f250532b;

    /* JADX INFO: renamed from: c */
    public final Integer f250533c;

    /* JADX INFO: renamed from: d */
    public final Date f250534d;

    /* JADX INFO: renamed from: e */
    public final String f250535e;

    public weg1(Integer num, Integer num2, Integer num3, Date date, String str) {
        this.f250531a = num;
        this.f250532b = num2;
        this.f250533c = num3;
        this.f250534d = date;
        this.f250535e = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof weg1) {
            weg1 weg1Var = (weg1) obj;
            String str = weg1Var.f250535e;
            Date date = weg1Var.f250534d;
            Integer num = weg1Var.f250533c;
            Integer num2 = weg1Var.f250532b;
            Integer num3 = weg1Var.f250531a;
            Integer num4 = this.f250531a;
            if (num4 != null ? num4.equals(num3) : num3 == null) {
                Integer num5 = this.f250532b;
                if (num5 != null ? num5.equals(num2) : num2 == null) {
                    Integer num6 = this.f250533c;
                    if (num6 != null ? num6.equals(num) : num == null) {
                        Date date2 = this.f250534d;
                        if (date2 != null ? date2.equals(date) : date == null) {
                            String str2 = this.f250535e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f250531a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.f250532b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode ^ 1000003;
        Integer num3 = this.f250533c;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (num3 == null ? 0 : num3.hashCode())) * 1000003;
        Date date = this.f250534d;
        int iHashCode4 = (iHashCode3 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        String str = this.f250535e;
        return (str != null ? str.hashCode() : 0) ^ iHashCode4;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f250534d);
        StringBuilder sb = new StringBuilder("AgeSignalsResult{userStatus=");
        sb.append(this.f250531a);
        sb.append(", ageLower=");
        sb.append(this.f250532b);
        sb.append(", ageUpper=");
        sb.append(this.f250533c);
        sb.append(", mostRecentApprovalDate=");
        sb.append(strValueOf);
        sb.append(", installId=");
        return dq60.m36616p(this.f250535e, "}", sb);
    }
}
