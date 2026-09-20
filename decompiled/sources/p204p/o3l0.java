package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class o3l0 implements Parcelable {
    public static final Parcelable.Creator<o3l0> CREATOR = new oxk0(22);

    /* JADX INFO: renamed from: a */
    public final String f161407a;

    /* JADX INFO: renamed from: b */
    public final String f161408b;

    public o3l0(String str, String str2) {
        this.f161407a = str;
        this.f161408b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3l0)) {
            return false;
        }
        o3l0 o3l0Var = (o3l0) obj;
        return wj50.m88271j(this.f161407a, o3l0Var.f161407a) && wj50.m88271j(this.f161408b, o3l0Var.f161408b);
    }

    public final int hashCode() {
        int iHashCode = this.f161407a.hashCode() * 31;
        String str = this.f161408b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161407a);
        parcel.writeString(this.f161408b);
    }
}
