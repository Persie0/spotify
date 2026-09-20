package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class jt30 implements Parcelable {
    public static final Parcelable.Creator<jt30> CREATOR = new mz20(25);

    /* JADX INFO: renamed from: a */
    public final Parcelable f115701a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f115702b;

    public jt30(Parcelable parcelable, Parcelable parcelable2) {
        this.f115701a = parcelable;
        this.f115702b = parcelable2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f115701a, i);
        parcel.writeParcelable(this.f115702b, i);
    }
}
