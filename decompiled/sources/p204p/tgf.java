package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class tgf implements vwf {

    /* JADX INFO: renamed from: a */
    public final String f220181a;

    /* JADX INFO: renamed from: b */
    public final String f220182b;

    /* JADX INFO: renamed from: c */
    public final String f220183c;

    /* JADX INFO: renamed from: d */
    public final boolean f220184d;

    public tgf(String str, String str2, String str3, boolean z) {
        this.f220181a = str;
        this.f220182b = str2;
        this.f220183c = str3;
        this.f220184d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgf)) {
            return false;
        }
        tgf tgfVar = (tgf) obj;
        return wj50.m88271j(this.f220181a, tgfVar.f220181a) && wj50.m88271j(this.f220182b, tgfVar.f220182b) && wj50.m88271j(this.f220183c, tgfVar.f220183c) && this.f220184d == tgfVar.f220184d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f220184d) + s571.m77243b(s571.m77243b(this.f220181a.hashCode() * 31, 31, this.f220182b), 31, this.f220183c);
    }
}
