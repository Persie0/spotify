package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class n051 implements x051 {

    /* JADX INFO: renamed from: a */
    public static final n051 f148895a = new n051();
    public static final Parcelable.Creator<n051> CREATOR = new tj41(27);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
