package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class b5j0 implements f5j0 {

    /* JADX INFO: renamed from: a */
    public static final b5j0 f23599a = new b5j0();
    public static final Parcelable.Creator<b5j0> CREATOR = new rri0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
