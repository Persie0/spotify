package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class el4 implements Parcelable {
    public static final Parcelable.Creator<el4> CREATOR = new bc3(18);

    /* JADX INFO: renamed from: a */
    public final String[] f60580a;

    /* JADX INFO: renamed from: b */
    public final int[] f60581b;

    public el4(String[] strArr, int[] iArr) {
        this.f60580a = strArr;
        this.f60581b = iArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(this.f60580a);
        parcel.writeIntArray(this.f60581b);
    }
}
