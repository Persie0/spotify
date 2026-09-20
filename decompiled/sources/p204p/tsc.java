package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tsc {

    /* JADX INFO: renamed from: a */
    public final String f223280a;

    /* JADX INFO: renamed from: b */
    public final String f223281b;

    /* JADX INFO: renamed from: c */
    public final int f223282c;

    public tsc(String str, String str2, int i) {
        this.f223280a = str;
        this.f223281b = str2;
        this.f223282c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsc)) {
            return false;
        }
        tsc tscVar = (tsc) obj;
        return wj50.m88271j(this.f223280a, tscVar.f223280a) && wj50.m88271j(this.f223281b, tscVar.f223281b) && this.f223282c == tscVar.f223282c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f223282c) + s571.m77243b(this.f223280a.hashCode() * 31, 31, this.f223281b);
    }
}
