package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ttc0 implements huc0 {

    /* JADX INFO: renamed from: a */
    public final String f223573a;

    /* JADX INFO: renamed from: b */
    public final boolean f223574b;

    public ttc0(String str, boolean z) {
        this.f223573a = str;
        this.f223574b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ttc0)) {
            return false;
        }
        ttc0 ttc0Var = (ttc0) obj;
        return wj50.m88271j(this.f223573a, ttc0Var.f223573a) && this.f223574b == ttc0Var.f223574b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223574b) + (this.f223573a.hashCode() * 31);
    }
}
