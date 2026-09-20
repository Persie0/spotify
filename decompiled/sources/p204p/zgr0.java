package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zgr0 extends dhr0 {

    /* JADX INFO: renamed from: a */
    public static final zgr0 f282699a = new zgr0();
    public static final Parcelable.Creator<zgr0> CREATOR = new vzq0(25);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
