package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class rlc1 implements jnc1 {

    /* JADX INFO: renamed from: a */
    public static final rlc1 f200279a = new rlc1();
    public static final Parcelable.Creator<rlc1> CREATOR = new nlc1(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
