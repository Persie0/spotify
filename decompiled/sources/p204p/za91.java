package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class za91 extends db91 {

    /* JADX INFO: renamed from: a */
    public final String f281006a;

    /* JADX INFO: renamed from: b */
    public final long f281007b;

    public za91(String str, long j) {
        this.f281006a = str;
        this.f281007b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za91)) {
            return false;
        }
        za91 za91Var = (za91) obj;
        return wj50.m88271j(this.f281006a, za91Var.f281006a) && this.f281007b == za91Var.f281007b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f281007b) + (this.f281006a.hashCode() * 31);
    }
}
