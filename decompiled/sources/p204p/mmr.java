package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class mmr implements Parcelable {
    public static final Parcelable.Creator<mmr> CREATOR = new o5r(12);

    /* JADX INFO: renamed from: a */
    public final String f145229a;

    public mmr(String str) {
        this.f145229a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmr) && wj50.m88271j(this.f145229a, ((mmr) obj).f145229a);
    }

    public final int hashCode() {
        return this.f145229a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f145229a);
    }
}
