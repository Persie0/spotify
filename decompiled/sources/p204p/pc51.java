package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pc51 extends rc51 {

    /* JADX INFO: renamed from: a */
    public static final pc51 f175960a = new pc51();
    public static final Parcelable.Creator<pc51> CREATOR = new nc51(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
