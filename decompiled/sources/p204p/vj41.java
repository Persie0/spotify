package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class vj41 implements wj41 {
    public static final Parcelable.Creator<vj41> CREATOR = new tj41(2);

    /* JADX INFO: renamed from: a */
    public final String f241871a;

    public vj41(String str) {
        this.f241871a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj41) && wj50.m88271j(this.f241871a, ((vj41) obj).f241871a);
    }

    public final int hashCode() {
        return this.f241871a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f241871a);
    }
}
