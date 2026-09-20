package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class l1d1 implements Parcelable {
    public static final Parcelable.Creator<l1d1> CREATOR = new vmc1(20);

    /* JADX INFO: renamed from: a */
    public final String f128706a;

    public l1d1(String str) {
        this.f128706a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1d1) && wj50.m88271j(this.f128706a, ((l1d1) obj).f128706a);
    }

    public final String getUri() {
        return this.f128706a;
    }

    public final int hashCode() {
        return this.f128706a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f128706a);
    }
}
