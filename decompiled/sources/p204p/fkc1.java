package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class fkc1 extends AbstractC2202o5 {
    public static final Parcelable.Creator<fkc1> CREATOR = new fb31(19);

    /* JADX INFO: renamed from: c */
    public int f70525c;

    /* JADX INFO: renamed from: d */
    public final Parcelable f70526d;

    public fkc1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? fkc1.class.getClassLoader() : classLoader;
        this.f70525c = parcel.readInt();
        this.f70526d = parcel.readParcelable(classLoader);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return klh.m56832d(this.f70525c, "}", sb);
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f70525c);
        parcel.writeParcelable(this.f70526d, i);
    }
}
