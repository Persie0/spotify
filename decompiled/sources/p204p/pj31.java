package p204p;

import com.spotify.jam.internal.socialconnect.models.DeviceBroadcastStatus;
import com.spotify.jam.internal.socialconnect.models.SessionConfiguration;
import com.spotify.jam.internal.socialconnect.models.SessionDeviceInfo;
import com.spotify.jam.internal.socialconnect.models.SessionOrigin;
import com.spotify.jam.internal.socialconnect.models.SessionUserCapabilities;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class pj31 {

    /* JADX INFO: renamed from: A */
    public final boolean f178133A;

    /* JADX INFO: renamed from: a */
    public final boolean f178134a;

    /* JADX INFO: renamed from: b */
    public final boolean f178135b;

    /* JADX INFO: renamed from: c */
    public final boolean f178136c;

    /* JADX INFO: renamed from: d */
    public final boolean f178137d;

    /* JADX INFO: renamed from: e */
    public final boolean f178138e;

    /* JADX INFO: renamed from: f */
    public final boolean f178139f;

    /* JADX INFO: renamed from: g */
    public final String f178140g;

    /* JADX INFO: renamed from: h */
    public final String f178141h;

    /* JADX INFO: renamed from: i */
    public final List f178142i;

    /* JADX INFO: renamed from: j */
    public final int f178143j;

    /* JADX INFO: renamed from: k */
    public final p301 f178144k;

    /* JADX INFO: renamed from: l */
    public final j3n0 f178145l;

    /* JADX INFO: renamed from: m */
    public final String f178146m;

    /* JADX INFO: renamed from: n */
    public final String f178147n;

    /* JADX INFO: renamed from: o */
    public final Integer f178148o;

    /* JADX INFO: renamed from: p */
    public final boolean f178149p;

    /* JADX INFO: renamed from: q */
    public final boolean f178150q;

    /* JADX INFO: renamed from: r */
    public final DeviceBroadcastStatus f178151r;

    /* JADX INFO: renamed from: s */
    public final SessionOrigin f178152s;

    /* JADX INFO: renamed from: t */
    public final SessionConfiguration f178153t;

    /* JADX INFO: renamed from: u */
    public final SessionDeviceInfo f178154u;

    /* JADX INFO: renamed from: v */
    public final boolean f178155v;

    /* JADX INFO: renamed from: w */
    public final boolean f178156w;

    /* JADX INFO: renamed from: x */
    public final SessionUserCapabilities f178157x;

    /* JADX INFO: renamed from: y */
    public final boolean f178158y;

    /* JADX INFO: renamed from: z */
    public final boolean f178159z;

    public pj31(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str, String str2, List list, int i, p301 p301Var, j3n0 j3n0Var, String str3, String str4, Integer num, boolean z7, boolean z8, DeviceBroadcastStatus deviceBroadcastStatus, SessionOrigin sessionOrigin, SessionConfiguration sessionConfiguration, SessionDeviceInfo sessionDeviceInfo, boolean z9, boolean z10, SessionUserCapabilities sessionUserCapabilities, boolean z11, boolean z12, boolean z13) {
        this.f178134a = z;
        this.f178135b = z2;
        this.f178136c = z3;
        this.f178137d = z4;
        this.f178138e = z5;
        this.f178139f = z6;
        this.f178140g = str;
        this.f178141h = str2;
        this.f178142i = list;
        this.f178143j = i;
        this.f178144k = p301Var;
        this.f178145l = j3n0Var;
        this.f178146m = str3;
        this.f178147n = str4;
        this.f178148o = num;
        this.f178149p = z7;
        this.f178150q = z8;
        this.f178151r = deviceBroadcastStatus;
        this.f178152s = sessionOrigin;
        this.f178153t = sessionConfiguration;
        this.f178154u = sessionDeviceInfo;
        this.f178155v = z9;
        this.f178156w = z10;
        this.f178157x = sessionUserCapabilities;
        this.f178158y = z11;
        this.f178159z = z12;
        this.f178133A = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj31)) {
            return false;
        }
        pj31 pj31Var = (pj31) obj;
        return this.f178134a == pj31Var.f178134a && this.f178135b == pj31Var.f178135b && this.f178136c == pj31Var.f178136c && this.f178137d == pj31Var.f178137d && this.f178138e == pj31Var.f178138e && this.f178139f == pj31Var.f178139f && wj50.m88271j(this.f178140g, pj31Var.f178140g) && wj50.m88271j(this.f178141h, pj31Var.f178141h) && wj50.m88271j(this.f178142i, pj31Var.f178142i) && this.f178143j == pj31Var.f178143j && this.f178144k == pj31Var.f178144k && this.f178145l == pj31Var.f178145l && wj50.m88271j(this.f178146m, pj31Var.f178146m) && wj50.m88271j(this.f178147n, pj31Var.f178147n) && wj50.m88271j(this.f178148o, pj31Var.f178148o) && this.f178149p == pj31Var.f178149p && this.f178150q == pj31Var.f178150q && wj50.m88271j(this.f178151r, pj31Var.f178151r) && wj50.m88271j(this.f178152s, pj31Var.f178152s) && wj50.m88271j(this.f178153t, pj31Var.f178153t) && wj50.m88271j(this.f178154u, pj31Var.f178154u) && this.f178155v == pj31Var.f178155v && this.f178156w == pj31Var.f178156w && wj50.m88271j(this.f178157x, pj31Var.f178157x) && this.f178158y == pj31Var.f178158y && this.f178159z == pj31Var.f178159z && this.f178133A == pj31Var.f178133A;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f178134a) * 31, 31, this.f178135b), 31, this.f178136c), 31, this.f178137d), 31, this.f178138e), 31, this.f178139f), 31, this.f178140g);
        String str = this.f178141h;
        int iHashCode = (this.f178145l.hashCode() + ((this.f178144k.hashCode() + f710.m40938f(this.f178143j, s571.m77244c((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f178142i), 31)) * 31)) * 31;
        String str2 = this.f178146m;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f178147n;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f178148o;
        int iM77245d = s571.m77245d(s571.m77245d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f178149p), 31, this.f178150q);
        DeviceBroadcastStatus deviceBroadcastStatus = this.f178151r;
        int iHashCode4 = (iM77245d + (deviceBroadcastStatus == null ? 0 : deviceBroadcastStatus.hashCode())) * 31;
        SessionOrigin sessionOrigin = this.f178152s;
        int iHashCode5 = (iHashCode4 + (sessionOrigin == null ? 0 : sessionOrigin.hashCode())) * 31;
        SessionConfiguration sessionConfiguration = this.f178153t;
        int iHashCode6 = (iHashCode5 + (sessionConfiguration == null ? 0 : sessionConfiguration.hashCode())) * 31;
        SessionDeviceInfo sessionDeviceInfo = this.f178154u;
        int iM77245d2 = s571.m77245d(s571.m77245d((iHashCode6 + (sessionDeviceInfo == null ? 0 : sessionDeviceInfo.hashCode())) * 31, 31, this.f178155v), 31, this.f178156w);
        SessionUserCapabilities sessionUserCapabilities = this.f178157x;
        return Boolean.hashCode(this.f178133A) + s571.m77245d(s571.m77245d((iM77245d2 + (sessionUserCapabilities != null ? sessionUserCapabilities.hashCode() : 0)) * 31, 31, this.f178158y), 31, this.f178159z);
    }

    public /* synthetic */ pj31() {
        this(false, false, false, false, false, false, "", null, lau.f131415a, 1, p301.UNKNOWN_SESSION_TYPE, j3n0.UNAVAILABLE, null, null, null, false, false, null, null, null, null, false, false, null, false, false, false);
    }
}
