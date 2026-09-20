package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class o8f {

    /* JADX INFO: renamed from: a */
    public final v670 f162795a;

    /* JADX INFO: renamed from: b */
    public final List f162796b;

    public o8f(v670 v670Var, List list) {
        this.f162795a = v670Var;
        this.f162796b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8f)) {
            return false;
        }
        o8f o8fVar = (o8f) obj;
        return wj50.m88271j(this.f162795a, o8fVar.f162795a) && wj50.m88271j(this.f162796b, o8fVar.f162796b);
    }

    public final int hashCode() {
        v670 v670Var = this.f162795a;
        return this.f162796b.hashCode() + ((v670Var == null ? 0 : v670Var.hashCode()) * 31);
    }
}
