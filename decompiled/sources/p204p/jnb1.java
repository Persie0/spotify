package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class jnb1 implements Parcelable {
    public static final Parcelable.Creator<jnb1> CREATOR = new c8b1(8);

    /* JADX INFO: renamed from: L0 */
    public final String f114056L0;

    /* JADX INFO: renamed from: X */
    public final String f114057X;

    /* JADX INFO: renamed from: Y */
    public final String f114058Y;

    /* JADX INFO: renamed from: Z */
    public final String f114059Z;

    /* JADX INFO: renamed from: a */
    public final String f114060a;

    /* JADX INFO: renamed from: b */
    public final String f114061b;

    /* JADX INFO: renamed from: c */
    public final String f114062c;

    /* JADX INFO: renamed from: d */
    public final List f114063d;

    /* JADX INFO: renamed from: e */
    public final String f114064e;

    /* JADX INFO: renamed from: f */
    public final String f114065f;

    /* JADX INFO: renamed from: g */
    public final String f114066g;

    /* JADX INFO: renamed from: h */
    public final String f114067h;

    /* JADX INFO: renamed from: i */
    public final String f114068i;

    /* JADX INFO: renamed from: t */
    public final String f114069t;

    public jnb1(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.f114060a = str;
        this.f114061b = str2;
        this.f114062c = str3;
        this.f114063d = list;
        this.f114064e = str4;
        this.f114065f = str5;
        this.f114066g = str6;
        this.f114067h = str7;
        this.f114068i = str8;
        this.f114069t = str9;
        this.f114057X = str10;
        this.f114058Y = str11;
        this.f114059Z = str12;
        this.f114056L0 = str13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnb1)) {
            return false;
        }
        jnb1 jnb1Var = (jnb1) obj;
        return wj50.m88271j(this.f114060a, jnb1Var.f114060a) && wj50.m88271j(this.f114061b, jnb1Var.f114061b) && wj50.m88271j(this.f114062c, jnb1Var.f114062c) && wj50.m88271j(this.f114063d, jnb1Var.f114063d) && wj50.m88271j(this.f114064e, jnb1Var.f114064e) && wj50.m88271j(this.f114065f, jnb1Var.f114065f) && wj50.m88271j(this.f114066g, jnb1Var.f114066g) && wj50.m88271j(this.f114067h, jnb1Var.f114067h) && wj50.m88271j(this.f114068i, jnb1Var.f114068i) && wj50.m88271j(this.f114069t, jnb1Var.f114069t) && wj50.m88271j(this.f114057X, jnb1Var.f114057X) && wj50.m88271j(this.f114058Y, jnb1Var.f114058Y) && wj50.m88271j(this.f114059Z, jnb1Var.f114059Z) && wj50.m88271j(this.f114056L0, jnb1Var.f114056L0);
    }

    public final int hashCode() {
        int iHashCode = this.f114060a.hashCode() * 31;
        String str = this.f114061b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f114062c;
        int iM77243b = s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77244c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f114063d), 31, this.f114064e), 31, this.f114065f), 31, this.f114066g), 31, this.f114067h), 31, this.f114068i);
        String str3 = this.f114069t;
        return this.f114056L0.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b((iM77243b + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f114057X), 31, this.f114058Y), 31, this.f114059Z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f114060a);
        parcel.writeString(this.f114061b);
        parcel.writeString(this.f114062c);
        Iterator itM42468l = fr0.m42468l(parcel, this.f114063d);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeString(this.f114064e);
        parcel.writeString(this.f114065f);
        parcel.writeString(this.f114066g);
        parcel.writeString(this.f114067h);
        parcel.writeString(this.f114068i);
        parcel.writeString(this.f114069t);
        parcel.writeString(this.f114057X);
        parcel.writeString(this.f114058Y);
        parcel.writeString(this.f114059Z);
        parcel.writeString(this.f114056L0);
    }
}
