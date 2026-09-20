package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class l9i extends nai {

    /* JADX INFO: renamed from: a */
    public final String f131128a;

    /* JADX INFO: renamed from: b */
    public final d850 f131129b;

    public l9i(String str, d850 d850Var) {
        this.f131128a = str;
        this.f131129b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9i)) {
            return false;
        }
        l9i l9iVar = (l9i) obj;
        return wj50.m88271j(this.f131128a, l9iVar.f131128a) && wj50.m88271j(this.f131129b, l9iVar.f131129b);
    }

    public final int hashCode() {
        return this.f131129b.hashCode() + (this.f131128a.hashCode() * 31);
    }
}
