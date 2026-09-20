package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class fbz0 extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<fbz0> CREATOR = new fb31(15);

    /* JADX INFO: renamed from: c */
    public cbz0 f67960c;

    public fbz0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f67960c = (cbz0) bk5.m29587J0(parcel.readInt(), cbz0.values());
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        cbz0 cbz0Var = this.f67960c;
        if (cbz0Var != null) {
            parcel.writeInt(cbz0Var.ordinal());
        }
    }
}
