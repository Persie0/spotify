package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dks0 implements iks0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f50021a;

    public dks0(ArrayList arrayList) {
        this.f50021a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dks0) && this.f50021a.equals(((dks0) obj).f50021a);
    }

    public final int hashCode() {
        return this.f50021a.hashCode();
    }
}
