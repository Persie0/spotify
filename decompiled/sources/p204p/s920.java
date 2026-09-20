package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class s920 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f206823b;

    /* JADX INFO: renamed from: c */
    public final String f206824c;

    /* JADX INFO: renamed from: d */
    public final jsa0 f206825d;

    /* JADX INFO: renamed from: e */
    public final List f206826e;

    public s920(String str, String str2, jsa0 jsa0Var, List list) {
        super(8);
        this.f206823b = str;
        this.f206824c = str2;
        this.f206825d = jsa0Var;
        this.f206826e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s920)) {
            return false;
        }
        s920 s920Var = (s920) obj;
        return wj50.m88271j(this.f206823b, s920Var.f206823b) && wj50.m88271j(this.f206824c, s920Var.f206824c) && wj50.m88271j(this.f206825d, s920Var.f206825d) && wj50.m88271j(this.f206826e, s920Var.f206826e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f206823b.hashCode() * 31, 31, this.f206824c);
        jsa0 jsa0Var = this.f206825d;
        return this.f206826e.hashCode() + ((iM77243b + (jsa0Var == null ? 0 : jsa0Var.hashCode())) * 31);
    }
}
