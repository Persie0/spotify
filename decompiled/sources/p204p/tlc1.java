package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class tlc1 implements knc1 {

    /* JADX INFO: renamed from: a */
    public static final tlc1 f221448a = new tlc1();
    public static final Parcelable.Creator<tlc1> CREATOR = new nlc1(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
