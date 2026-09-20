package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class f6z extends g6z {

    /* JADX INFO: renamed from: a */
    public static final f6z f66516a = new f6z();
    public static final Parcelable.Creator<f6z> CREATOR = new c2z(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
