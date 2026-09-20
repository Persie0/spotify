package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class nkl implements rkl {

    /* JADX INFO: renamed from: a */
    public static final nkl f154894a = new nkl();
    public static final Parcelable.Creator<nkl> CREATOR = new z4l(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
