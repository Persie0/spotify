package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rli implements sli {

    /* JADX INFO: renamed from: a */
    public final String f200319a;

    /* JADX INFO: renamed from: b */
    public final String f200320b;

    public rli(String str, String str2) {
        this.f200319a = str;
        this.f200320b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m75860a() {
        return this.f200320b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rli)) {
            return false;
        }
        rli rliVar = (rli) obj;
        return wj50.m88271j(this.f200319a, rliVar.f200319a) && wj50.m88271j(this.f200320b, rliVar.f200320b);
    }

    public final int hashCode() {
        return this.f200320b.hashCode() + (this.f200319a.hashCode() * 31);
    }
}
