package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class k9e implements l9e {

    /* JADX INFO: renamed from: a */
    public static final k9e f120573a = new k9e();
    public static final Parcelable.Creator<k9e> CREATOR = new n6e(7);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
