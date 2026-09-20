package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qc51 extends rc51 {

    /* JADX INFO: renamed from: a */
    public static final qc51 f187256a = new qc51();
    public static final Parcelable.Creator<qc51> CREATOR = new nc51(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
