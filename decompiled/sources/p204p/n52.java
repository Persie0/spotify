package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class n52 implements o52 {
    public static final Parcelable.Creator<n52> CREATOR = new zt1(15);

    /* JADX INFO: renamed from: a */
    public final int f150452a;

    public n52(int i) {
        this.f150452a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n52) && this.f150452a == ((n52) obj).f150452a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150452a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f150452a);
    }
}
