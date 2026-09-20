package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class khk implements Parcelable {
    public static final Parcelable.Creator<khk> CREATOR = new kck(8);

    /* JADX INFO: renamed from: a */
    public final String f122675a;

    /* JADX INFO: renamed from: b */
    public final String f122676b;

    /* JADX INFO: renamed from: c */
    public final String f122677c;

    /* JADX INFO: renamed from: d */
    public final String f122678d;

    public khk(String str, String str2, String str3, String str4) {
        this.f122675a = str;
        this.f122676b = str2;
        this.f122677c = str3;
        this.f122678d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khk)) {
            return false;
        }
        khk khkVar = (khk) obj;
        return wj50.m88271j(this.f122675a, khkVar.f122675a) && wj50.m88271j(this.f122676b, khkVar.f122676b) && wj50.m88271j(this.f122677c, khkVar.f122677c) && wj50.m88271j(this.f122678d, khkVar.f122678d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f122675a.hashCode() * 31, 31, this.f122676b), 31, this.f122677c);
        String str = this.f122678d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f122675a);
        parcel.writeString(this.f122676b);
        parcel.writeString(this.f122677c);
        parcel.writeString(this.f122678d);
    }
}
