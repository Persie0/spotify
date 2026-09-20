package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pol {

    /* JADX INFO: renamed from: a */
    public final ArrayList f179729a;

    /* JADX INFO: renamed from: b */
    public final String f179730b;

    public pol(ArrayList arrayList, String str) {
        this.f179729a = arrayList;
        this.f179730b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pol)) {
            return false;
        }
        pol polVar = (pol) obj;
        return this.f179729a.equals(polVar.f179729a) && wj50.m88271j(this.f179730b, polVar.f179730b);
    }

    public final int hashCode() {
        int iHashCode = this.f179729a.hashCode() * 31;
        String str = this.f179730b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
