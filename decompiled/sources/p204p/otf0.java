package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class otf0 implements ptf0 {
    public static final Parcelable.Creator<otf0> CREATOR = new r4f0(18);

    /* JADX INFO: renamed from: a */
    public final String f169052a;

    public otf0(String str) {
        this.f169052a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof otf0) && wj50.m88271j(this.f169052a, ((otf0) obj).f169052a);
    }

    public final int hashCode() {
        return this.f169052a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f169052a);
    }
}
