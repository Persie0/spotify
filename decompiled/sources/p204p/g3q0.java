package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g3q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final List f76267a;

    public g3q0(ae50 ae50Var) {
        this.f76267a = ae50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3q0) && wj50.m88271j(this.f76267a, ((g3q0) obj).f76267a);
    }

    public final int hashCode() {
        return this.f76267a.hashCode();
    }
}
