package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class c4k0 extends e4k0 {

    /* JADX INFO: renamed from: a */
    public static final c4k0 f33969a = new c4k0();
    public static final Parcelable.Creator<c4k0> CREATOR = new fgj0(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
