package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class lt20 {

    /* JADX INFO: renamed from: a */
    public final ot20 f136679a;

    /* JADX INFO: renamed from: b */
    public final String f136680b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f136681c;

    public lt20(ot20 ot20Var, String str, ArrayList arrayList) {
        this.f136679a = ot20Var;
        this.f136680b = str;
        this.f136681c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt20)) {
            return false;
        }
        lt20 lt20Var = (lt20) obj;
        return wj50.m88271j(this.f136679a, lt20Var.f136679a) && this.f136680b.equals(lt20Var.f136680b) && this.f136681c.equals(lt20Var.f136681c);
    }

    public final int hashCode() {
        ot20 ot20Var = this.f136679a;
        return this.f136681c.hashCode() + s571.m77243b((ot20Var == null ? 0 : ot20Var.hashCode()) * 31, 31, this.f136680b);
    }
}
