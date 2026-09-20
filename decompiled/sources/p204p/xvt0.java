package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class xvt0 {

    /* JADX INFO: renamed from: a */
    public final String f266508a;

    /* JADX INFO: renamed from: b */
    public final String f266509b;

    /* JADX INFO: renamed from: c */
    public final String f266510c;

    /* JADX INFO: renamed from: d */
    public final String f266511d;

    public xvt0(String str, String str2, String str3, String str4) {
        this.f266508a = str;
        this.f266509b = str2;
        this.f266510c = str3;
        this.f266511d = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m92252a() {
        return this.f266511d;
    }

    /* JADX INFO: renamed from: b */
    public final String m92253b() {
        return this.f266509b;
    }

    /* JADX INFO: renamed from: c */
    public final String m92254c() {
        return this.f266508a;
    }

    /* JADX INFO: renamed from: d */
    public final String m92255d() {
        return this.f266510c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvt0)) {
            return false;
        }
        xvt0 xvt0Var = (xvt0) obj;
        return wj50.m88271j(this.f266508a, xvt0Var.f266508a) && wj50.m88271j(this.f266509b, xvt0Var.f266509b) && wj50.m88271j(this.f266510c, xvt0Var.f266510c) && wj50.m88271j(this.f266511d, xvt0Var.f266511d);
    }

    public final int hashCode() {
        return this.f266511d.hashCode() + s571.m77243b(s571.m77243b(this.f266508a.hashCode() * 31, 31, this.f266509b), 31, this.f266510c);
    }
}
