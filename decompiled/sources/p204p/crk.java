package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class crk implements Parcelable {
    public static final Parcelable.Creator<crk> CREATOR = new kck(18);

    /* JADX INFO: renamed from: a */
    public final b370 f41305a;

    /* JADX INFO: renamed from: b */
    public final boolean f41306b;

    /* JADX INFO: renamed from: c */
    public final voc1 f41307c;

    /* JADX INFO: renamed from: d */
    public final hrk f41308d;

    public crk(b370 b370Var, boolean z, voc1 voc1Var, hrk hrkVar) {
        this.f41305a = b370Var;
        this.f41306b = z;
        this.f41307c = voc1Var;
        this.f41308d = hrkVar;
    }

    /* JADX INFO: renamed from: c */
    public static crk m33742c(crk crkVar, hrk hrkVar, int i) {
        b370 b370Var = crkVar.f41305a;
        boolean z = (i & 2) != 0 ? crkVar.f41306b : true;
        voc1 voc1Var = crkVar.f41307c;
        if ((i & 8) != 0) {
            hrkVar = crkVar.f41308d;
        }
        crkVar.getClass();
        return new crk(b370Var, z, voc1Var, hrkVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crk)) {
            return false;
        }
        crk crkVar = (crk) obj;
        return wj50.m88271j(this.f41305a, crkVar.f41305a) && this.f41306b == crkVar.f41306b && wj50.m88271j(this.f41307c, crkVar.f41307c) && wj50.m88271j(this.f41308d, crkVar.f41308d);
    }

    public final int hashCode() {
        return this.f41308d.hashCode() + s571.m77243b(s571.m77245d(this.f41305a.hashCode() * 31, 31, this.f41306b), 31, this.f41307c.f243453a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f41305a, i);
        parcel.writeInt(this.f41306b ? 1 : 0);
        parcel.writeParcelable(this.f41307c, i);
        parcel.writeParcelable(this.f41308d, i);
    }
}
