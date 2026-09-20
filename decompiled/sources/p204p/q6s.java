package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q6s {

    /* JADX INFO: renamed from: a */
    public final String f185909a;

    /* JADX INFO: renamed from: b */
    public final int f185910b;

    /* JADX INFO: renamed from: c */
    public final int f185911c;

    public q6s(String str, int i, int i2) {
        this.f185909a = str;
        this.f185910b = i;
        this.f185911c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6s)) {
            return false;
        }
        q6s q6sVar = (q6s) obj;
        return wj50.m88271j(this.f185909a, q6sVar.f185909a) && this.f185910b == q6sVar.f185910b && this.f185911c == q6sVar.f185911c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f185911c) + mt60.m62800g(this.f185910b, this.f185909a.hashCode() * 31, 31);
    }
}
