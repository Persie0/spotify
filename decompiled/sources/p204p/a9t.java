package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class a9t implements d9t {
    public static final Parcelable.Creator<a9t> CREATOR = new f9s(27);

    /* JADX INFO: renamed from: a */
    public final String f13638a;

    public a9t(String str) {
        this.f13638a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9t) && wj50.m88271j(this.f13638a, ((a9t) obj).f13638a);
    }

    public final int hashCode() {
        return this.f13638a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13638a);
    }
}
