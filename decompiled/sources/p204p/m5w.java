package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class m5w implements Parcelable {
    public static final Parcelable.Creator<m5w> CREATOR = new bwv(11);

    /* JADX INFO: renamed from: a */
    public final String f140294a;

    /* JADX INFO: renamed from: b */
    public final Bundle f140295b;

    /* JADX INFO: renamed from: c */
    public final String f140296c;

    /* JADX INFO: renamed from: d */
    public final Long f140297d;

    /* JADX INFO: renamed from: e */
    public final Long f140298e;

    /* JADX INFO: renamed from: f */
    public final Long f140299f;

    /* JADX INFO: renamed from: g */
    public final Long f140300g;

    /* JADX INFO: renamed from: h */
    public final boolean f140301h;

    /* JADX INFO: renamed from: i */
    public final boolean f140302i;

    /* JADX INFO: renamed from: t */
    public final boolean f140303t;

    public m5w(String str, Bundle bundle, String str2, Long l, Long l2, Long l3, Long l4, boolean z, boolean z2, boolean z3) {
        this.f140294a = str;
        this.f140295b = bundle;
        this.f140296c = str2;
        this.f140297d = l;
        this.f140298e = l2;
        this.f140299f = l3;
        this.f140300g = l4;
        this.f140301h = z;
        this.f140302i = z2;
        this.f140303t = z3;
    }

    /* JADX INFO: renamed from: c */
    public final String m60889c() {
        return this.f140294a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5w)) {
            return false;
        }
        m5w m5wVar = (m5w) obj;
        return wj50.m88271j(this.f140294a, m5wVar.f140294a) && wj50.m88271j(this.f140295b, m5wVar.f140295b) && wj50.m88271j(this.f140296c, m5wVar.f140296c) && wj50.m88271j(this.f140297d, m5wVar.f140297d) && wj50.m88271j(this.f140298e, m5wVar.f140298e) && wj50.m88271j(this.f140299f, m5wVar.f140299f) && wj50.m88271j(this.f140300g, m5wVar.f140300g) && this.f140301h == m5wVar.f140301h && this.f140302i == m5wVar.f140302i && this.f140303t == m5wVar.f140303t;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m60890g() {
        return this.f140301h;
    }

    public final int hashCode() {
        int iHashCode = this.f140294a.hashCode() * 31;
        Bundle bundle = this.f140295b;
        int iM77243b = s571.m77243b((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31, 31, this.f140296c);
        Long l = this.f140297d;
        int iHashCode2 = (iM77243b + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f140298e;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f140299f;
        int iHashCode4 = (iHashCode3 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f140300g;
        return Boolean.hashCode(this.f140303t) + s571.m77245d(s571.m77245d((iHashCode4 + (l4 != null ? l4.hashCode() : 0)) * 31, 31, this.f140301h), 31, this.f140302i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f140294a);
        parcel.writeBundle(this.f140295b);
        parcel.writeString(this.f140296c);
        Long l = this.f140297d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
        Long l2 = this.f140298e;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l2);
        }
        Long l3 = this.f140299f;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l3);
        }
        Long l4 = this.f140300g;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l4);
        }
        parcel.writeInt(this.f140301h ? 1 : 0);
        parcel.writeInt(this.f140302i ? 1 : 0);
        parcel.writeInt(this.f140303t ? 1 : 0);
    }
}
