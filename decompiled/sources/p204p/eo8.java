package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class eo8 extends go8 {

    /* JADX INFO: renamed from: a */
    public static final eo8 f61340a = new eo8();
    public static final Parcelable.Creator<eo8> CREATOR = new yi8(12);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
