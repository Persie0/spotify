package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class eum0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final fum0 f63014a;

    public eum0(fum0 fum0Var) {
        this.f63014a = fum0Var;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return this.f63014a.createFromParcel(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return this.f63014a.newArray(i);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.f63014a.createFromParcel(parcel, classLoader);
    }
}
