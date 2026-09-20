package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ivy implements Parcelable {
    public static final Parcelable.Creator<ivy> CREATOR = new eqy(16);

    /* JADX INFO: renamed from: a */
    public final String f106299a;

    /* JADX INFO: renamed from: b */
    public final String f106300b;

    public ivy(String str, String str2) {
        this.f106299a = str;
        this.f106300b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivy)) {
            return false;
        }
        ivy ivyVar = (ivy) obj;
        return wj50.m88271j(this.f106299a, ivyVar.f106299a) && wj50.m88271j(this.f106300b, ivyVar.f106300b);
    }

    public final int hashCode() {
        return this.f106300b.hashCode() + (this.f106299a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106299a);
        parcel.writeString(this.f106300b);
    }
}
