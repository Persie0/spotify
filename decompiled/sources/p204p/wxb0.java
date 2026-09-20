package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wxb0 {

    /* JADX INFO: renamed from: a */
    public final boolean f255999a;

    /* JADX INFO: renamed from: b */
    public final boolean f256000b;

    /* JADX INFO: renamed from: c */
    public final boolean f256001c;

    public wxb0(boolean z, boolean z2, boolean z3) {
        this.f255999a = z;
        this.f256000b = z2;
        this.f256001c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxb0)) {
            return false;
        }
        wxb0 wxb0Var = (wxb0) obj;
        return this.f255999a == wxb0Var.f255999a && this.f256000b == wxb0Var.f256000b && this.f256001c == wxb0Var.f256001c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f256001c) + s571.m77245d(Boolean.hashCode(this.f255999a) * 31, 31, this.f256000b);
    }
}
