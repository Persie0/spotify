package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dgv0 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f48902a;

    public dgv0(ArrayList arrayList) {
        this.f48902a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgv0) && this.f48902a.equals(((dgv0) obj).f48902a);
    }

    public final int hashCode() {
        return this.f48902a.hashCode();
    }
}
