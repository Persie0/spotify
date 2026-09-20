package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class e2d implements Parcelable {
    public static final Parcelable.Creator<e2d> CREATOR = new qvc(12);

    /* JADX INFO: renamed from: a */
    public final String f55428a;

    public e2d(String str) {
        this.f55428a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2d) && wj50.m88271j(this.f55428a, ((e2d) obj).f55428a);
    }

    public final int hashCode() {
        return this.f55428a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55428a);
    }
}
