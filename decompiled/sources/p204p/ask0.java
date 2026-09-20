package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ask0 {

    /* JADX INFO: renamed from: a */
    public final String f19466a;

    /* JADX INFO: renamed from: b */
    public final String f19467b;

    public ask0(String str, String str2) {
        this.f19466a = str;
        this.f19467b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ask0)) {
            return false;
        }
        ask0 ask0Var = (ask0) obj;
        return wj50.m88271j(this.f19466a, ask0Var.f19466a) && wj50.m88271j(this.f19467b, ask0Var.f19467b);
    }

    public final int hashCode() {
        return this.f19467b.hashCode() + (this.f19466a.hashCode() * 31);
    }
}
