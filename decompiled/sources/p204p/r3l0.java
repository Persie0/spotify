package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class r3l0 implements Parcelable {
    public static final Parcelable.Creator<r3l0> CREATOR = new oxk0(25);

    /* JADX INFO: renamed from: a */
    public final String f195519a;

    public r3l0(String str) {
        this.f195519a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3l0) && wj50.m88271j(this.f195519a, ((r3l0) obj).f195519a);
    }

    public final int hashCode() {
        return this.f195519a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f195519a);
    }
}
