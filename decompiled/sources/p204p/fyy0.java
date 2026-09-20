package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class fyy0 extends gyy0 {

    /* JADX INFO: renamed from: a */
    public static final fyy0 f74870a = new fyy0();
    public static final Parcelable.Creator<fyy0> CREATOR = new lpy0(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
