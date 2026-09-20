package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class buf extends duf {

    /* JADX INFO: renamed from: a */
    public static final buf f31129a = new buf();
    public static final Parcelable.Creator<buf> CREATOR = new rae(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
