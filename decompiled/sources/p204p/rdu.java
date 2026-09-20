package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class rdu extends tdu {

    /* JADX INFO: renamed from: a */
    public static final rdu f198207a = new rdu();
    public static final Parcelable.Creator<rdu> CREATOR = new n6f1(15);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
