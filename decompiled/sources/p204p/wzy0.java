package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class wzy0 extends yzy0 {

    /* JADX INFO: renamed from: a */
    public static final wzy0 f256710a = new wzy0();
    public static final Parcelable.Creator<wzy0> CREATOR = new lpy0(10);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
