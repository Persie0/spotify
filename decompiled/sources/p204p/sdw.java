package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sdw {

    /* JADX INFO: renamed from: a */
    public final String f208095a;

    /* JADX INFO: renamed from: b */
    public final String f208096b;

    /* JADX INFO: renamed from: c */
    public final rdw f208097c;

    /* JADX INFO: renamed from: d */
    public final boolean f208098d;

    public sdw(String str, String str2, rdw rdwVar, boolean z) {
        this.f208095a = str;
        this.f208096b = str2;
        this.f208097c = rdwVar;
        this.f208098d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sdw)) {
            return false;
        }
        sdw sdwVar = (sdw) obj;
        return wj50.m88271j(this.f208095a, sdwVar.f208095a) && wj50.m88271j(this.f208096b, sdwVar.f208096b) && wj50.m88271j(this.f208097c, sdwVar.f208097c) && this.f208098d == sdwVar.f208098d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f208095a.hashCode() * 31, 31, this.f208096b);
        rdw rdwVar = this.f208097c;
        return Boolean.hashCode(this.f208098d) + ((iM77243b + (rdwVar == null ? 0 : rdwVar.hashCode())) * 961);
    }

    public /* synthetic */ sdw(String str, String str2, rdw rdwVar, boolean z, int i) {
        this(str, str2, rdwVar, (i & 16) != 0 ? false : z);
    }
}
