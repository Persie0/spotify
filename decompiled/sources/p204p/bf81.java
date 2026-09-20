package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class bf81 implements ktx {

    /* JADX INFO: renamed from: a */
    public final ArrayList f26639a;

    public bf81(ArrayList arrayList) {
        this.f26639a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bf81) && this.f26639a.equals(((bf81) obj).f26639a);
    }

    public final int hashCode() {
        return this.f26639a.hashCode();
    }
}
