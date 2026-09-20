package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class tlc implements Parcelable {
    public static final Parcelable.Creator<tlc> CREATOR = new a5c(19);

    /* JADX INFO: renamed from: a */
    public final String f221438a;

    public tlc(String str) {
        this.f221438a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m81043c() {
        return this.f221438a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlc) && wj50.m88271j(this.f221438a, ((tlc) obj).f221438a);
    }

    public final int hashCode() {
        return this.f221438a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f221438a);
    }
}
