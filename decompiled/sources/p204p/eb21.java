package p204p;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class eb21 {

    /* JADX INFO: renamed from: a */
    public final Object f57784a;

    /* JADX INFO: renamed from: b */
    public final tt81 f57785b;

    /* JADX INFO: renamed from: c */
    public final ufd0 f57786c;

    /* JADX INFO: renamed from: d */
    public final phd0 f57787d;

    /* JADX INFO: renamed from: e */
    public final Object f57788e;

    /* JADX INFO: renamed from: f */
    public final nfd0 f57789f;

    /* JADX INFO: renamed from: g */
    public final long f57790g;

    /* JADX INFO: renamed from: h */
    public final long f57791h;

    /* JADX INFO: renamed from: i */
    public final long f57792i;

    /* JADX INFO: renamed from: j */
    public final boolean f57793j;

    /* JADX INFO: renamed from: k */
    public final boolean f57794k;

    /* JADX INFO: renamed from: l */
    public final long f57795l;

    /* JADX INFO: renamed from: m */
    public final long f57796m;

    /* JADX INFO: renamed from: n */
    public final long f57797n;

    /* JADX INFO: renamed from: o */
    public final boolean f57798o;

    /* JADX INFO: renamed from: p */
    public final pf40 f57799p;

    /* JADX INFO: renamed from: q */
    public final long[] f57800q;

    public eb21(db21 db21Var) {
        int i = 0;
        if (db21Var.f47179f == null) {
            c95.m31844j(db21Var.f47180g == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
            c95.m31844j(db21Var.f47181h == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
            c95.m31844j(db21Var.f47182i == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
        } else {
            long j = db21Var.f47180g;
            if (j != -9223372036854775807L) {
                long j2 = db21Var.f47181h;
                if (j2 != -9223372036854775807L) {
                    c95.m31844j(j2 >= j, "windowStartTimeMs can't be less than presentationStartTimeMs");
                }
            }
        }
        int size = db21Var.f47189p.size();
        long j3 = db21Var.f47186m;
        if (j3 != -9223372036854775807L) {
            c95.m31844j(db21Var.f47185l <= j3, "defaultPositionUs can't be greater than durationUs");
        }
        this.f57784a = db21Var.f47174a;
        this.f57785b = db21Var.f47175b;
        this.f57786c = db21Var.f47176c;
        this.f57787d = db21Var.f47177d;
        this.f57788e = db21Var.f47178e;
        this.f57789f = db21Var.f47179f;
        this.f57790g = db21Var.f47180g;
        this.f57791h = db21Var.f47181h;
        this.f57792i = db21Var.f47182i;
        this.f57793j = db21Var.f47183j;
        this.f57794k = db21Var.f47184k;
        this.f57795l = db21Var.f47185l;
        this.f57796m = db21Var.f47186m;
        long j4 = db21Var.f47187n;
        this.f57797n = j4;
        this.f57798o = db21Var.f47188o;
        pf40 pf40Var = db21Var.f47189p;
        this.f57799p = pf40Var;
        long[] jArr = new long[pf40Var.size()];
        this.f57800q = jArr;
        if (pf40Var.isEmpty()) {
            return;
        }
        jArr[0] = -j4;
        while (i < size - 1) {
            long[] jArr2 = this.f57800q;
            int i2 = i + 1;
            long j5 = jArr2[i];
            ((fb21) this.f57799p.get(i)).getClass();
            jArr2[i2] = j5 + 0;
            i = i2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m38339a(eb21 eb21Var, int i) {
        Object obj = eb21Var.f57784a;
        pf40 pf40Var = eb21Var.f57799p;
        if (pf40Var.isEmpty()) {
            return obj;
        }
        ((fb21) pf40Var.get(i)).getClass();
        return Pair.create(obj, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb21)) {
            return false;
        }
        eb21 eb21Var = (eb21) obj;
        if (this.f57784a.equals(eb21Var.f57784a) && this.f57785b.equals(eb21Var.f57785b) && this.f57786c.equals(eb21Var.f57786c) && Objects.equals(this.f57787d, eb21Var.f57787d) && Objects.equals(this.f57788e, eb21Var.f57788e) && Objects.equals(this.f57789f, eb21Var.f57789f) && this.f57790g == eb21Var.f57790g && this.f57791h == eb21Var.f57791h && this.f57792i == eb21Var.f57792i && this.f57793j == eb21Var.f57793j && this.f57794k == eb21Var.f57794k && this.f57795l == eb21Var.f57795l && this.f57796m == eb21Var.f57796m && this.f57797n == eb21Var.f57797n && this.f57798o == eb21Var.f57798o) {
            pf40 pf40Var = eb21Var.f57799p;
            pf40 pf40Var2 = this.f57799p;
            pf40Var2.getClass();
            if (pmf0.m70330p(pf40Var2, pf40Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f57786c.hashCode() + ((this.f57785b.f223555a.hashCode() + dq60.m36604d(217, 31, this.f57784a)) * 31)) * 31;
        phd0 phd0Var = this.f57787d;
        int iHashCode2 = (iHashCode + (phd0Var == null ? 0 : phd0Var.hashCode())) * 31;
        Object obj = this.f57788e;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        nfd0 nfd0Var = this.f57789f;
        int iHashCode4 = (iHashCode3 + (nfd0Var != null ? nfd0Var.hashCode() : 0)) * 31;
        long j = this.f57790g;
        int i = (iHashCode4 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f57791h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f57792i;
        int i3 = (((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f57793j ? 1 : 0)) * 31) + (this.f57794k ? 1 : 0)) * 31;
        long j4 = this.f57795l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f57796m;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f57797n;
        return this.f57799p.hashCode() + ((((i5 + ((int) (j6 ^ (j6 >>> 32)))) * 31) + (this.f57798o ? 1 : 0)) * 31);
    }
}
