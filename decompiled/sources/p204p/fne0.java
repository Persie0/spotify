package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fne0 implements gne0 {

    /* JADX INFO: renamed from: a */
    public final List f71271a;

    public fne0(List list) {
        this.f71271a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fne0) && wj50.m88271j(this.f71271a, ((fne0) obj).f71271a);
    }

    public final int hashCode() {
        return this.f71271a.hashCode();
    }
}
