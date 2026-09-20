package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class kmo implements Parcelable {
    public static final Parcelable.Creator<kmo> CREATOR = new pkl(27);

    /* JADX INFO: renamed from: a */
    public final String f124182a;

    /* JADX INFO: renamed from: b */
    public final String f124183b;

    /* JADX INFO: renamed from: c */
    public final Integer f124184c;

    /* JADX INFO: renamed from: d */
    public final Integer f124185d;

    /* JADX INFO: renamed from: e */
    public final Integer f124186e;

    /* JADX INFO: renamed from: f */
    public final String f124187f;

    /* JADX INFO: renamed from: g */
    public final String f124188g;

    public kmo(String str, String str2, Integer num, Integer num2, Integer num3, String str3, String str4) {
        this.f124182a = str;
        this.f124183b = str2;
        this.f124184c = num;
        this.f124185d = num2;
        this.f124186e = num3;
        this.f124187f = str3;
        this.f124188g = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmo)) {
            return false;
        }
        kmo kmoVar = (kmo) obj;
        return wj50.m88271j(this.f124182a, kmoVar.f124182a) && wj50.m88271j(this.f124183b, kmoVar.f124183b) && wj50.m88271j(this.f124184c, kmoVar.f124184c) && wj50.m88271j(this.f124185d, kmoVar.f124185d) && wj50.m88271j(this.f124186e, kmoVar.f124186e) && wj50.m88271j(this.f124187f, kmoVar.f124187f) && wj50.m88271j(this.f124188g, kmoVar.f124188g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f124182a.hashCode() * 31, 31, this.f124183b);
        Integer num = this.f124184c;
        int iHashCode = (iM77243b + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f124185d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f124186e;
        return this.f124188g.hashCode() + s571.m77243b((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31, 31, this.f124187f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f124182a);
        parcel.writeString(this.f124183b);
        Integer num = this.f124184c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        Integer num2 = this.f124185d;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num2);
        }
        Integer num3 = this.f124186e;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num3);
        }
        parcel.writeString(this.f124187f);
        parcel.writeString(this.f124188g);
    }
}
