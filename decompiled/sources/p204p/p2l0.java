package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class p2l0 extends z2l0 {

    /* JADX INFO: renamed from: a */
    public static final p2l0 f173367a = new p2l0();
    public static final Parcelable.Creator<p2l0> CREATOR = new oxk0(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
