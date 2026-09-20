package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class shs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f209256a;

    /* JADX INFO: renamed from: b */
    public final String f209257b;

    /* JADX INFO: renamed from: c */
    public final long f209258c;

    public shs0(String str, String str2, long j) {
        this.f209256a = str;
        this.f209257b = str2;
        this.f209258c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shs0)) {
            return false;
        }
        shs0 shs0Var = (shs0) obj;
        return wj50.m88271j(this.f209256a, shs0Var.f209256a) && wj50.m88271j(this.f209257b, shs0Var.f209257b) && this.f209258c == shs0Var.f209258c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f209258c) + s571.m77243b(this.f209256a.hashCode() * 31, 31, this.f209257b);
    }
}
