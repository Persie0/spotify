package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class ziy0 implements ajy0 {
    public static final Parcelable.Creator<ziy0> CREATOR = new csx0(28);

    /* JADX INFO: renamed from: a */
    public final String f283301a;

    public ziy0(String str) {
        this.f283301a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ziy0) && wj50.m88271j(this.f283301a, ((ziy0) obj).f283301a);
    }

    public final int hashCode() {
        return this.f283301a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283301a);
    }
}
