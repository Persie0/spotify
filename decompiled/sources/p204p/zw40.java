package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class zw40 implements ax40 {
    public static final Parcelable.Creator<zw40> CREATOR = new y240(21);

    /* JADX INFO: renamed from: a */
    public final String f286916a;

    public zw40(String str) {
        this.f286916a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zw40) && wj50.m88271j(this.f286916a, ((zw40) obj).f286916a);
    }

    public final int hashCode() {
        return this.f286916a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f286916a);
    }
}
