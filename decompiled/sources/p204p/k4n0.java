package p204p;

import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public final class k4n0 {

    /* JADX INFO: renamed from: a */
    public final String f119250a;

    /* JADX INFO: renamed from: b */
    public final String f119251b;

    /* JADX INFO: renamed from: c */
    public final String f119252c;

    /* JADX INFO: renamed from: d */
    public final List f119253d;

    /* JADX INFO: renamed from: e */
    public final String f119254e;

    /* JADX INFO: renamed from: f */
    public final long f119255f;

    /* JADX INFO: renamed from: g */
    public final long f119256g;

    /* JADX INFO: renamed from: h */
    public final long f119257h;

    public k4n0(String str, String str2, String str3, List list, String str4, long j, long j2, long j3) {
        this.f119250a = str;
        this.f119251b = str2;
        this.f119252c = str3;
        this.f119253d = list;
        this.f119254e = str4;
        this.f119255f = j;
        this.f119256g = j2;
        this.f119257h = j3;
    }

    /* JADX INFO: renamed from: a */
    public static k4n0 m55393a(k4n0 k4n0Var, long j, long j2, long j3, int i) {
        String str = k4n0Var.f119250a;
        String str2 = k4n0Var.f119251b;
        String str3 = k4n0Var.f119252c;
        List list = k4n0Var.f119253d;
        String str4 = k4n0Var.f119254e;
        if ((i & 32) != 0) {
            j = k4n0Var.f119255f;
        }
        long j4 = j;
        long j5 = (i & 64) != 0 ? k4n0Var.f119256g : j2;
        long j6 = (i & 128) != 0 ? k4n0Var.f119257h : j3;
        k4n0Var.getClass();
        return new k4n0(str, str2, str3, list, str4, j4, j5, j6);
    }

    /* JADX INFO: renamed from: b */
    public final String m55394b() {
        return this.f119250a;
    }

    /* JADX INFO: renamed from: c */
    public final long m55395c() {
        return this.f119257h;
    }

    /* JADX INFO: renamed from: d */
    public final long m55396d() {
        return this.f119256g;
    }

    /* JADX INFO: renamed from: e */
    public final long m55397e() {
        return this.f119255f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4n0)) {
            return false;
        }
        k4n0 k4n0Var = (k4n0) obj;
        return wj50.m88271j(this.f119250a, k4n0Var.f119250a) && wj50.m88271j(this.f119251b, k4n0Var.f119251b) && wj50.m88271j(this.f119252c, k4n0Var.f119252c) && wj50.m88271j(this.f119253d, k4n0Var.f119253d) && wj50.m88271j(this.f119254e, k4n0Var.f119254e) && this.f119255f == k4n0Var.f119255f && this.f119256g == k4n0Var.f119256g && this.f119257h == k4n0Var.f119257h;
    }

    /* JADX INFO: renamed from: f */
    public final String m55398f() {
        return this.f119254e;
    }

    /* JADX INFO: renamed from: g */
    public final String m55399g() {
        return this.f119251b;
    }

    /* JADX INFO: renamed from: h */
    public final String m55400h() {
        return this.f119252c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f119257h) + dq60.m36605e(dq60.m36605e(s571.m77243b(s571.m77244c(s571.m77243b(s571.m77243b(this.f119250a.hashCode() * 31, 31, this.f119251b), 31, this.f119252c), 31, this.f119253d), 31, this.f119254e), this.f119255f, 31), this.f119256g, 31);
    }

    /* JADX INFO: renamed from: i */
    public final List m55401i() {
        return this.f119253d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k4n0(long j, int i, String str) {
        String str2;
        String string = UUID.randomUUID().toString();
        String str3 = (i & 2) != 0 ? "unknown" : str;
        String str4 = (i & 4) == 0 ? d6n0.f45729b : "unknown";
        if ((i & 16) != 0) {
            str2 = "";
        } else {
            str2 = "waze";
        }
        this(string, str3, str4, lau.f131415a, str2, (i & 32) != 0 ? 0L : j, 0L, 0L);
    }
}
