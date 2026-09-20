package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r9q0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f197103a;

    public r9q0(ArrayList arrayList) {
        this.f197103a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9q0) && this.f197103a.equals(((r9q0) obj).f197103a);
    }

    public final int hashCode() {
        return this.f197103a.hashCode();
    }
}
