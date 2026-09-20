package p204p;

import androidx.compose.p002ui.geometry.Offset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class k6q0 {

    /* JADX INFO: renamed from: a */
    public final long f119810a;

    /* JADX INFO: renamed from: b */
    public final long f119811b;

    /* JADX INFO: renamed from: c */
    public final long f119812c;

    /* JADX INFO: renamed from: d */
    public final boolean f119813d;

    /* JADX INFO: renamed from: e */
    public final float f119814e;

    /* JADX INFO: renamed from: f */
    public final long f119815f;

    /* JADX INFO: renamed from: g */
    public final long f119816g;

    /* JADX INFO: renamed from: h */
    public final boolean f119817h;

    /* JADX INFO: renamed from: i */
    public final int f119818i;

    /* JADX INFO: renamed from: j */
    public final long f119819j;

    /* JADX INFO: renamed from: k */
    public final float f119820k;

    /* JADX INFO: renamed from: l */
    public final long f119821l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f119822m;

    /* JADX INFO: renamed from: n */
    public final long f119823n;

    /* JADX INFO: renamed from: o */
    public boolean f119824o;

    /* JADX INFO: renamed from: p */
    public boolean f119825p;

    /* JADX INFO: renamed from: q */
    public k6q0 f119826q;

    public k6q0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.f119810a = j;
        this.f119811b = j2;
        this.f119812c = j3;
        this.f119813d = z;
        this.f119814e = f;
        this.f119815f = j4;
        this.f119816g = j5;
        this.f119817h = z2;
        this.f119818i = i;
        this.f119819j = j6;
        this.f119820k = f2;
        this.f119821l = j7;
        this.f119823n = 0L;
        this.f119824o = z3;
        this.f119825p = z3;
    }

    /* JADX INFO: renamed from: b */
    public static k6q0 m55601b(k6q0 k6q0Var, long j, long j2, ArrayList arrayList) {
        k6q0 k6q0Var2 = k6q0Var;
        k6q0 k6q0Var3 = new k6q0(k6q0Var2.f119810a, k6q0Var2.f119811b, j, k6q0Var2.f119813d, k6q0Var2.f119814e, k6q0Var2.f119815f, j2, k6q0Var2.f119817h, k6q0Var2.f119818i, arrayList, k6q0Var2.f119819j, k6q0Var2.f119820k, k6q0Var2.f119821l, k6q0Var2.f119823n);
        k6q0 k6q0Var4 = k6q0Var2.f119826q;
        if (k6q0Var4 == null) {
            k6q0Var4 = k6q0Var2;
        }
        k6q0Var3.f119826q = k6q0Var4;
        k6q0 k6q0Var5 = k6q0Var2.f119826q;
        if (k6q0Var5 != null) {
            k6q0Var2 = k6q0Var5;
        }
        k6q0Var3.f119826q = k6q0Var2;
        return k6q0Var3;
    }

    /* JADX INFO: renamed from: a */
    public final void m55602a() {
        k6q0 k6q0Var = this.f119826q;
        if (k6q0Var == null) {
            this.f119824o = true;
            this.f119825p = true;
        } else if (k6q0Var != null) {
            k6q0Var.m55602a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final List m55603c() {
        ArrayList arrayList = this.f119822m;
        return arrayList == null ? lau.f131415a : arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final long m55604d() {
        return this.f119810a;
    }

    /* JADX INFO: renamed from: e */
    public final long m55605e() {
        return this.f119812c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m55606f() {
        return this.f119813d;
    }

    /* JADX INFO: renamed from: g */
    public final float m55607g() {
        return this.f119814e;
    }

    /* JADX INFO: renamed from: h */
    public final long m55608h() {
        return this.f119816g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m55609i() {
        return this.f119817h;
    }

    /* JADX INFO: renamed from: j */
    public final int m55610j() {
        return this.f119818i;
    }

    /* JADX INFO: renamed from: k */
    public final long m55611k() {
        return this.f119811b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m55612l() {
        k6q0 k6q0Var = this.f119826q;
        if (k6q0Var != null) {
            return k6q0Var.m55612l();
        }
        return this.f119824o || this.f119825p;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) pzb0.m71728z(this.f119810a)) + ", uptimeMillis=" + this.f119811b + ", position=" + ((Object) Offset.m259i(this.f119812c)) + ", pressed=" + this.f119813d + ", pressure=" + this.f119814e + ", previousUptimeMillis=" + this.f119815f + ", previousPosition=" + ((Object) Offset.m259i(this.f119816g)) + ", previousPressed=" + this.f119817h + ", isConsumed=" + m55612l() + ", type=" + ((Object) s6q0.m77341c(this.f119818i)) + ", historical=" + m55603c() + ", scrollDelta=" + ((Object) Offset.m259i(this.f119819j)) + ", scaleFactor=" + this.f119820k + ", panOffset=" + ((Object) Offset.m259i(this.f119821l)) + ')';
    }

    public /* synthetic */ k6q0(long j, long j2, long j3, float f, long j4, long j5, boolean z, boolean z2, int i) {
        this(j, j2, j3, false, f, j4, j5, z, z2, i, 0L, 1.0f, 0L);
    }

    public k6q0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.f119822m = arrayList;
        this.f119823n = j8;
    }
}
