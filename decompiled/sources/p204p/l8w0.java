package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class l8w0 implements m8w0 {

    /* JADX INFO: renamed from: a */
    public static final l8w0 f130953a = new l8w0();
    public static final Parcelable.Creator<l8w0> CREATOR = new b8w0(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
