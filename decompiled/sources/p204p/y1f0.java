package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class y1f0 implements go01 {

    /* JADX INFO: renamed from: a */
    public static final y1f0 f268259a = new y1f0();
    public static final Parcelable.Creator<y1f0> CREATOR = new ube0(26);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
