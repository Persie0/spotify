package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ql21 {

    /* JADX INFO: renamed from: a */
    public final ol21 f189710a;

    /* JADX INFO: renamed from: b */
    public final String f189711b;

    /* JADX INFO: renamed from: c */
    public final String f189712c;

    /* JADX INFO: renamed from: d */
    public final nl21 f189713d;

    /* JADX INFO: renamed from: e */
    public final boolean f189714e;

    public ql21(ol21 ol21Var, String str, String str2, nl21 nl21Var, boolean z) {
        this.f189710a = ol21Var;
        this.f189711b = str;
        this.f189712c = str2;
        this.f189713d = nl21Var;
        this.f189714e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql21)) {
            return false;
        }
        ql21 ql21Var = (ql21) obj;
        return this.f189710a == ql21Var.f189710a && wj50.m88271j(this.f189711b, ql21Var.f189711b) && wj50.m88271j(this.f189712c, ql21Var.f189712c) && wj50.m88271j(this.f189713d, ql21Var.f189713d) && this.f189714e == ql21Var.f189714e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189714e) + ((this.f189713d.hashCode() + s571.m77243b(s571.m77243b(this.f189710a.hashCode() * 31, 31, this.f189711b), 31, this.f189712c)) * 31);
    }
}
