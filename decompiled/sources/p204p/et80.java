package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class et80 implements nt80 {

    /* JADX INFO: renamed from: a */
    public static final et80 f62664a = new et80();
    public static final Parcelable.Creator<et80> CREATOR = new ct80(1);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
