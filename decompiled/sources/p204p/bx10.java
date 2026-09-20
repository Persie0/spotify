package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class bx10 implements Parcelable {
    public static final Parcelable.Creator<bx10> CREATOR = new km10(24);

    /* JADX INFO: renamed from: a */
    public final String f31765a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f31766b;

    public bx10(Parcelable parcelable) {
        this.f31765a = "image/png";
        this.f31766b = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31765a);
        parcel.writeParcelable(this.f31766b, i);
    }

    public bx10(Parcel parcel) {
        this.f31765a = parcel.readString();
        this.f31766b = parcel.readParcelable(p8y.m69343a().getClassLoader());
    }
}
