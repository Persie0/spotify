package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class c5j0 implements f5j0 {

    /* JADX INFO: renamed from: a */
    public static final c5j0 f34195a = new c5j0();
    public static final Parcelable.Creator<c5j0> CREATOR = new rri0(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
