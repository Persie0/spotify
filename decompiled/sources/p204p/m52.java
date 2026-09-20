package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class m52 implements o52 {
    public static final Parcelable.Creator<m52> CREATOR = new zt1(14);

    /* JADX INFO: renamed from: a */
    public final int f140079a;

    public m52(int i) {
        this.f140079a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m52) && this.f140079a == ((m52) obj).f140079a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f140079a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f140079a);
    }
}
