package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f172069a;

    /* JADX INFO: renamed from: b */
    public final y791 f172070b;

    public oz31(String str, y791 y791Var) {
        this.f172069a = str;
        this.f172070b = y791Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz31)) {
            return false;
        }
        oz31 oz31Var = (oz31) obj;
        return wj50.m88271j(this.f172069a, oz31Var.f172069a) && wj50.m88271j(this.f172070b, oz31Var.f172070b);
    }

    public final int hashCode() {
        return this.f172070b.hashCode() + (this.f172069a.hashCode() * 31);
    }
}
