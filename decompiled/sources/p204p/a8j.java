package p204p;

import android.net.NetworkRequest;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a8j {

    /* JADX INFO: renamed from: j */
    public static final a8j f13302j = new a8j(15);

    /* JADX INFO: renamed from: a */
    public final int f13303a;

    /* JADX INFO: renamed from: b */
    public final thj0 f13304b;

    /* JADX INFO: renamed from: c */
    public final boolean f13305c;

    /* JADX INFO: renamed from: d */
    public final boolean f13306d;

    /* JADX INFO: renamed from: e */
    public final boolean f13307e;

    /* JADX INFO: renamed from: f */
    public final boolean f13308f;

    /* JADX INFO: renamed from: g */
    public final long f13309g;

    /* JADX INFO: renamed from: h */
    public final long f13310h;

    /* JADX INFO: renamed from: i */
    public final Set f13311i;

    public a8j(int i) {
        int i2 = (i & 1) != 0 ? 1 : 3;
        boolean z = (i & 4) == 0;
        this.f13304b = new thj0(null);
        this.f13303a = i2;
        this.f13305c = false;
        this.f13306d = false;
        this.f13307e = z;
        this.f13308f = false;
        this.f13309g = -1L;
        this.f13310h = -1L;
        this.f13311i = gbu.f78413a;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkRequest m25041a() {
        return (NetworkRequest) this.f13304b.f220445a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25042b() {
        return !this.f13311i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a8j.class.equals(obj.getClass())) {
            return false;
        }
        a8j a8jVar = (a8j) obj;
        if (this.f13305c == a8jVar.f13305c && this.f13306d == a8jVar.f13306d && this.f13307e == a8jVar.f13307e && this.f13308f == a8jVar.f13308f && this.f13309g == a8jVar.f13309g && this.f13310h == a8jVar.f13310h && wj50.m88271j(m25041a(), a8jVar.m25041a()) && this.f13303a == a8jVar.f13303a) {
            return wj50.m88271j(this.f13311i, a8jVar.f13311i);
        }
        return false;
    }

    public final int hashCode() {
        int iM38547C = ((((((((edb.m38547C(this.f13303a) * 31) + (this.f13305c ? 1 : 0)) * 31) + (this.f13306d ? 1 : 0)) * 31) + (this.f13307e ? 1 : 0)) * 31) + (this.f13308f ? 1 : 0)) * 31;
        long j = this.f13309g;
        int i = (iM38547C + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f13310h;
        int iM56830b = klh.m56830b((i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f13311i);
        NetworkRequest networkRequestM25041a = m25041a();
        return iM56830b + (networkRequestM25041a != null ? networkRequestM25041a.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + dq60.m36599A(this.f13303a) + ", requiresCharging=" + this.f13305c + ", requiresDeviceIdle=" + this.f13306d + ", requiresBatteryNotLow=" + this.f13307e + ", requiresStorageNotLow=" + this.f13308f + ", contentTriggerUpdateDelayMillis=" + this.f13309g + ", contentTriggerMaxDelayMillis=" + this.f13310h + ", contentUriTriggers=" + this.f13311i + ", }";
    }

    public a8j(thj0 thj0Var, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.f13304b = thj0Var;
        this.f13303a = i;
        this.f13305c = z;
        this.f13306d = z2;
        this.f13307e = z3;
        this.f13308f = z4;
        this.f13309g = j;
        this.f13310h = j2;
        this.f13311i = set;
    }

    public a8j(a8j a8jVar) {
        this.f13305c = a8jVar.f13305c;
        this.f13306d = a8jVar.f13306d;
        this.f13304b = a8jVar.f13304b;
        this.f13303a = a8jVar.f13303a;
        this.f13307e = a8jVar.f13307e;
        this.f13308f = a8jVar.f13308f;
        this.f13311i = a8jVar.f13311i;
        this.f13309g = a8jVar.f13309g;
        this.f13310h = a8jVar.f13310h;
    }
}
