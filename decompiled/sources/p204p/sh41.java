package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class sh41 implements Parcelable {
    public static final Parcelable.Creator<sh41> CREATOR = new ln31(27);

    /* JADX INFO: renamed from: a */
    public int f209092a;

    /* JADX INFO: renamed from: b */
    public int f209093b;

    /* JADX INFO: renamed from: c */
    public int[] f209094c;

    /* JADX INFO: renamed from: d */
    public boolean f209095d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f209092a + ", mGapDir=" + this.f209093b + ", mHasUnwantedGapAfter=" + this.f209095d + ", mGapPerSpan=" + Arrays.toString(this.f209094c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f209092a);
        parcel.writeInt(this.f209093b);
        parcel.writeInt(this.f209095d ? 1 : 0);
        int[] iArr = this.f209094c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f209094c);
        }
    }
}
