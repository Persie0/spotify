package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ni30 implements Parcelable {
    public static final Parcelable.Creator<ni30> CREATOR = new mz20(11);

    /* JADX INFO: renamed from: a */
    public final Parcelable f154168a;

    /* JADX INFO: renamed from: b */
    public final Parcelable f154169b;

    public ni30(Bundle bundle, fl80 fl80Var) {
        this.f154168a = bundle;
        this.f154169b = fl80Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f154168a, i);
        parcel.writeParcelable(this.f154169b, i);
    }

    public ni30(Parcel parcel) {
        this.f154168a = parcel.readParcelable(ti30.class.getClassLoader());
        this.f154169b = parcel.readParcelable(li30.class.getClassLoader());
    }
}
