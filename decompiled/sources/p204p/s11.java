package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class s11 implements u11 {
    public static final Parcelable.Creator<s11> CREATOR = new g11(9);

    /* JADX INFO: renamed from: a */
    public final String f204572a;

    public s11(String str) {
        this.f204572a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s11) && wj50.m88271j(this.f204572a, ((s11) obj).f204572a);
    }

    public final int hashCode() {
        String str = this.f204572a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f204572a);
    }
}
