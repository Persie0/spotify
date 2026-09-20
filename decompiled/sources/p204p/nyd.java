package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class nyd extends AbstractC2202o5 {
    public static final Parcelable.Creator<nyd> CREATOR = new fb31(3);

    /* JADX INFO: renamed from: c */
    public boolean f159780c;

    public nyd(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f159780c = parcel.readInt() == 1;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f159780c ? 1 : 0);
    }
}
