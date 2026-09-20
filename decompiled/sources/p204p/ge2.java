package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class ge2 extends he2 {

    /* JADX INFO: renamed from: a */
    public static final ge2 f78993a = new ge2();
    public static final Parcelable.Creator<ge2> CREATOR = new lb2(9);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
