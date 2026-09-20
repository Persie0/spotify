package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class jae implements Parcelable {
    public static final Parcelable.Creator<jae> CREATOR = new n6e(23);

    /* JADX INFO: renamed from: a */
    public final String f110447a;

    /* JADX INFO: renamed from: b */
    public final String f110448b;

    public jae(String str, String str2) {
        this.f110447a = str;
        this.f110448b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jae)) {
            return false;
        }
        jae jaeVar = (jae) obj;
        return wj50.m88271j(this.f110447a, jaeVar.f110447a) && wj50.m88271j(this.f110448b, jaeVar.f110448b);
    }

    public final int hashCode() {
        return this.f110448b.hashCode() + (this.f110447a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f110447a);
        parcel.writeString(this.f110448b);
    }
}
