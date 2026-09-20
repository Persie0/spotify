package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class o6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f162441a;

    public o6z0(ArrayList arrayList) {
        this.f162441a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6z0) && this.f162441a.equals(((o6z0) obj).f162441a);
    }

    public final int hashCode() {
        return this.f162441a.hashCode();
    }
}
