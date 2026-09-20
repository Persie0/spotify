package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ohp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f165522a;

    /* JADX INFO: renamed from: b */
    public final String f165523b;

    /* JADX INFO: renamed from: c */
    public final int f165524c;

    public ohp0(String str, String str2, int i) {
        this.f165522a = str;
        this.f165523b = str2;
        this.f165524c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohp0)) {
            return false;
        }
        ohp0 ohp0Var = (ohp0) obj;
        return wj50.m88271j(this.f165522a, ohp0Var.f165522a) && wj50.m88271j(this.f165523b, ohp0Var.f165523b) && this.f165524c == ohp0Var.f165524c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f165524c) + s571.m77243b(this.f165522a.hashCode() * 31, 31, this.f165523b);
    }
}
