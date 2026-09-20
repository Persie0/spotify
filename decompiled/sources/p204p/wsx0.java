package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wsx0 implements i040 {

    /* JADX INFO: renamed from: a */
    public final String f254774a;

    /* JADX INFO: renamed from: b */
    public final String f254775b;

    /* JADX INFO: renamed from: c */
    public final String f254776c;

    /* JADX INFO: renamed from: d */
    public final String f254777d;

    public wsx0(String str, String str2, String str3) {
        this.f254774a = str;
        this.f254775b = str2;
        this.f254776c = str3;
        this.f254777d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsx0)) {
            return false;
        }
        wsx0 wsx0Var = (wsx0) obj;
        return wj50.m88271j(this.f254774a, wsx0Var.f254774a) && wj50.m88271j(this.f254775b, wsx0Var.f254775b) && wj50.m88271j(this.f254776c, wsx0Var.f254776c);
    }

    @Override // p204p.i040
    public final String getId() {
        return this.f254777d;
    }

    public final int hashCode() {
        return this.f254776c.hashCode() + s571.m77243b(this.f254774a.hashCode() * 31, 31, this.f254775b);
    }
}
