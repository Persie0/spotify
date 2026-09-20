package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class o5n0 extends p5n0 {

    /* JADX INFO: renamed from: a */
    public static final o5n0 f162040a = new o5n0();
    public static final Parcelable.Creator<o5n0> CREATOR = new pum0(24);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
