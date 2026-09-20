package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class gq21 implements Parcelable {
    public static final Parcelable.Creator<gq21> CREATOR = new q321(23);

    /* JADX INFO: renamed from: a */
    public final String f83330a;

    public gq21(String str) {
        this.f83330a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gq21) && wj50.m88271j(this.f83330a, ((gq21) obj).f83330a);
    }

    public final int hashCode() {
        String str = this.f83330a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f83330a);
    }
}
