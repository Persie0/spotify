package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lar0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final String f131399a;

    /* JADX INFO: renamed from: b */
    public final jar0 f131400b;

    /* JADX INFO: renamed from: c */
    public final String f131401c;

    public lar0(String str, jar0 jar0Var, String str2) {
        this.f131399a = str;
        this.f131400b = jar0Var;
        this.f131401c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lar0)) {
            return false;
        }
        lar0 lar0Var = (lar0) obj;
        return wj50.m88271j(this.f131399a, lar0Var.f131399a) && wj50.m88271j(this.f131400b, lar0Var.f131400b) && wj50.m88271j(this.f131401c, lar0Var.f131401c);
    }

    public final int hashCode() {
        String str = this.f131399a;
        return this.f131401c.hashCode() + ((this.f131400b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }
}
