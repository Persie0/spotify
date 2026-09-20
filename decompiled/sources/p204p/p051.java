package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class p051 implements a151 {

    /* JADX INFO: renamed from: a */
    public static final p051 f172498a = new p051();
    public static final Parcelable.Creator<p051> CREATOR = new tj41(29);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
