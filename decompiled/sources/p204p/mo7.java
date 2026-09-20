package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class mo7 implements n4y {

    /* JADX INFO: renamed from: a */
    public static final mo7 f145603a = new mo7();
    public static final Parcelable.Creator<mo7> CREATOR = new na7(16);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof mo7);
    }

    public final int hashCode() {
        return -1401812709;
    }

    public final String toString() {
        return "AuthorExtraInfo";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
