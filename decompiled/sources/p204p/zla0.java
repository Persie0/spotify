package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class zla0 implements d251 {
    public static final Parcelable.Creator<zla0> CREATOR = new z8a0(29);

    /* JADX INFO: renamed from: a */
    public final String f283965a;

    public zla0(String str) {
        this.f283965a = str;
    }

    @Override // p204p.d251
    /* JADX INFO: renamed from: c1 */
    public final boolean mo34688c1(f251 f251Var) {
        return f251Var instanceof bma0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zla0) && wj50.m88271j(this.f283965a, ((zla0) obj).f283965a);
    }

    public final int hashCode() {
        String str = this.f283965a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283965a);
    }
}
