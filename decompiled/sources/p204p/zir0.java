package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zir0 implements bjr0 {

    /* JADX INFO: renamed from: a */
    public static final zir0 f283233a = new zir0();
    public static final Parcelable.Creator<zir0> CREATOR = new uir0(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
