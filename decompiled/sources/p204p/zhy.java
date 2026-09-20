package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zhy implements biy {
    public static final Parcelable.Creator<zhy> CREATOR = new p7y(17);

    /* JADX INFO: renamed from: a */
    public final String f283023a;

    /* JADX INFO: renamed from: b */
    public final String f283024b;

    /* JADX INFO: renamed from: c */
    public final String f283025c;

    /* JADX INFO: renamed from: d */
    public final Integer f283026d;

    /* JADX INFO: renamed from: e */
    public final String f283027e;

    /* JADX INFO: renamed from: f */
    public final String f283028f;

    /* JADX INFO: renamed from: g */
    public final String f283029g;

    /* JADX INFO: renamed from: h */
    public final xhy f283030h;

    /* JADX INFO: renamed from: i */
    public final String f283031i;

    /* JADX INFO: renamed from: t */
    public final String f283032t;

    public zhy(String str, String str2, String str3, Integer num, String str4, String str5, String str6, xhy xhyVar, String str7, String str8) {
        this.f283023a = str;
        this.f283024b = str2;
        this.f283025c = str3;
        this.f283026d = num;
        this.f283027e = str4;
        this.f283028f = str5;
        this.f283029g = str6;
        this.f283030h = xhyVar;
        this.f283031i = str7;
        this.f283032t = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhy)) {
            return false;
        }
        zhy zhyVar = (zhy) obj;
        return wj50.m88271j(this.f283023a, zhyVar.f283023a) && wj50.m88271j(this.f283024b, zhyVar.f283024b) && wj50.m88271j(this.f283025c, zhyVar.f283025c) && wj50.m88271j(this.f283026d, zhyVar.f283026d) && wj50.m88271j(this.f283027e, zhyVar.f283027e) && wj50.m88271j(this.f283028f, zhyVar.f283028f) && wj50.m88271j(this.f283029g, zhyVar.f283029g) && wj50.m88271j(this.f283030h, zhyVar.f283030h) && wj50.m88271j(this.f283031i, zhyVar.f283031i) && wj50.m88271j(this.f283032t, zhyVar.f283032t);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f283023a.hashCode() * 31, 31, this.f283024b), 31, this.f283025c);
        Integer num = this.f283026d;
        int iHashCode = (this.f283030h.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f283027e), 31, this.f283028f), 31, this.f283029g)) * 31;
        String str = this.f283031i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f283032t;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283023a);
        parcel.writeString(this.f283024b);
        parcel.writeString(this.f283025c);
        Integer num = this.f283026d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeString(this.f283027e);
        parcel.writeString(this.f283028f);
        parcel.writeString(this.f283029g);
        parcel.writeParcelable(this.f283030h, i);
        parcel.writeString(this.f283031i);
        parcel.writeString(this.f283032t);
    }
}
