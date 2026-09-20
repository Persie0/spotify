package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class chr0 extends dhr0 {

    /* JADX INFO: renamed from: a */
    public static final chr0 f38071a = new chr0();
    public static final Parcelable.Creator<chr0> CREATOR = new vzq0(28);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
