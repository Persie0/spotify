package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class b6x0 extends c7x0 {

    /* JADX INFO: renamed from: a */
    public static final b6x0 f24069a = new b6x0();
    public static final Parcelable.Creator<b6x0> CREATOR = new xxw0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
