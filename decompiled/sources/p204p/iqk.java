package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class iqk extends AbstractC2202o5 {
    public static final Parcelable.Creator<iqk> CREATOR = new fb31(4);

    /* JADX INFO: renamed from: c */
    public SparseArray f104798c;

    public iqk(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f104798c = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f104798c.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p204p.AbstractC2202o5, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f104798c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f104798c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f104798c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public iqk(Parcelable parcelable) {
        super(parcelable);
    }
}
