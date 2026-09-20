package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class nw20 extends qw20 {
    public static final Parcelable.Creator<nw20> CREATOR = new t320(21);

    /* JADX INFO: renamed from: a */
    public final String f159007a;

    public nw20(String str) {
        this.f159007a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nw20) && wj50.m88271j(this.f159007a, ((nw20) obj).f159007a);
    }

    public final int hashCode() {
        return this.f159007a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f159007a);
    }
}
