package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k18 extends gqa0 {

    /* JADX INFO: renamed from: a */
    public final long f118237a;

    /* JADX INFO: renamed from: b */
    public final long f118238b;

    /* JADX INFO: renamed from: c */
    public final oy7 f118239c;

    /* JADX INFO: renamed from: d */
    public final Integer f118240d;

    /* JADX INFO: renamed from: e */
    public final String f118241e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f118242f;

    public k18(long j, long j2, oy7 oy7Var, Integer num, String str, ArrayList arrayList) {
        ugt0 ugt0Var = ugt0.f230257a;
        this.f118237a = j;
        this.f118238b = j2;
        this.f118239c = oy7Var;
        this.f118240d = num;
        this.f118241e = str;
        this.f118242f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gqa0)) {
            return false;
        }
        k18 k18Var = (k18) ((gqa0) obj);
        Object obj2 = ugt0.f230257a;
        ArrayList arrayList = k18Var.f118242f;
        String str = k18Var.f118241e;
        Integer num = k18Var.f118240d;
        oy7 oy7Var = k18Var.f118239c;
        if (this.f118237a != k18Var.f118237a || this.f118238b != k18Var.f118238b || !this.f118239c.equals(oy7Var)) {
            return false;
        }
        Integer num2 = this.f118240d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.f118241e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f118242f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f118237a;
        long j2 = this.f118238b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f118239c.hashCode()) * 1000003;
        Integer num = this.f118240d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f118241e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f118242f.hashCode()) * 1000003) ^ ugt0.f230257a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f118237a + ", requestUptimeMs=" + this.f118238b + ", clientInfo=" + this.f118239c + ", logSource=" + this.f118240d + ", logSourceName=" + this.f118241e + ", logEvents=" + this.f118242f + ", qosTier=" + ugt0.f230257a + "}";
    }
}
