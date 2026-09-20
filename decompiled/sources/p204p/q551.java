package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class q551 {

    /* JADX INFO: renamed from: a */
    public final boolean f185403a;

    /* JADX INFO: renamed from: b */
    public final u4y f185404b;

    /* JADX INFO: renamed from: c */
    public final boolean f185405c;

    public q551(boolean z, u4y u4yVar, boolean z2) {
        this.f185403a = z;
        this.f185404b = u4yVar;
        this.f185405c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q551)) {
            return false;
        }
        q551 q551Var = (q551) obj;
        return this.f185403a == q551Var.f185403a && wj50.m88271j(this.f185404b, q551Var.f185404b) && this.f185405c == q551Var.f185405c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185405c) + ((this.f185404b.hashCode() + (Boolean.hashCode(this.f185403a) * 31)) * 31);
    }
}
