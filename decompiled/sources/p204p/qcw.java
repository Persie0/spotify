package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qcw {

    /* JADX INFO: renamed from: a */
    public final int f187417a;

    /* JADX INFO: renamed from: b */
    public final String f187418b;

    /* JADX INFO: renamed from: c */
    public final int f187419c;

    public qcw(int i, String str, int i2) {
        this.f187417a = i;
        this.f187418b = str;
        this.f187419c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcw)) {
            return false;
        }
        qcw qcwVar = (qcw) obj;
        return this.f187417a == qcwVar.f187417a && wj50.m88271j(this.f187418b, qcwVar.f187418b) && this.f187419c == qcwVar.f187419c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187419c) + mt60.m62800g(240, s571.m77243b(Integer.hashCode(this.f187417a) * 31, 31, this.f187418b), 31);
    }
}
