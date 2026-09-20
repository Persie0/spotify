package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class fu9 implements he41 {

    /* JADX INFO: renamed from: d */
    public static final ak0 f73443d = new ak0(9);

    /* JADX INFO: renamed from: a */
    public final mec0 f73444a;

    /* JADX INFO: renamed from: b */
    public final String f73445b;

    /* JADX INFO: renamed from: c */
    public final String f73446c;

    public fu9(mec0 mec0Var, String str, String str2) {
        this.f73444a = mec0Var;
        this.f73445b = str;
        this.f73446c = str2;
    }

    @Override // p204p.he41
    /* JADX INFO: renamed from: a */
    public final int mo27216a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu9)) {
            return false;
        }
        fu9 fu9Var = (fu9) obj;
        return this.f73444a.equals(fu9Var.f73444a) && wj50.m88271j(this.f73445b, fu9Var.f73445b) && wj50.m88271j(this.f73446c, fu9Var.f73446c);
    }

    @Override // p204p.he41
    public final fka1 getType() {
        return f73443d;
    }

    public final int hashCode() {
        int iHashCode = this.f73444a.hashCode() * 31;
        String str = this.f73445b;
        return this.f73446c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
