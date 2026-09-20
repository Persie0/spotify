package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pvq0 extends uvq0 {

    /* JADX INFO: renamed from: a */
    public final String f181818a;

    /* JADX INFO: renamed from: b */
    public final String f181819b;

    /* JADX INFO: renamed from: c */
    public final d850 f181820c;

    public pvq0(String str, String str2, d850 d850Var) {
        this.f181818a = str;
        this.f181819b = str2;
        this.f181820c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvq0)) {
            return false;
        }
        pvq0 pvq0Var = (pvq0) obj;
        return wj50.m88271j(this.f181818a, pvq0Var.f181818a) && wj50.m88271j(this.f181819b, pvq0Var.f181819b) && wj50.m88271j(this.f181820c, pvq0Var.f181820c);
    }

    public final int hashCode() {
        String str = this.f181818a;
        return this.f181820c.hashCode() + s571.m77243b((str == null ? 0 : str.hashCode()) * 31, 31, this.f181819b);
    }
}
