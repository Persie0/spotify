package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class b78 {

    /* JADX INFO: renamed from: a */
    public final String f24178a;

    /* JADX INFO: renamed from: b */
    public final boolean f24179b;

    /* JADX INFO: renamed from: c */
    public final boolean f24180c;

    public /* synthetic */ b78(String str) {
        this(str, false, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b78)) {
            return false;
        }
        b78 b78Var = (b78) obj;
        return wj50.m88271j(this.f24178a, b78Var.f24178a) && this.f24179b == b78Var.f24179b && this.f24180c == b78Var.f24180c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24180c) + s571.m77245d(this.f24178a.hashCode() * 31, 31, this.f24179b);
    }

    public b78(String str, boolean z, boolean z2) {
        this.f24178a = str;
        this.f24179b = z;
        this.f24180c = z2;
    }
}
