package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class e20 implements Parcelable {
    public static final Parcelable.Creator<e20> CREATOR = new C2267ps(17);

    /* JADX INFO: renamed from: a */
    public final String f55288a;

    public e20(String str) {
        this.f55288a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e20) && wj50.m88271j(this.f55288a, ((e20) obj).f55288a);
    }

    public final int hashCode() {
        return this.f55288a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55288a);
    }
}
