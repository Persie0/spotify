package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v4c extends AbstractC2206o9 {
    public static final Parcelable.Creator<v4c> CREATOR = new jja(25);

    /* JADX INFO: renamed from: a */
    public final String f237113a;

    public v4c(String str) {
        this.f237113a = str;
    }

    @Override // p204p.AbstractC2206o9, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4c) && wj50.m88271j(this.f237113a, ((v4c) obj).f237113a);
    }

    public final int hashCode() {
        return this.f237113a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f237113a);
    }
}
