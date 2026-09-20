package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fs20 {

    /* JADX INFO: renamed from: a */
    public final String f72751a;

    /* JADX INFO: renamed from: b */
    public final int f72752b;

    public fs20(String str, int i) {
        this.f72751a = str;
        this.f72752b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs20)) {
            return false;
        }
        fs20 fs20Var = (fs20) obj;
        return this.f72751a.equals(fs20Var.f72751a) && this.f72752b == fs20Var.f72752b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f72752b) + (this.f72751a.hashCode() * 31);
    }
}
