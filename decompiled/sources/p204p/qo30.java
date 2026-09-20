package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class qo30 extends jt30 {
    public static final Parcelable.Creator<qo30> CREATOR = new mz20(13);

    /* JADX INFO: renamed from: c */
    public final Parcelable f190772c;

    /* JADX INFO: renamed from: d */
    public final boolean f190773d;

    public qo30(Parcelable parcelable, Parcelable parcelable2, Parcelable parcelable3, boolean z) {
        super(parcelable, parcelable2);
        this.f190772c = parcelable3;
        this.f190773d = z;
    }

    @Override // p204p.jt30, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f190772c, i);
        parcel.writeInt(this.f190773d ? 1 : 0);
    }
}
