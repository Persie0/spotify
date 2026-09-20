package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class xy8 extends AbstractC2202o5 {
    public static final Parcelable.ClassLoaderCreator<xy8> CREATOR = new fb31(1);

    /* JADX INFO: renamed from: c */
    public boolean f267255c;

    public xy8(Parcelable parcelable) {
        super(parcelable);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m92417g() {
        return this.f267255c;
    }

    /* JADX INFO: renamed from: h */
    public final void m92418h(boolean z) {
        this.f267255c = z;
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f161807a, i);
        parcel.writeInt(this.f267255c ? 1 : 0);
    }

    public xy8(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f267255c = parcel.readInt() == 1;
    }
}
