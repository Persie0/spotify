package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class kyn0 extends myn0 {
    public static final Parcelable.Creator<kyn0> CREATOR = new ejn0(18);

    /* JADX INFO: renamed from: a */
    public final String f127893a;

    public kyn0(String str) {
        this.f127893a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kyn0) && wj50.m88271j(this.f127893a, ((kyn0) obj).f127893a);
    }

    public final int hashCode() {
        return this.f127893a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f127893a);
    }
}
