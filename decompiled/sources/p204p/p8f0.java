package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class p8f0 {

    /* JADX INFO: renamed from: a */
    public final qe70 f174954a;

    /* JADX INFO: renamed from: b */
    public final Map f174955b;

    /* JADX WARN: Multi-variable type inference failed */
    public p8f0(Map map, gh00 gh00Var) {
        this.f174954a = (qe70) gh00Var;
        this.f174955b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8f0)) {
            return false;
        }
        p8f0 p8f0Var = (p8f0) obj;
        return this.f174954a.equals(p8f0Var.f174954a) && wj50.m88271j(this.f174955b, p8f0Var.f174955b);
    }

    public final int hashCode() {
        return this.f174955b.hashCode() + (this.f174954a.hashCode() * 31);
    }
}
