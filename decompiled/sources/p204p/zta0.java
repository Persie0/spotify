package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zta0 implements cua0 {

    /* JADX INFO: renamed from: a */
    public static final zta0 f286120a = new zta0();
    public static final Parcelable.Creator<zta0> CREATOR = new ama0(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
