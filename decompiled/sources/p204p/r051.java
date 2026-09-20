package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class r051 implements x051 {

    /* JADX INFO: renamed from: a */
    public static final r051 f194390a = new r051();
    public static final Parcelable.Creator<r051> CREATOR = new q051(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
