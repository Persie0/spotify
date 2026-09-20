package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class bua0 implements cua0 {

    /* JADX INFO: renamed from: a */
    public static final bua0 f31071a = new bua0();
    public static final Parcelable.Creator<bua0> CREATOR = new ama0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
