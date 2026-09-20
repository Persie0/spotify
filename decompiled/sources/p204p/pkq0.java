package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class pkq0 implements rkq0 {

    /* JADX INFO: renamed from: a */
    public static final pkq0 f178512a = new pkq0();
    public static final Parcelable.Creator<pkq0> CREATOR = new vnp0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
