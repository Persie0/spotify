package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class bnc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final bnc1 f28807a = new bnc1();
    public static final Parcelable.Creator<bnc1> CREATOR = new vmc1(3);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
