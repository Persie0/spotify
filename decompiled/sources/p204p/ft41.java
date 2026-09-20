package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ft41 implements ou41 {
    public static final Parcelable.Creator<ft41> CREATOR = new tj41(17);

    /* JADX INFO: renamed from: a */
    public final String f73107a;

    /* JADX INFO: renamed from: b */
    public final gn50 f73108b;

    public ft41(String str, gn50 gn50Var) {
        this.f73107a = str;
        this.f73108b = gn50Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft41)) {
            return false;
        }
        ft41 ft41Var = (ft41) obj;
        return wj50.m88271j(this.f73107a, ft41Var.f73107a) && wj50.m88271j(this.f73108b, ft41Var.f73108b);
    }

    public final int hashCode() {
        return this.f73108b.hashCode() + (this.f73107a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73107a);
        parcel.writeParcelable(this.f73108b, i);
    }
}
