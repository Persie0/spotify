package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class a110 implements Parcelable {

    /* JADX INFO: renamed from: a */
    public static final a110 f11231a = new a110();
    public static final Parcelable.Creator<a110> CREATOR = new qz00(5);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a110);
    }

    public final int hashCode() {
        return 607048060;
    }

    public final String toString() {
        return "GenerateWithoutAnalysisResult";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
