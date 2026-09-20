package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class syp0 extends vyp0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f215308a;

    /* JADX INFO: renamed from: b */
    public final List f215309b;

    public syp0(ArrayList arrayList, List list) {
        this.f215308a = arrayList;
        this.f215309b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syp0)) {
            return false;
        }
        syp0 syp0Var = (syp0) obj;
        return this.f215308a.equals(syp0Var.f215308a) && wj50.m88271j(this.f215309b, syp0Var.f215309b);
    }

    public final int hashCode() {
        return this.f215309b.hashCode() + (this.f215308a.hashCode() * 31);
    }
}
