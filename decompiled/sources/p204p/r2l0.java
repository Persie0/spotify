package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class r2l0 extends z2l0 {

    /* JADX INFO: renamed from: a */
    public static final r2l0 f195167a = new r2l0();
    public static final Parcelable.Creator<r2l0> CREATOR = new oxk0(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
