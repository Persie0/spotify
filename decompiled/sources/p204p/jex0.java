package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class jex0 {

    /* JADX INFO: renamed from: a */
    public final String f111707a;

    /* JADX INFO: renamed from: b */
    public final String f111708b;

    /* JADX INFO: renamed from: c */
    public final String f111709c;

    /* JADX INFO: renamed from: d */
    public final String f111710d;

    /* JADX INFO: renamed from: e */
    public final String f111711e;

    /* JADX INFO: renamed from: f */
    public final int f111712f;

    /* JADX INFO: renamed from: g */
    public final boolean f111713g;

    /* JADX INFO: renamed from: h */
    public final String f111714h;

    /* JADX INFO: renamed from: i */
    public final String f111715i;

    /* JADX INFO: renamed from: j */
    public final String f111716j;

    public jex0(String str, String str2, String str3, String str4, String str5, int i, boolean z, String str6) {
        String str7;
        String str8;
        this.f111707a = str;
        this.f111708b = str2;
        this.f111709c = str3;
        this.f111710d = str4;
        this.f111711e = str5;
        this.f111712f = i;
        this.f111713g = z;
        this.f111714h = str6;
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            str7 = "spotify:internal:allboarding:origin:home-audiobooks-sub-feed";
        } else if (iM38547C == 1) {
            str7 = xoc1.f263943N0.f243453a;
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str7 = xoc1.f263927L0.f243453a;
        }
        this.f111715i = str7;
        if (str2.length() == 0) {
            int iM38547C2 = edb.m38547C(i);
            if (iM38547C2 == 0) {
                str8 = "https://nftonboarding-images.scdn.co/ao/sub-feed-img-us.png";
            } else if (iM38547C2 == 1) {
                str8 = "https://nftonboarding-images.scdn.co/po/podcast-onboarding-sub-feed.png";
            } else {
                if (iM38547C2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str8 = "https://nftonboarding-images.scdn.co/delayed-to.png";
            }
            str2 = str8;
        }
        this.f111716j = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m53122a() {
        return this.f111711e;
    }

    /* JADX INFO: renamed from: b */
    public final String m53123b() {
        return this.f111707a;
    }

    /* JADX INFO: renamed from: c */
    public final String m53124c() {
        return this.f111716j;
    }

    /* JADX INFO: renamed from: d */
    public final String m53125d() {
        return this.f111715i;
    }

    /* JADX INFO: renamed from: e */
    public final String m53126e() {
        return this.f111714h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jex0)) {
            return false;
        }
        jex0 jex0Var = (jex0) obj;
        return this.f111707a.equals(jex0Var.f111707a) && wj50.m88271j(this.f111708b, jex0Var.f111708b) && wj50.m88271j(this.f111709c, jex0Var.f111709c) && wj50.m88271j(this.f111710d, jex0Var.f111710d) && wj50.m88271j(this.f111711e, jex0Var.f111711e) && this.f111712f == jex0Var.f111712f && this.f111713g == jex0Var.f111713g && this.f111714h.equals(jex0Var.f111714h);
    }

    /* JADX INFO: renamed from: f */
    public final String m53127f() {
        return this.f111710d;
    }

    /* JADX INFO: renamed from: g */
    public final String m53128g() {
        return this.f111709c;
    }

    /* JADX INFO: renamed from: h */
    public final int m53129h() {
        return this.f111712f;
    }

    public final int hashCode() {
        return this.f111714h.hashCode() + s571.m77245d(f710.m40938f(this.f111712f, s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f111707a.hashCode() * 31, 31, this.f111708b), 31, this.f111709c), 31, this.f111710d), 31, this.f111711e), 31), 31, this.f111713g);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m53130i() {
        return this.f111713g;
    }
}
