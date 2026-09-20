package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class v18 {

    /* JADX INFO: renamed from: e */
    public static final v18 f236274e;

    /* JADX INFO: renamed from: a */
    public final String f236275a;

    /* JADX INFO: renamed from: b */
    public final xul0 f236276b;

    /* JADX INFO: renamed from: c */
    public final xul0 f236277c;

    /* JADX INFO: renamed from: d */
    public final xul0 f236278d;

    static {
        C2244p5 c2244p5 = C2244p5.f174033a;
        f236274e = new v18("", c2244p5, c2244p5, c2244p5);
    }

    public v18(String str, xul0 xul0Var, xul0 xul0Var2, xul0 xul0Var3) {
        this.f236275a = str;
        this.f236276b = xul0Var;
        this.f236277c = xul0Var2;
        this.f236278d = xul0Var3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v18) {
            v18 v18Var = (v18) obj;
            if (this.f236275a.equals(v18Var.f236275a) && this.f236276b.equals(v18Var.f236276b) && this.f236277c.equals(v18Var.f236277c) && this.f236278d.equals(v18Var.f236278d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f236275a.hashCode() ^ 1000003) * 1000003) ^ this.f236276b.hashCode()) * 1000003) ^ this.f236277c.hashCode()) * 1000003) ^ this.f236278d.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f236276b);
        return klh.m56837i(edb.m38573v("PreviewAction{previewId=", this.f236275a, ", previewKey=", strValueOf, ", previewUrl="), String.valueOf(this.f236277c), ", maxDuration=", String.valueOf(this.f236278d), "}");
    }
}
