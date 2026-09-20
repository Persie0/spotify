package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class fo90 extends ko90 {

    /* JADX INFO: renamed from: a */
    public static final fo90 f71476a = new fo90();
    public static final Parcelable.Creator<fo90> CREATOR = new ra90(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
