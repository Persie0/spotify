package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class uqr0 {

    /* JADX INFO: renamed from: a */
    public final String f233097a;

    /* JADX INFO: renamed from: b */
    public final String f233098b;

    /* JADX INFO: renamed from: c */
    public final int f233099c;

    public uqr0(String str, String str2, int i) {
        this.f233097a = str;
        this.f233098b = str2;
        this.f233099c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqr0)) {
            return false;
        }
        uqr0 uqr0Var = (uqr0) obj;
        return wj50.m88271j(this.f233097a, uqr0Var.f233097a) && wj50.m88271j(this.f233098b, uqr0Var.f233098b) && this.f233099c == uqr0Var.f233099c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f233099c) + s571.m77243b(this.f233097a.hashCode() * 31, 31, this.f233098b);
    }
}
