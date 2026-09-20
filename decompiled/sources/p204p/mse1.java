package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class mse1 implements Parcelable {
    public static final Parcelable.Creator<mse1> CREATOR = new tne1(7);

    /* JADX INFO: renamed from: a */
    public final int f146760a;

    public mse1(int i) {
        this.f146760a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mse1) && this.f146760a == ((mse1) obj).f146760a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f146760a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f146760a);
    }
}
