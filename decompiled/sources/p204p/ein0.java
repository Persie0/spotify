package p204p;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ein0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f59986a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f59987b;

    public ein0(AtomicBoolean atomicBoolean) {
        ArrayList arrayList = new ArrayList();
        this.f59986a = atomicBoolean;
        this.f59987b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ein0)) {
            return false;
        }
        ein0 ein0Var = (ein0) obj;
        return wj50.m88271j(this.f59986a, ein0Var.f59986a) && wj50.m88271j(this.f59987b, ein0Var.f59987b);
    }

    public final int hashCode() {
        return this.f59987b.hashCode() + (this.f59986a.hashCode() * 31);
    }
}
