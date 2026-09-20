package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hy5 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f96463a;

    public hy5(ArrayList arrayList) {
        this.f96463a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy5) && this.f96463a.equals(((hy5) obj).f96463a);
    }

    public final int hashCode() {
        return this.f96463a.hashCode();
    }
}
