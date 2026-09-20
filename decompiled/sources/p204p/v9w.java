package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class v9w implements Parcelable {
    public static final Parcelable.Creator<v9w> CREATOR = new bwv(13);

    /* JADX INFO: renamed from: a */
    public final yj11 f239048a;

    /* JADX INFO: renamed from: b */
    public final e0w f239049b;

    /* JADX INFO: renamed from: c */
    public final eoc f239050c;

    /* JADX INFO: renamed from: d */
    public final ume f239051d;

    /* JADX INFO: renamed from: e */
    public final gcr0 f239052e;

    /* JADX INFO: renamed from: f */
    public final t611 f239053f;

    /* JADX INFO: renamed from: g */
    public final String f239054g;

    public v9w(yj11 yj11Var, e0w e0wVar, eoc eocVar, ume umeVar, gcr0 gcr0Var, t611 t611Var, String str) {
        this.f239048a = yj11Var;
        this.f239049b = e0wVar;
        this.f239050c = eocVar;
        this.f239051d = umeVar;
        this.f239052e = gcr0Var;
        this.f239053f = t611Var;
        this.f239054g = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9w)) {
            return false;
        }
        v9w v9wVar = (v9w) obj;
        return wj50.m88271j(this.f239048a, v9wVar.f239048a) && wj50.m88271j(this.f239049b, v9wVar.f239049b) && wj50.m88271j(this.f239050c, v9wVar.f239050c) && wj50.m88271j(this.f239051d, v9wVar.f239051d) && wj50.m88271j(this.f239052e, v9wVar.f239052e) && wj50.m88271j(this.f239053f, v9wVar.f239053f) && wj50.m88271j(this.f239054g, v9wVar.f239054g);
    }

    public final int hashCode() {
        yj11 yj11Var = this.f239048a;
        int iHashCode = (this.f239049b.hashCode() + ((yj11Var == null ? 0 : yj11Var.hashCode()) * 31)) * 31;
        eoc eocVar = this.f239050c;
        int iHashCode2 = (iHashCode + (eocVar == null ? 0 : eocVar.hashCode())) * 31;
        ume umeVar = this.f239051d;
        int iHashCode3 = (iHashCode2 + (umeVar == null ? 0 : umeVar.hashCode())) * 31;
        gcr0 gcr0Var = this.f239052e;
        int iHashCode4 = (this.f239053f.hashCode() + ((iHashCode3 + (gcr0Var == null ? 0 : gcr0Var.hashCode())) * 31)) * 31;
        String str = this.f239054g;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yj11 yj11Var = this.f239048a;
        if (yj11Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            yj11Var.writeToParcel(parcel, i);
        }
        this.f239049b.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f239050c, i);
        parcel.writeParcelable(this.f239051d, i);
        parcel.writeParcelable(this.f239052e, i);
        this.f239053f.writeToParcel(parcel, i);
        parcel.writeString(this.f239054g);
    }
}
