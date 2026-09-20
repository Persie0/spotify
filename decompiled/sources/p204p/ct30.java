package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ct30 implements Parcelable {
    public static final Parcelable.Creator<ct30> CREATOR = new mz20(24);

    /* JADX INFO: renamed from: a */
    public final Parcelable f41759a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f41760b;

    /* JADX INFO: renamed from: c */
    public final Parcelable f41761c;

    /* JADX INFO: renamed from: d */
    public final Parcelable f41762d;

    public ct30(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, Parcelable parcelable4) {
        this.f41759a = parcelable;
        this.f41760b = parcelable2;
        this.f41761c = parcelable3;
        this.f41762d = parcelable4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f41759a, i);
        parcel.writeParcelable(this.f41760b, i);
        parcel.writeParcelable(this.f41761c, i);
        parcel.writeParcelable(this.f41762d, i);
    }
}
