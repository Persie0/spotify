package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class dnc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final dnc1 f50755a = new dnc1();
    public static final Parcelable.Creator<dnc1> CREATOR = new vmc1(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
