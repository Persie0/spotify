package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class oo2 {

    /* JADX INFO: renamed from: a */
    public final int f167446a;

    /* JADX INFO: renamed from: b */
    public final String f167447b;

    /* JADX INFO: renamed from: c */
    public final String f167448c;

    /* JADX INFO: renamed from: d */
    public final String f167449d;

    /* JADX INFO: renamed from: e */
    public final List f167450e;

    public oo2(int i, String str, String str2, String str3, ro80 ro80Var) {
        this.f167446a = i;
        this.f167447b = str;
        this.f167448c = str2;
        this.f167449d = str3;
        this.f167450e = ro80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo2)) {
            return false;
        }
        oo2 oo2Var = (oo2) obj;
        return this.f167446a == oo2Var.f167446a && this.f167447b.equals(oo2Var.f167447b) && this.f167448c.equals(oo2Var.f167448c) && this.f167449d.equals(oo2Var.f167449d) && wj50.m88271j(this.f167450e, oo2Var.f167450e);
    }

    public final int hashCode() {
        return this.f167450e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(Integer.hashCode(this.f167446a) * 31, 31, this.f167447b), 31, this.f167448c), 31, this.f167449d);
    }
}
