package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class oje0 {

    /* JADX INFO: renamed from: a */
    public final String f166054a;

    /* JADX INFO: renamed from: b */
    public final String f166055b;

    /* JADX INFO: renamed from: c */
    public final String f166056c;

    /* JADX INFO: renamed from: d */
    public final String f166057d;

    /* JADX INFO: renamed from: e */
    public final String f166058e;

    /* JADX INFO: renamed from: f */
    public final String f166059f;

    public oje0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f166054a = str;
        this.f166055b = str2;
        this.f166056c = str3;
        this.f166057d = str4;
        this.f166058e = str5;
        this.f166059f = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oje0)) {
            return false;
        }
        oje0 oje0Var = (oje0) obj;
        return wj50.m88271j(this.f166054a, oje0Var.f166054a) && wj50.m88271j(this.f166055b, oje0Var.f166055b) && wj50.m88271j(this.f166056c, oje0Var.f166056c) && wj50.m88271j(this.f166057d, oje0Var.f166057d) && wj50.m88271j(this.f166058e, oje0Var.f166058e) && wj50.m88271j(this.f166059f, oje0Var.f166059f);
    }

    public final int hashCode() {
        return this.f166059f.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(this.f166054a.hashCode() * 31, 31, this.f166055b), 31, this.f166056c), 31, this.f166057d), 31, this.f166058e);
    }
}
