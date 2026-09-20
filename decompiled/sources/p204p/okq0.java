package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class okq0 implements rkq0 {

    /* JADX INFO: renamed from: a */
    public static final okq0 f166655a = new okq0();
    public static final Parcelable.Creator<okq0> CREATOR = new vnp0(20);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
