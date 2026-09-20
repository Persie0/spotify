package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ng51 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final ng51 f153562a = new ng51();
    public static final Parcelable.Creator<ng51> CREATOR = new nc51(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
