package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mpb0 implements npb0 {

    /* JADX INFO: renamed from: a */
    public static final mpb0 f145955a = new mpb0();
    public static final Parcelable.Creator<mpb0> CREATOR = new apb0(8);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
