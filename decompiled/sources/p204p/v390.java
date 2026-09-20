package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class v390 extends i490 {

    /* JADX INFO: renamed from: a */
    public static final v390 f236813a = new v390();
    public static final Parcelable.Creator<v390> CREATOR = new ct80(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
