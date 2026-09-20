package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.bo */
/* JADX INFO: loaded from: classes7.dex */
public final class C1712bo implements InterfaceC1821eo {
    public static final Parcelable.Creator<C1712bo> CREATOR = new C2047kc(27);

    /* JADX INFO: renamed from: a */
    public final String f28961a;

    /* JADX INFO: renamed from: b */
    public final String f28962b;

    /* JADX INFO: renamed from: c */
    public final String f28963c;

    /* JADX INFO: renamed from: d */
    public final Integer f28964d;

    /* JADX INFO: renamed from: e */
    public final boolean f28965e;

    /* JADX INFO: renamed from: f */
    public final String f28966f;

    /* JADX INFO: renamed from: g */
    public final boolean f28967g;

    public C1712bo(Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.f28961a = str;
        this.f28962b = str2;
        this.f28963c = str3;
        this.f28964d = num;
        this.f28965e = z;
        this.f28966f = str4;
        this.f28967g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1712bo)) {
            return false;
        }
        C1712bo c1712bo = (C1712bo) obj;
        return wj50.m88271j(this.f28961a, c1712bo.f28961a) && wj50.m88271j(this.f28962b, c1712bo.f28962b) && wj50.m88271j(this.f28963c, c1712bo.f28963c) && wj50.m88271j(this.f28964d, c1712bo.f28964d) && this.f28965e == c1712bo.f28965e && wj50.m88271j(this.f28966f, c1712bo.f28966f) && this.f28967g == c1712bo.f28967g;
    }

    @Override // p204p.InterfaceC1821eo
    public final String getAvatar() {
        return this.f28963c;
    }

    @Override // p204p.InterfaceC1821eo
    public final Integer getColor() {
        return this.f28964d;
    }

    @Override // p204p.InterfaceC1821eo
    public final String getName() {
        return this.f28962b;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(this.f28961a.hashCode() * 31, 31, this.f28962b), 31, this.f28963c);
        Integer num = this.f28964d;
        int iM77245d = s571.m77245d((iM77243b + (num == null ? 0 : num.hashCode())) * 31, 31, this.f28965e);
        String str = this.f28966f;
        return Boolean.hashCode(this.f28967g) + ((iM77245d + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28961a);
        parcel.writeString(this.f28962b);
        parcel.writeString(this.f28963c);
        Integer num = this.f28964d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f28965e ? 1 : 0);
        parcel.writeString(this.f28966f);
        parcel.writeInt(this.f28967g ? 1 : 0);
    }
}
