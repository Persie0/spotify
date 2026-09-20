package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class l7c1 implements Parcelable {
    public static final Parcelable.Creator<l7c1> CREATOR = new c8b1(18);

    /* JADX INFO: renamed from: a */
    public final String f130623a;

    public l7c1(String str) {
        this.f130623a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l7c1) && wj50.m88271j(this.f130623a, ((l7c1) obj).f130623a);
    }

    public final int hashCode() {
        return this.f130623a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130623a);
    }
}
