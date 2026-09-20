package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class ezu extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<ezu> CREATOR = new fb31(10);

    /* JADX INFO: renamed from: c */
    public boolean f64470c;

    public ezu(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f64470c = parcel.readInt() == 1;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        parcel.writeInt(this.f64470c ? 1 : 0);
    }
}
