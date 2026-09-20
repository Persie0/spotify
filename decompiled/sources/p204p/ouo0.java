package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ouo0 {

    /* JADX INFO: renamed from: a */
    public final int f170328a;

    /* JADX INFO: renamed from: b */
    public final String f170329b;

    /* JADX INFO: renamed from: c */
    public final String f170330c;

    /* JADX INFO: renamed from: d */
    public final String f170331d;

    public /* synthetic */ ouo0() {
        this("", "", 1, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ouo0)) {
            return false;
        }
        ouo0 ouo0Var = (ouo0) obj;
        return this.f170328a == ouo0Var.f170328a && wj50.m88271j(this.f170329b, ouo0Var.f170329b) && wj50.m88271j(this.f170330c, ouo0Var.f170330c) && wj50.m88271j(this.f170331d, ouo0Var.f170331d);
    }

    public final int hashCode() {
        return this.f170331d.hashCode() + s571.m77243b(s571.m77243b(edb.m38547C(this.f170328a) * 31, 31, this.f170329b), 31, this.f170330c);
    }

    public ouo0(String str, String str2, int i, String str3) {
        this.f170328a = i;
        this.f170329b = str;
        this.f170330c = str2;
        this.f170331d = str3;
    }
}
