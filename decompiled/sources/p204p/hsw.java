package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hsw extends g3x {
    public static final Parcelable.Creator<hsw> CREATOR = new wfw(4);

    /* JADX INFO: renamed from: a */
    public final String f94811a;

    public hsw(String str) {
        this.f94811a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hsw) && wj50.m88271j(this.f94811a, ((hsw) obj).f94811a);
    }

    public final String getId() {
        return this.f94811a;
    }

    public final int hashCode() {
        return this.f94811a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f94811a);
    }
}
