package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o051 implements x051 {

    /* JADX INFO: renamed from: a */
    public static final o051 f160238a = new o051();
    public static final Parcelable.Creator<o051> CREATOR = new tj41(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
