package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class dzd implements Parcelable {
    public static final Parcelable.Creator<dzd> CREATOR = new fjd(22);

    /* JADX INFO: renamed from: a */
    public final String f54629a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f54630b;

    /* JADX INFO: renamed from: c */
    public final String f54631c;

    /* JADX INFO: renamed from: d */
    public final String f54632d;

    public dzd(String str, CharSequence charSequence, String str2, String str3) {
        this.f54629a = str;
        this.f54630b = charSequence;
        this.f54631c = str2;
        this.f54632d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dzd)) {
            return false;
        }
        dzd dzdVar = (dzd) obj;
        return wj50.m88271j(this.f54629a, dzdVar.f54629a) && wj50.m88271j(this.f54630b, dzdVar.f54630b) && wj50.m88271j(this.f54631c, dzdVar.f54631c) && wj50.m88271j(this.f54632d, dzdVar.f54632d);
    }

    public final int hashCode() {
        int iHashCode = (this.f54630b.hashCode() + (this.f54629a.hashCode() * 31)) * 31;
        String str = this.f54631c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54632d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54629a);
        TextUtils.writeToParcel(this.f54630b, parcel, i);
        parcel.writeString(this.f54631c);
        parcel.writeString(this.f54632d);
    }
}
