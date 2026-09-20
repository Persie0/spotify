package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class kvy implements lvy {
    public static final Parcelable.Creator<kvy> CREATOR = new eqy(17);

    /* JADX INFO: renamed from: a */
    public final String f126977a;

    /* JADX INFO: renamed from: b */
    public final String f126978b;

    /* JADX INFO: renamed from: c */
    public final String f126979c;

    /* JADX INFO: renamed from: d */
    public final String f126980d;

    public kvy(String str, String str2, String str3, String str4) {
        this.f126977a = str;
        this.f126978b = str2;
        this.f126979c = str3;
        this.f126980d = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m57491c() {
        return this.f126979c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvy)) {
            return false;
        }
        kvy kvyVar = (kvy) obj;
        return wj50.m88271j(this.f126977a, kvyVar.f126977a) && wj50.m88271j(this.f126978b, kvyVar.f126978b) && wj50.m88271j(this.f126979c, kvyVar.f126979c) && wj50.m88271j(this.f126980d, kvyVar.f126980d);
    }

    public final String getLabel() {
        return this.f126978b;
    }

    public final String getText() {
        return this.f126980d;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f126977a.hashCode() * 31, 31, this.f126978b);
        String str = this.f126979c;
        return this.f126980d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126977a);
        parcel.writeString(this.f126978b);
        parcel.writeString(this.f126979c);
        parcel.writeString(this.f126980d);
    }
}
