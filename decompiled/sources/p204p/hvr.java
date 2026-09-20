package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class hvr {

    /* JADX INFO: renamed from: a */
    public final String f95773a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f95774b;

    public hvr(String str, ArrayList arrayList) {
        this.f95773a = str;
        this.f95774b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvr)) {
            return false;
        }
        hvr hvrVar = (hvr) obj;
        return wj50.m88271j(this.f95773a, hvrVar.f95773a) && this.f95774b.equals(hvrVar.f95774b);
    }

    public final int hashCode() {
        return this.f95774b.hashCode() + (this.f95773a.hashCode() * 31);
    }
}
