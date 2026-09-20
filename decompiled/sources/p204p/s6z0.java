package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class s6z0 {

    /* JADX INFO: renamed from: a */
    public final String f206239a;

    /* JADX INFO: renamed from: b */
    public final List f206240b;

    /* JADX INFO: renamed from: c */
    public final qe70 f206241c;

    /* JADX WARN: Multi-variable type inference failed */
    public s6z0(String str, ro80 ro80Var, th00 th00Var) {
        this.f206239a = str;
        this.f206240b = ro80Var;
        this.f206241c = (qe70) th00Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m77351a() {
        return this.f206240b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.qe70, p.th00] */
    /* JADX INFO: renamed from: b */
    public final th00 m77352b() {
        return this.f206241c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6z0)) {
            return false;
        }
        s6z0 s6z0Var = (s6z0) obj;
        return wj50.m88271j(this.f206239a, s6z0Var.f206239a) && wj50.m88271j(this.f206240b, s6z0Var.f206240b);
    }

    public final int hashCode() {
        return this.f206240b.hashCode() + (this.f206239a.hashCode() * 31);
    }
}
