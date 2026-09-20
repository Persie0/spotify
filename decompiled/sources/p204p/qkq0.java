package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qkq0 implements rkq0 {

    /* JADX INFO: renamed from: a */
    public static final qkq0 f189634a = new qkq0();
    public static final Parcelable.Creator<qkq0> CREATOR = new vnp0(22);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
