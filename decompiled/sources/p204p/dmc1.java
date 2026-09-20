package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class dmc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final dmc1 f50488a = new dmc1();
    public static final Parcelable.Creator<dmc1> CREATOR = new nlc1(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
