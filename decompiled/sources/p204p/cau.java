package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class cau implements s6m0 {

    /* JADX INFO: renamed from: a */
    public static final cau f35930a = new cau();
    public static final Parcelable.Creator<cau> CREATOR = new qct(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
