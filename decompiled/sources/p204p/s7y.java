package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class s7y implements Parcelable {
    public static final Parcelable.Creator<s7y> CREATOR = new wfw(29);

    /* JADX INFO: renamed from: a */
    public final String f206492a;

    /* JADX INFO: renamed from: b */
    public final String f206493b;

    /* JADX INFO: renamed from: c */
    public final String f206494c;

    public s7y(String str, String str2, String str3) {
        this.f206492a = str;
        this.f206493b = str2;
        this.f206494c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7y)) {
            return false;
        }
        s7y s7yVar = (s7y) obj;
        return wj50.m88271j(this.f206492a, s7yVar.f206492a) && wj50.m88271j(this.f206493b, s7yVar.f206493b) && wj50.m88271j(this.f206494c, s7yVar.f206494c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f206492a.hashCode() * 31, 31, this.f206493b);
        String str = this.f206494c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f206492a);
        parcel.writeString(this.f206493b);
        parcel.writeString(this.f206494c);
    }
}
