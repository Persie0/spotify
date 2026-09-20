package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class t11 implements u11 {
    public static final Parcelable.Creator<t11> CREATOR = new g11(10);

    /* JADX INFO: renamed from: a */
    public final String f216048a;

    public t11(String str) {
        this.f216048a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t11) && wj50.m88271j(this.f216048a, ((t11) obj).f216048a);
    }

    public final int hashCode() {
        String str = this.f216048a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f216048a);
    }
}
