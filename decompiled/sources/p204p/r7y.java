package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class r7y implements Parcelable {
    public static final Parcelable.Creator<r7y> CREATOR = new wfw(28);

    /* JADX INFO: renamed from: a */
    public final String f196667a;

    /* JADX INFO: renamed from: b */
    public final String f196668b;

    /* JADX INFO: renamed from: c */
    public final String f196669c;

    public r7y(String str, String str2, String str3) {
        this.f196667a = str;
        this.f196668b = str2;
        this.f196669c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7y)) {
            return false;
        }
        r7y r7yVar = (r7y) obj;
        return wj50.m88271j(this.f196667a, r7yVar.f196667a) && wj50.m88271j(this.f196668b, r7yVar.f196668b) && wj50.m88271j(this.f196669c, r7yVar.f196669c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f196667a.hashCode() * 31, 31, this.f196668b);
        String str = this.f196669c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f196667a);
        parcel.writeString(this.f196668b);
        parcel.writeString(this.f196669c);
    }
}
