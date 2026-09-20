package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i3i0 {

    /* JADX INFO: renamed from: a */
    public final String f98186a;

    /* JADX INFO: renamed from: b */
    public final String f98187b;

    /* JADX INFO: renamed from: c */
    public final boolean f98188c;

    public i3i0(String str, String str2, boolean z) {
        this.f98186a = str;
        this.f98187b = str2;
        this.f98188c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3i0)) {
            return false;
        }
        i3i0 i3i0Var = (i3i0) obj;
        return wj50.m88271j(this.f98186a, i3i0Var.f98186a) && wj50.m88271j(this.f98187b, i3i0Var.f98187b) && this.f98188c == i3i0Var.f98188c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f98188c) + s571.m77243b(this.f98186a.hashCode() * 31, 31, this.f98187b);
    }
}
