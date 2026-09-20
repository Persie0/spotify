package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ljv {

    /* JADX INFO: renamed from: a */
    public final ArrayList f134153a;

    /* JADX INFO: renamed from: b */
    public final niv f134154b;

    /* JADX INFO: renamed from: c */
    public final boolean f134155c;

    public ljv(ArrayList arrayList, niv nivVar, boolean z) {
        this.f134153a = arrayList;
        this.f134154b = nivVar;
        this.f134155c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljv)) {
            return false;
        }
        ljv ljvVar = (ljv) obj;
        return this.f134153a.equals(ljvVar.f134153a) && wj50.m88271j(this.f134154b, ljvVar.f134154b) && this.f134155c == ljvVar.f134155c;
    }

    public final int hashCode() {
        int iHashCode = this.f134153a.hashCode() * 31;
        niv nivVar = this.f134154b;
        return Boolean.hashCode(this.f134155c) + ((iHashCode + (nivVar == null ? 0 : nivVar.hashCode())) * 31);
    }
}
