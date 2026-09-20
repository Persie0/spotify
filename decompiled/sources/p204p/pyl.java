package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class pyl implements Parcelable {
    public static final Parcelable.Creator<pyl> CREATOR = new pkl(6);

    /* JADX INFO: renamed from: a */
    public final String f183429a;

    /* JADX INFO: renamed from: b */
    public final String f183430b;

    public pyl(String str, String str2) {
        this.f183429a = str;
        this.f183430b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pyl)) {
            return false;
        }
        pyl pylVar = (pyl) obj;
        return wj50.m88271j(this.f183429a, pylVar.f183429a) && wj50.m88271j(this.f183430b, pylVar.f183430b);
    }

    public final int hashCode() {
        int iHashCode = this.f183429a.hashCode() * 31;
        String str = this.f183430b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f183429a);
        parcel.writeString(this.f183430b);
    }
}
