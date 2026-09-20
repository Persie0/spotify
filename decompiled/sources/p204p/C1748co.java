package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: p.co */
/* JADX INFO: loaded from: classes7.dex */
public final class C1748co implements InterfaceC1821eo {
    public static final Parcelable.Creator<C1748co> CREATOR = new C2047kc(28);

    /* JADX INFO: renamed from: a */
    public final String f40138a;

    /* JADX INFO: renamed from: b */
    public final String f40139b;

    /* JADX INFO: renamed from: c */
    public final Integer f40140c;

    public C1748co(Integer num, String str, String str2) {
        this.f40138a = str;
        this.f40139b = str2;
        this.f40140c = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1748co)) {
            return false;
        }
        C1748co c1748co = (C1748co) obj;
        return wj50.m88271j(this.f40138a, c1748co.f40138a) && wj50.m88271j(this.f40139b, c1748co.f40139b) && wj50.m88271j(this.f40140c, c1748co.f40140c);
    }

    @Override // p204p.InterfaceC1821eo
    public final String getAvatar() {
        return this.f40139b;
    }

    @Override // p204p.InterfaceC1821eo
    public final Integer getColor() {
        return this.f40140c;
    }

    @Override // p204p.InterfaceC1821eo
    public final String getName() {
        return this.f40138a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f40138a.hashCode() * 31, 31, this.f40139b);
        Integer num = this.f40140c;
        return iM77243b + (num == null ? 0 : num.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40138a);
        parcel.writeString(this.f40139b);
        Integer num = this.f40140c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
    }
}
