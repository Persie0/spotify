package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class ehv extends ghv {
    public static final Parcelable.Creator<ehv> CREATOR = new m8v(11);

    /* JADX INFO: renamed from: a */
    public final String f59669a;

    /* JADX INFO: renamed from: b */
    public final String f59670b;

    /* JADX INFO: renamed from: c */
    public final String f59671c;

    /* JADX INFO: renamed from: d */
    public final String f59672d;

    /* JADX INFO: renamed from: e */
    public final String f59673e;

    /* JADX INFO: renamed from: f */
    public final String f59674f;

    /* JADX INFO: renamed from: g */
    public final String f59675g;

    /* JADX INFO: renamed from: h */
    public final String f59676h;

    /* JADX INFO: renamed from: i */
    public final Integer f59677i;

    public ehv(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
        this.f59669a = str;
        this.f59670b = str2;
        this.f59671c = str3;
        this.f59672d = str4;
        this.f59673e = str5;
        this.f59674f = str6;
        this.f59675g = str7;
        this.f59676h = str8;
        this.f59677i = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehv)) {
            return false;
        }
        ehv ehvVar = (ehv) obj;
        return wj50.m88271j(this.f59669a, ehvVar.f59669a) && wj50.m88271j(this.f59670b, ehvVar.f59670b) && wj50.m88271j(this.f59671c, ehvVar.f59671c) && wj50.m88271j(this.f59672d, ehvVar.f59672d) && wj50.m88271j(this.f59673e, ehvVar.f59673e) && wj50.m88271j(this.f59674f, ehvVar.f59674f) && wj50.m88271j(this.f59675g, ehvVar.f59675g) && wj50.m88271j(this.f59676h, ehvVar.f59676h) && wj50.m88271j(this.f59677i, ehvVar.f59677i);
    }

    @Override // p204p.ghv
    public final String getId() {
        return this.f59669a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f59669a.hashCode() * 31, 31, this.f59670b);
        String str = this.f59671c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f59672d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f59673e;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f59674f;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f59675g;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f59676h;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f59677i;
        return iHashCode6 + (num != null ? num.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f59669a);
        parcel.writeString(this.f59670b);
        parcel.writeString(this.f59671c);
        parcel.writeString(this.f59672d);
        parcel.writeString(this.f59673e);
        parcel.writeString(this.f59674f);
        parcel.writeString(this.f59675g);
        parcel.writeString(this.f59676h);
        Integer num = this.f59677i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
