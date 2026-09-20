package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class sfk implements Parcelable {
    public static final Parcelable.Creator<sfk> CREATOR = new kck(2);

    /* JADX INFO: renamed from: a */
    public final String f208605a;

    /* JADX INFO: renamed from: b */
    public final String f208606b;

    /* JADX INFO: renamed from: c */
    public final String f208607c;

    /* JADX INFO: renamed from: d */
    public final String f208608d;

    public sfk(String str, String str2, String str3, String str4) {
        this.f208605a = str;
        this.f208606b = str2;
        this.f208607c = str3;
        this.f208608d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfk)) {
            return false;
        }
        sfk sfkVar = (sfk) obj;
        return wj50.m88271j(this.f208605a, sfkVar.f208605a) && wj50.m88271j(this.f208606b, sfkVar.f208606b) && wj50.m88271j(this.f208607c, sfkVar.f208607c) && wj50.m88271j(this.f208608d, sfkVar.f208608d);
    }

    public final int hashCode() {
        return this.f208608d.hashCode() + s571.m77243b(s571.m77243b(this.f208605a.hashCode() * 31, 31, this.f208606b), 31, this.f208607c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f208605a);
        parcel.writeString(this.f208606b);
        parcel.writeString(this.f208607c);
        parcel.writeString(this.f208608d);
    }
}
