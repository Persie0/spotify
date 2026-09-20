package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class vcl0 implements wcl0 {
    public static final Parcelable.Creator<vcl0> CREATOR = new hbl0(19);

    /* JADX INFO: renamed from: a */
    public final String f240157a;

    /* JADX INFO: renamed from: b */
    public final String f240158b;

    /* JADX INFO: renamed from: c */
    public final String f240159c;

    public vcl0(String str, String str2, String str3) {
        this.f240157a = str;
        this.f240158b = str2;
        this.f240159c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vcl0)) {
            return false;
        }
        vcl0 vcl0Var = (vcl0) obj;
        return wj50.m88271j(this.f240157a, vcl0Var.f240157a) && wj50.m88271j(this.f240158b, vcl0Var.f240158b) && wj50.m88271j(this.f240159c, vcl0Var.f240159c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f240157a.hashCode() * 31, 31, this.f240158b);
        String str = this.f240159c;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f240157a);
        parcel.writeString(this.f240158b);
        parcel.writeString(this.f240159c);
    }
}
