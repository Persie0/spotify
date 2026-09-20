package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class cn30 implements Parcelable {
    public static final Parcelable.Creator<cn30> CREATOR = new mz20(12);

    /* JADX INFO: renamed from: a */
    public final int f39877a;

    public cn30(int i) {
        this.f39877a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f39877a);
    }

    public cn30(Parcel parcel) {
        this.f39877a = parcel.readInt();
    }
}
