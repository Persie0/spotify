package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class e3r0 implements f3r0 {

    /* JADX INFO: renamed from: a */
    public final String f55872a;

    /* JADX INFO: renamed from: b */
    public final String f55873b;

    /* JADX INFO: renamed from: c */
    public final List f55874c;

    public e3r0(String str, String str2, ae50 ae50Var) {
        this.f55872a = str;
        this.f55873b = str2;
        this.f55874c = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3r0)) {
            return false;
        }
        e3r0 e3r0Var = (e3r0) obj;
        return wj50.m88271j(this.f55872a, e3r0Var.f55872a) && wj50.m88271j(this.f55873b, e3r0Var.f55873b) && wj50.m88271j(this.f55874c, e3r0Var.f55874c);
    }

    public final int hashCode() {
        return this.f55874c.hashCode() + s571.m77243b(this.f55872a.hashCode() * 31, 31, this.f55873b);
    }
}
