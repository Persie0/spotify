package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class sf60 implements Parcelable {
    public static final Parcelable.Creator<sf60> CREATOR = new pq50(17);

    /* JADX INFO: renamed from: a */
    public final String f208474a;

    /* JADX INFO: renamed from: b */
    public final List f208475b;

    /* JADX INFO: renamed from: c */
    public final String f208476c;

    /* JADX INFO: renamed from: d */
    public final String f208477d;

    /* JADX INFO: renamed from: e */
    public final String f208478e;

    /* JADX INFO: renamed from: f */
    public final String f208479f;

    public sf60(String str, String str2, String str3, String str4, List list, String str5) {
        this.f208474a = str;
        this.f208475b = list;
        this.f208476c = str2;
        this.f208477d = str3;
        this.f208478e = str4;
        this.f208479f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sf60)) {
            return false;
        }
        sf60 sf60Var = (sf60) obj;
        return wj50.m88271j(this.f208474a, sf60Var.f208474a) && wj50.m88271j(this.f208475b, sf60Var.f208475b) && wj50.m88271j(this.f208476c, sf60Var.f208476c) && wj50.m88271j(this.f208477d, sf60Var.f208477d) && wj50.m88271j(this.f208478e, sf60Var.f208478e) && wj50.m88271j(this.f208479f, sf60Var.f208479f);
    }

    public final int hashCode() {
        String str = this.f208474a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f208475b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.f208476c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f208477d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f208478e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f208479f;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f208474a);
        parcel.writeStringList(this.f208475b);
        parcel.writeString(this.f208476c);
        parcel.writeString(this.f208477d);
        parcel.writeString(this.f208478e);
        parcel.writeString(this.f208479f);
    }
}
