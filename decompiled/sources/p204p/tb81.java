package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tb81 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f218797a;

    public tb81(ArrayList arrayList) {
        this.f218797a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb81) && this.f218797a.equals(((tb81) obj).f218797a);
    }

    public final int hashCode() {
        return this.f218797a.hashCode();
    }
}
