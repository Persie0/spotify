package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e5e {

    /* JADX INFO: renamed from: a */
    public final int f56383a;

    /* JADX INFO: renamed from: b */
    public final boolean f56384b;

    /* JADX INFO: renamed from: c */
    public final boolean f56385c;

    public e5e(int i, boolean z, boolean z2) {
        this.f56383a = i;
        this.f56384b = z;
        this.f56385c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5e)) {
            return false;
        }
        e5e e5eVar = (e5e) obj;
        return this.f56383a == e5eVar.f56383a && this.f56384b == e5eVar.f56384b && this.f56385c == e5eVar.f56385c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56385c) + s571.m77245d(Integer.hashCode(this.f56383a) * 31, 31, this.f56384b);
    }
}
