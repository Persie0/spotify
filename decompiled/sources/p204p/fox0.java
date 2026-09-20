package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fox0 {

    /* JADX INFO: renamed from: a */
    public final br70 f71638a;

    /* JADX INFO: renamed from: b */
    public final boolean f71639b;

    /* JADX INFO: renamed from: c */
    public final boolean f71640c;

    public fox0(br70 br70Var, boolean z, boolean z2) {
        this.f71638a = br70Var;
        this.f71639b = z;
        this.f71640c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fox0)) {
            return false;
        }
        fox0 fox0Var = (fox0) obj;
        return this.f71638a == fox0Var.f71638a && this.f71639b == fox0Var.f71639b && this.f71640c == fox0Var.f71640c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f71640c) + s571.m77245d(this.f71638a.hashCode() * 31, 31, this.f71639b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RowColumnChildSelector(type=");
        sb.append(this.f71638a);
        sb.append(", expandWidth=");
        sb.append(this.f71639b);
        sb.append(", expandHeight=");
        return s571.m77253l(sb, this.f71640c, ')');
    }
}
