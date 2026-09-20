package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class fif implements mif {

    /* JADX INFO: renamed from: a */
    public final int f69878a;

    /* JADX INFO: renamed from: b */
    public final boolean f69879b;

    /* JADX INFO: renamed from: c */
    public final boolean f69880c;

    /* JADX INFO: renamed from: d */
    public final String f69881d;

    public fif(String str, int i, boolean z, boolean z2) {
        this.f69878a = i;
        this.f69879b = z;
        this.f69880c = z2;
        this.f69881d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fif)) {
            return false;
        }
        fif fifVar = (fif) obj;
        return this.f69878a == fifVar.f69878a && this.f69879b == fifVar.f69879b && this.f69880c == fifVar.f69880c && wj50.m88271j(this.f69881d, fifVar.f69881d);
    }

    public final int hashCode() {
        return this.f69881d.hashCode() + s571.m77245d(s571.m77245d(Integer.hashCode(this.f69878a) * 31, 31, this.f69879b), 31, this.f69880c);
    }
}
