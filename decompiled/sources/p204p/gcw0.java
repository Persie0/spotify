package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gcw0 implements jcw0 {

    /* JADX INFO: renamed from: a */
    public final String f78661a;

    /* JADX INFO: renamed from: b */
    public final boolean f78662b;

    /* JADX INFO: renamed from: c */
    public final boolean f78663c;

    public gcw0(String str, boolean z, boolean z2) {
        this.f78661a = str;
        this.f78662b = z;
        this.f78663c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcw0)) {
            return false;
        }
        gcw0 gcw0Var = (gcw0) obj;
        return wj50.m88271j(this.f78661a, gcw0Var.f78661a) && this.f78662b == gcw0Var.f78662b && this.f78663c == gcw0Var.f78663c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f78663c) + s571.m77245d(this.f78661a.hashCode() * 31, 31, this.f78662b);
    }
}
