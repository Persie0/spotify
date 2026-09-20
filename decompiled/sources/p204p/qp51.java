package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes10.dex */
public final class qp51 {

    /* JADX INFO: renamed from: a */
    public final Uri f191135a;

    /* JADX INFO: renamed from: b */
    public final String f191136b;

    /* JADX INFO: renamed from: c */
    public final String f191137c;

    /* JADX INFO: renamed from: d */
    public final vo51 f191138d;

    /* JADX INFO: renamed from: e */
    public final String f191139e;

    /* JADX INFO: renamed from: f */
    public final String f191140f;

    /* JADX INFO: renamed from: g */
    public final String f191141g;

    /* JADX INFO: renamed from: h */
    public final int f191142h;

    public qp51(Uri uri, String str, String str2, vo51 vo51Var, String str3, String str4, String str5, int i) {
        this.f191135a = uri;
        this.f191136b = str;
        this.f191137c = str2;
        this.f191138d = vo51Var;
        this.f191139e = str3;
        this.f191140f = str4;
        this.f191141g = str5;
        this.f191142h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp51)) {
            return false;
        }
        qp51 qp51Var = (qp51) obj;
        return this.f191135a.equals(qp51Var.f191135a) && this.f191136b.equals(qp51Var.f191136b) && this.f191137c.equals(qp51Var.f191137c) && this.f191138d.equals(qp51Var.f191138d) && this.f191139e.equals(qp51Var.f191139e) && this.f191140f.equals(qp51Var.f191140f) && this.f191141g.equals(qp51Var.f191141g) && this.f191142h == qp51Var.f191142h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f191142h) + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(f710.m40938f(1, s571.m77243b(this.f191135a.hashCode() * 31, 31, this.f191136b), 31), 31, this.f191137c), 29791, this.f191138d.f243375a), 31, this.f191139e), 31, this.f191140f), 31, this.f191141g);
    }
}
