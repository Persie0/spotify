package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class dye {

    /* JADX INFO: renamed from: a */
    public final String f54307a;

    /* JADX INFO: renamed from: b */
    public final String f54308b;

    /* JADX INFO: renamed from: c */
    public final long f54309c;

    public dye(String str, String str2, long j) {
        this.f54307a = str;
        this.f54308b = str2;
        this.f54309c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dye)) {
            return false;
        }
        dye dyeVar = (dye) obj;
        if (!wj50.m88271j(this.f54307a, dyeVar.f54307a) || !wj50.m88271j(this.f54308b, dyeVar.f54308b)) {
            return false;
        }
        long j = dyeVar.f54309c;
        int i = n6f.f150872l;
        return as91.m27074b(this.f54309c, j);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f54307a.hashCode() * 31, 31, this.f54308b);
        int i = n6f.f150872l;
        return Long.hashCode(this.f54309c) + iM77243b;
    }
}
