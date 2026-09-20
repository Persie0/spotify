package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class zhl implements eil {
    public static final Parcelable.Creator<zhl> CREATOR = new z4l(19);

    /* JADX INFO: renamed from: a */
    public final String f282957a;

    public zhl(String str) {
        this.f282957a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zhl) && wj50.m88271j(this.f282957a, ((zhl) obj).f282957a);
    }

    public final int hashCode() {
        return this.f282957a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f282957a);
    }
}
