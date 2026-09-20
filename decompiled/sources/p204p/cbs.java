package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class cbs implements fbs {

    /* JADX INFO: renamed from: a */
    public final ArrayList f36195a;

    public cbs(ArrayList arrayList) {
        this.f36195a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cbs) && this.f36195a.equals(((cbs) obj).f36195a);
    }

    public final int hashCode() {
        return this.f36195a.hashCode();
    }
}
