package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class k7z implements Parcelable {
    public static final Parcelable.Creator<k7z> CREATOR = new c2z(16);

    /* JADX INFO: renamed from: a */
    public final String f120216a;

    public k7z(String str) {
        this.f120216a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k7z) && wj50.m88271j(this.f120216a, ((k7z) obj).f120216a);
    }

    public final int hashCode() {
        return this.f120216a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f120216a);
    }
}
