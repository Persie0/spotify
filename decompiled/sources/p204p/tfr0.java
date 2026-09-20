package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tfr0 {

    /* JADX INFO: renamed from: a */
    public final String f220040a;

    /* JADX INFO: renamed from: b */
    public final String f220041b;

    /* JADX INFO: renamed from: c */
    public final int f220042c;

    /* JADX INFO: renamed from: d */
    public final boolean f220043d;

    public tfr0(String str, int i, String str2, boolean z) {
        this.f220040a = str;
        this.f220041b = str2;
        this.f220042c = i;
        this.f220043d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfr0)) {
            return false;
        }
        tfr0 tfr0Var = (tfr0) obj;
        return wj50.m88271j(this.f220040a, tfr0Var.f220040a) && wj50.m88271j(this.f220041b, tfr0Var.f220041b) && this.f220042c == tfr0Var.f220042c && this.f220043d == tfr0Var.f220043d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220043d) + mt60.m62800g(this.f220042c, s571.m77243b(this.f220040a.hashCode() * 31, 31, this.f220041b), 31);
    }
}
