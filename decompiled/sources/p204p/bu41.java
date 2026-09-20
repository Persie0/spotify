package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bu41 extends yu41 {
    public static final Parcelable.Creator<bu41> CREATOR = new tj41(24);

    /* JADX INFO: renamed from: a */
    public final int f31016a;

    public bu41(int i) {
        this.f31016a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu41) && this.f31016a == ((bu41) obj).f31016a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f31016a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31016a);
    }
}
