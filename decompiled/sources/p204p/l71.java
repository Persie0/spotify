package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f130530a;

    /* JADX INFO: renamed from: b */
    public final boolean f130531b;

    /* JADX INFO: renamed from: c */
    public final boolean f130532c;

    public l71(String str, boolean z, boolean z2) {
        this.f130530a = str;
        this.f130531b = z;
        this.f130532c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l71)) {
            return false;
        }
        l71 l71Var = (l71) obj;
        return wj50.m88271j(this.f130530a, l71Var.f130530a) && this.f130531b == l71Var.f130531b && this.f130532c == l71Var.f130532c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f130532c) + s571.m77245d(this.f130530a.hashCode() * 31, 31, this.f130531b);
    }
}
