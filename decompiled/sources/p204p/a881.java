package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class a881 implements Parcelable {
    public static final Parcelable.Creator<a881> CREATOR = new sr71(27);

    /* JADX INFO: renamed from: a */
    public final String f13219a;

    /* JADX INFO: renamed from: b */
    public final String f13220b;

    /* JADX INFO: renamed from: c */
    public final String f13221c;

    /* JADX INFO: renamed from: d */
    public final String f13222d;

    /* JADX INFO: renamed from: e */
    public final boolean f13223e;

    public a881(String str, String str2, String str3, String str4, boolean z) {
        this.f13219a = str;
        this.f13220b = str2;
        this.f13221c = str3;
        this.f13222d = str4;
        this.f13223e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a881)) {
            return false;
        }
        a881 a881Var = (a881) obj;
        return wj50.m88271j(this.f13219a, a881Var.f13219a) && wj50.m88271j(this.f13220b, a881Var.f13220b) && wj50.m88271j(this.f13221c, a881Var.f13221c) && wj50.m88271j(this.f13222d, a881Var.f13222d) && this.f13223e == a881Var.f13223e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13223e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f13219a.hashCode() * 31, 31, this.f13220b), 31, this.f13221c), 31, this.f13222d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13219a);
        parcel.writeString(this.f13220b);
        parcel.writeString(this.f13221c);
        parcel.writeString(this.f13222d);
        parcel.writeInt(this.f13223e ? 1 : 0);
    }
}
