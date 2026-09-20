package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pcv {

    /* JADX INFO: renamed from: a */
    public final ArrayList f176235a;

    /* JADX INFO: renamed from: b */
    public final ncv f176236b;

    /* JADX INFO: renamed from: c */
    public final boolean f176237c;

    /* JADX INFO: renamed from: d */
    public final wg61 f176238d;

    /* JADX INFO: renamed from: e */
    public final wg61 f176239e;

    /* JADX INFO: renamed from: f */
    public final wg61 f176240f;

    /* JADX INFO: renamed from: g */
    public final wg61 f176241g;

    public pcv(ArrayList arrayList, ncv ncvVar, boolean z) {
        this.f176235a = arrayList;
        this.f176236b = ncvVar;
        this.f176237c = z;
        if (arrayList.size() > 4) {
            na6.m63957e("Max 4 actions allowed");
        }
        this.f176238d = new wg61(new ocv(this, 0));
        this.f176239e = new wg61(new ocv(this, 2));
        this.f176240f = new wg61(new ocv(this, 3));
        this.f176241g = new wg61(new ocv(this, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcv)) {
            return false;
        }
        pcv pcvVar = (pcv) obj;
        return this.f176235a.equals(pcvVar.f176235a) && wj50.m88271j(this.f176236b, pcvVar.f176236b) && this.f176237c == pcvVar.f176237c;
    }

    public final int hashCode() {
        int iHashCode = this.f176235a.hashCode() * 31;
        ncv ncvVar = this.f176236b;
        return Boolean.hashCode(this.f176237c) + ((iHashCode + (ncvVar == null ? 0 : ncvVar.hashCode())) * 31);
    }
}
