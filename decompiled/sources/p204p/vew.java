package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class vew {

    /* JADX INFO: renamed from: a */
    public final String f240824a;

    /* JADX INFO: renamed from: b */
    public final int f240825b;

    /* JADX INFO: renamed from: c */
    public final int f240826c;

    /* JADX INFO: renamed from: d */
    public final String f240827d;

    public vew(int i, String str, int i2, String str2) {
        this.f240824a = str;
        this.f240825b = i;
        this.f240826c = i2;
        this.f240827d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final int m85335a() {
        return this.f240826c;
    }

    /* JADX INFO: renamed from: b */
    public final String m85336b() {
        return this.f240827d;
    }

    /* JADX INFO: renamed from: c */
    public final String m85337c() {
        return this.f240824a;
    }

    /* JADX INFO: renamed from: d */
    public final int m85338d() {
        return this.f240825b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vew)) {
            return false;
        }
        vew vewVar = (vew) obj;
        return wj50.m88271j(this.f240824a, vewVar.f240824a) && this.f240825b == vewVar.f240825b && this.f240826c == vewVar.f240826c && this.f240827d.equals(vewVar.f240827d);
    }

    public final int hashCode() {
        return this.f240827d.hashCode() + mt60.m62800g(this.f240826c, f710.m40938f(this.f240825b, this.f240824a.hashCode() * 31, 31), 31);
    }
}
