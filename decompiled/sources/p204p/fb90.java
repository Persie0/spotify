package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class fb90 implements zz41 {

    /* JADX INFO: renamed from: a */
    public static final fb90 f67765a = new fb90();
    public static final Parcelable.Creator<fb90> CREATOR = new ra90(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p204p.zz41
    public final String getId() {
        return "ListeningActivityCarousel";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
