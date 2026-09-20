package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class fci implements jci {

    /* JADX INFO: renamed from: a */
    public final List f68127a;

    public fci(List list) {
        this.f68127a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fci) && wj50.m88271j(this.f68127a, ((fci) obj).f68127a);
    }

    public final int hashCode() {
        return this.f68127a.hashCode();
    }
}
