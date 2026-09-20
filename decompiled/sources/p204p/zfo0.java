package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zfo0 extends mgo0 {

    /* JADX INFO: renamed from: a */
    public static final zfo0 f282356a = new zfo0();
    public static final Parcelable.Creator<zfo0> CREATOR = new o2o0(21);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
