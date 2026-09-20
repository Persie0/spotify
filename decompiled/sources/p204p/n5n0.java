package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class n5n0 extends p5n0 {
    public static final Parcelable.Creator<n5n0> CREATOR = new pum0(23);

    /* JADX INFO: renamed from: a */
    public final String f150586a;

    public n5n0(String str) {
        this.f150586a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5n0) && wj50.m88271j(this.f150586a, ((n5n0) obj).f150586a);
    }

    public final int hashCode() {
        return this.f150586a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150586a);
    }
}
