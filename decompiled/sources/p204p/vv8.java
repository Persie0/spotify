package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class vv8 extends zv8 {

    /* JADX INFO: renamed from: a */
    public static final vv8 f245169a = new vv8();
    public static final Parcelable.Creator<vv8> CREATOR = new yi8(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
