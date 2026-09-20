package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class epr implements Parcelable {
    public static final Parcelable.Creator<epr> CREATOR = new o5r(16);

    /* JADX INFO: renamed from: a */
    public final int f61702a;

    /* JADX INFO: renamed from: b */
    public final f931 f61703b;

    public epr(int i, f931 f931Var) {
        this.f61702a = i;
        this.f61703b = f931Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epr)) {
            return false;
        }
        epr eprVar = (epr) obj;
        return this.f61702a == eprVar.f61702a && wj50.m88271j(this.f61703b, eprVar.f61703b);
    }

    public final int hashCode() {
        return this.f61703b.hashCode() + (Integer.hashCode(this.f61702a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f61702a);
        parcel.writeParcelable(this.f61703b, i);
    }
}
