package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class i0b0 extends w0b0 {

    /* JADX INFO: renamed from: a */
    public static final i0b0 f97198a = new i0b0();
    public static final Parcelable.Creator<i0b0> CREATOR = new ama0(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
