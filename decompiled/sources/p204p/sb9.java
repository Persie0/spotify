package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class sb9 implements jb3 {

    /* JADX INFO: renamed from: a */
    public final float f207381a;

    public sb9(float f) {
        this.f207381a = f;
    }

    @Override // p204p.jb3
    /* JADX INFO: renamed from: a */
    public final int mo52864a(int i, int i2, ko70 ko70Var) {
        return ms2.m62681f(1, this.f207381a, (i2 - i) / 2.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb9) && Float.compare(this.f207381a, ((sb9) obj).f207381a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f207381a);
    }

    public final String toString() {
        return ms2.m62684i(new StringBuilder("Horizontal(bias="), this.f207381a, ')');
    }
}
