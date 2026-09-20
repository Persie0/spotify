package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class a6t implements Parcelable {
    public static final Parcelable.Creator<a6t> CREATOR = new f9s(24);

    /* JADX INFO: renamed from: a */
    public final String f12867a;

    public a6t(String str) {
        this.f12867a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a6t) && wj50.m88271j(this.f12867a, ((a6t) obj).f12867a);
    }

    public final String getUsername() {
        return this.f12867a;
    }

    public final int hashCode() {
        return this.f12867a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12867a);
    }
}
