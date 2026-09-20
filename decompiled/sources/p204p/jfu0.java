package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class jfu0 implements kfu0 {

    /* JADX INFO: renamed from: a */
    public final String f111969a;

    /* JADX INFO: renamed from: b */
    public final String f111970b;

    /* JADX INFO: renamed from: c */
    public final String f111971c;

    /* JADX INFO: renamed from: d */
    public final String f111972d;

    /* JADX INFO: renamed from: e */
    public final List f111973e;

    public jfu0(String str, String str2, String str3, String str4, List list) {
        this.f111969a = str;
        this.f111970b = str2;
        this.f111971c = str3;
        this.f111972d = str4;
        this.f111973e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfu0)) {
            return false;
        }
        jfu0 jfu0Var = (jfu0) obj;
        return wj50.m88271j(this.f111969a, jfu0Var.f111969a) && wj50.m88271j(this.f111970b, jfu0Var.f111970b) && wj50.m88271j(this.f111971c, jfu0Var.f111971c) && wj50.m88271j(this.f111972d, jfu0Var.f111972d) && wj50.m88271j(this.f111973e, jfu0Var.f111973e);
    }

    public final int hashCode() {
        return this.f111973e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f111969a.hashCode() * 31, 31, this.f111970b), 31, this.f111971c), 31, this.f111972d);
    }
}
