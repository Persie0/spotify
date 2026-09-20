package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f154071a;

    /* JADX INFO: renamed from: b */
    public final String f154072b;

    /* JADX INFO: renamed from: c */
    public final long f154073c;

    public nhs0(String str, String str2, long j) {
        this.f154071a = str;
        this.f154072b = str2;
        this.f154073c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhs0)) {
            return false;
        }
        nhs0 nhs0Var = (nhs0) obj;
        return wj50.m88271j(this.f154071a, nhs0Var.f154071a) && wj50.m88271j(this.f154072b, nhs0Var.f154072b) && this.f154073c == nhs0Var.f154073c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f154073c) + s571.m77243b(this.f154071a.hashCode() * 31, 31, this.f154072b);
    }
}
