package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class utb implements wtb {

    /* JADX INFO: renamed from: a */
    public final vjr0 f233863a;

    public utb(vjr0 vjr0Var) {
        this.f233863a = vjr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utb) && wj50.m88271j(this.f233863a, ((utb) obj).f233863a);
    }

    public final int hashCode() {
        vjr0 vjr0Var = this.f233863a;
        if (vjr0Var == null) {
            return 0;
        }
        return vjr0Var.hashCode();
    }
}
