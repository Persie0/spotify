package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class lyn0 extends myn0 {

    /* JADX INFO: renamed from: a */
    public static final lyn0 f138078a = new lyn0();
    public static final Parcelable.Creator<lyn0> CREATOR = new ejn0(19);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
