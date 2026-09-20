package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.av */
/* JADX INFO: loaded from: classes4.dex */
public final class C1681av implements Parcelable {
    public static final Parcelable.Creator<C1681av> CREATOR = new C2267ps(6);

    /* JADX INFO: renamed from: a */
    public final String f20052a;

    /* JADX INFO: renamed from: b */
    public final String f20053b;

    /* JADX INFO: renamed from: c */
    public final String f20054c;

    /* JADX INFO: renamed from: d */
    public final Integer f20055d;

    /* JADX INFO: renamed from: e */
    public final boolean f20056e;

    /* JADX INFO: renamed from: f */
    public final Long f20057f;

    public C1681av(String str, String str2, String str3, Integer num, boolean z, Long l) {
        this.f20052a = str;
        this.f20053b = str2;
        this.f20054c = str3;
        this.f20055d = num;
        this.f20056e = z;
        this.f20057f = l;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m27221c() {
        return this.f20056e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1681av)) {
            return false;
        }
        C1681av c1681av = (C1681av) obj;
        return wj50.m88271j(this.f20052a, c1681av.f20052a) && wj50.m88271j(this.f20053b, c1681av.f20053b) && wj50.m88271j(this.f20054c, c1681av.f20054c) && wj50.m88271j(this.f20055d, c1681av.f20055d) && this.f20056e == c1681av.f20056e && wj50.m88271j(this.f20057f, c1681av.f20057f);
    }

    public final int hashCode() {
        int iHashCode = this.f20052a.hashCode() * 31;
        String str = this.f20053b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20054c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20055d;
        int iM77245d = s571.m77245d((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.f20056e);
        Long l = this.f20057f;
        return iM77245d + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20052a);
        parcel.writeString(this.f20053b);
        parcel.writeString(this.f20054c);
        Integer num = this.f20055d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f20056e ? 1 : 0);
        Long l = this.f20057f;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }

    public /* synthetic */ C1681av(int i, Integer num, String str, String str2, String str3) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, false, null);
    }
}
