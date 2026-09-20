package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class q8z0 extends s8z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f186441a;

    public q8z0(ArrayList arrayList) {
        this.f186441a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q8z0) && this.f186441a.equals(((q8z0) obj).f186441a);
    }

    public final int hashCode() {
        return this.f186441a.hashCode() + (edb.m38547C(2) * 31);
    }
}
