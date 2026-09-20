package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class d181 implements Parcelable {
    public static final Parcelable.Creator<d181> CREATOR = new sr71(21);

    /* JADX INFO: renamed from: a */
    public final String f44189a;

    /* JADX INFO: renamed from: b */
    public final boolean f44190b;

    /* JADX INFO: renamed from: c */
    public final int f44191c;

    /* JADX INFO: renamed from: d */
    public final boolean f44192d;

    /* JADX INFO: renamed from: e */
    public final Integer f44193e;

    /* JADX INFO: renamed from: f */
    public final boolean f44194f;

    /* JADX INFO: renamed from: g */
    public final Integer f44195g;

    /* JADX INFO: renamed from: h */
    public final boolean f44196h;

    public d181(String str, boolean z, int i, boolean z2, Integer num, boolean z3, Integer num2, boolean z4) {
        this.f44189a = str;
        this.f44190b = z;
        this.f44191c = i;
        this.f44192d = z2;
        this.f44193e = num;
        this.f44194f = z3;
        this.f44195g = num2;
        this.f44196h = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d181)) {
            return false;
        }
        d181 d181Var = (d181) obj;
        return wj50.m88271j(this.f44189a, d181Var.f44189a) && this.f44190b == d181Var.f44190b && this.f44191c == d181Var.f44191c && this.f44192d == d181Var.f44192d && wj50.m88271j(this.f44193e, d181Var.f44193e) && this.f44194f == d181Var.f44194f && wj50.m88271j(this.f44195g, d181Var.f44195g) && this.f44196h == d181Var.f44196h;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(mt60.m62800g(this.f44191c, s571.m77245d(this.f44189a.hashCode() * 31, 31, this.f44190b), 31), 31, this.f44192d);
        Integer num = this.f44193e;
        int iM77245d2 = s571.m77245d((iM77245d + (num == null ? 0 : num.hashCode())) * 31, 31, this.f44194f);
        Integer num2 = this.f44195g;
        return Boolean.hashCode(this.f44196h) + ((iM77245d2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44189a);
        parcel.writeInt(this.f44190b ? 1 : 0);
        parcel.writeInt(this.f44191c);
        parcel.writeInt(this.f44192d ? 1 : 0);
        Integer num = this.f44193e;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeInt(this.f44194f ? 1 : 0);
        Integer num2 = this.f44195g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num2);
        }
        parcel.writeInt(this.f44196h ? 1 : 0);
    }
}
