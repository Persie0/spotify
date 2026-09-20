package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ns30 extends jt30 {
    public static final Parcelable.Creator<ns30> CREATOR = new mz20(23);

    /* JADX INFO: renamed from: c */
    public final Parcelable f157655c;

    /* JADX INFO: renamed from: d */
    public final boolean f157656d;

    public ns30(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.f157655c = parcelable3;
        this.f157656d = z;
    }

    @Override // p204p.jt30, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f157655c, i);
        parcel.writeInt(this.f157656d ? 1 : 0);
    }
}
