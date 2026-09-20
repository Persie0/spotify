package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class oc51 extends rc51 {

    /* JADX INFO: renamed from: a */
    public static final oc51 f163816a = new oc51();
    public static final Parcelable.Creator<oc51> CREATOR = new nc51(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
