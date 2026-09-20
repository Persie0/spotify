package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ojm0 implements dkm0, fkm0 {

    /* JADX INFO: renamed from: a */
    public final String f166100a;

    /* JADX INFO: renamed from: b */
    public final gkm0 f166101b;

    public ojm0(String str, gkm0 gkm0Var) {
        this.f166100a = str;
        this.f166101b = gkm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojm0)) {
            return false;
        }
        ojm0 ojm0Var = (ojm0) obj;
        return wj50.m88271j(this.f166100a, ojm0Var.f166100a) && wj50.m88271j(this.f166101b, ojm0Var.f166101b);
    }

    public final int hashCode() {
        return this.f166101b.hashCode() + (this.f166100a.hashCode() * 31);
    }
}
