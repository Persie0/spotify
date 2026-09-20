package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class anc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final anc1 f17366a = new anc1();
    public static final Parcelable.Creator<anc1> CREATOR = new vmc1(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
