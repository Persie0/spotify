package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class x2d0 extends AbstractC2202o5 {
    public static final Parcelable.Creator<x2d0> CREATOR = new fb31(12);

    /* JADX INFO: renamed from: c */
    public boolean f257420c;

    public x2d0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f257420c ? 1 : 0);
    }

    public x2d0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            x2d0.class.getClassLoader();
        }
        this.f257420c = parcel.readInt() == 1;
    }
}
