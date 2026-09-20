package p204p;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t08 {

    /* JADX INFO: renamed from: a */
    public final String f215774a;

    /* JADX INFO: renamed from: b */
    public final Integer f215775b;

    /* JADX INFO: renamed from: c */
    public final aeu f215776c;

    /* JADX INFO: renamed from: d */
    public final long f215777d;

    /* JADX INFO: renamed from: e */
    public final long f215778e;

    /* JADX INFO: renamed from: f */
    public final Map f215779f;

    /* JADX INFO: renamed from: g */
    public final Integer f215780g;

    /* JADX INFO: renamed from: h */
    public final String f215781h;

    /* JADX INFO: renamed from: i */
    public final byte[] f215782i;

    /* JADX INFO: renamed from: j */
    public final byte[] f215783j;

    public t08(String str, Integer num, aeu aeuVar, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f215774a = str;
        this.f215775b = num;
        this.f215776c = aeuVar;
        this.f215777d = j;
        this.f215778e = j2;
        this.f215779f = map;
        this.f215780g = num2;
        this.f215781h = str2;
        this.f215782i = bArr;
        this.f215783j = bArr2;
    }

    /* JADX INFO: renamed from: a */
    public final String m79771a(String str) {
        String str2 = (String) this.f215779f.get(str);
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: renamed from: b */
    public final int m79772b(String str) {
        String str2 = (String) this.f215779f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* JADX INFO: renamed from: c */
    public final rk0 m79773c() {
        rk0 rk0Var = new rk0();
        rk0Var.m75697Y(this.f215774a);
        rk0Var.m75690R(this.f215775b);
        rk0Var.m75695W(this.f215780g);
        rk0Var.m75696X(this.f215781h);
        rk0Var.m75693U(this.f215782i);
        rk0Var.m75694V(this.f215783j);
        rk0Var.m75691S(this.f215776c);
        rk0Var.m75692T(this.f215777d);
        rk0Var.m75698Z(this.f215778e);
        rk0Var.m75689Q(new HashMap(this.f215779f));
        return rk0Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t08) {
            t08 t08Var = (t08) obj;
            String str2 = t08Var.f215781h;
            Integer num3 = t08Var.f215780g;
            Integer num4 = t08Var.f215775b;
            if (this.f215774a.equals(t08Var.f215774a) && ((num = this.f215775b) != null ? num.equals(num4) : num4 == null) && this.f215776c.equals(t08Var.f215776c) && this.f215777d == t08Var.f215777d && this.f215778e == t08Var.f215778e && this.f215779f.equals(t08Var.f215779f) && ((num2 = this.f215780g) != null ? num2.equals(num3) : num3 == null) && ((str = this.f215781h) != null ? str.equals(str2) : str2 == null) && Arrays.equals(this.f215782i, t08Var.f215782i) && Arrays.equals(this.f215783j, t08Var.f215783j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f215774a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f215775b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f215776c.hashCode()) * 1000003;
        long j = this.f215777d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f215778e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f215779f.hashCode()) * 1000003;
        Integer num2 = this.f215780g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f215781h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f215782i)) * 1000003) ^ Arrays.hashCode(this.f215783j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f215774a + ", code=" + this.f215775b + ", encodedPayload=" + this.f215776c + ", eventMillis=" + this.f215777d + ", uptimeMillis=" + this.f215778e + ", autoMetadata=" + this.f215779f + ", productId=" + this.f215780g + ", pseudonymousId=" + this.f215781h + ", experimentIdsClear=" + Arrays.toString(this.f215782i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f215783j) + "}";
    }
}
