package p204p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class axa0 implements Parcelable {
    public static final Parcelable.Creator<axa0> CREATOR = new ama0(18);

    /* JADX INFO: renamed from: a */
    public final String f20819a;

    /* JADX INFO: renamed from: b */
    public final String f20820b;

    /* JADX INFO: renamed from: c */
    public final tyv f20821c;

    /* JADX INFO: renamed from: d */
    public final Integer f20822d;

    /* JADX INFO: renamed from: e */
    public final Intent f20823e;

    /* JADX INFO: renamed from: f */
    public final int f20824f;

    /* JADX INFO: renamed from: g */
    public final int f20825g;

    /* JADX INFO: renamed from: h */
    public final boolean f20826h;

    /* JADX INFO: renamed from: i */
    public final boolean f20827i;

    public axa0(String str, String str2, tyv tyvVar, Integer num, Intent intent, int i, int i2, boolean z, boolean z2) {
        this.f20819a = str;
        this.f20820b = str2;
        this.f20821c = tyvVar;
        this.f20822d = num;
        this.f20823e = intent;
        this.f20824f = i;
        this.f20825g = i2;
        this.f20826h = z;
        this.f20827i = z2;
    }

    /* JADX INFO: renamed from: c */
    public static axa0 m27371c(axa0 axa0Var, Intent intent, int i, int i2, boolean z, int i3) {
        String str = axa0Var.f20819a;
        String str2 = axa0Var.f20820b;
        tyv tyvVar = axa0Var.f20821c;
        Integer num = axa0Var.f20822d;
        if ((i3 & 16) != 0) {
            intent = axa0Var.f20823e;
        }
        Intent intent2 = intent;
        if ((i3 & 32) != 0) {
            i = axa0Var.f20824f;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = axa0Var.f20825g;
        }
        int i5 = i2;
        if ((i3 & 128) != 0) {
            z = axa0Var.f20826h;
        }
        boolean z2 = axa0Var.f20827i;
        axa0Var.getClass();
        return new axa0(str, str2, tyvVar, num, intent2, i4, i5, z, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axa0)) {
            return false;
        }
        axa0 axa0Var = (axa0) obj;
        return wj50.m88271j(this.f20819a, axa0Var.f20819a) && wj50.m88271j(this.f20820b, axa0Var.f20820b) && wj50.m88271j(this.f20821c, axa0Var.f20821c) && wj50.m88271j(this.f20822d, axa0Var.f20822d) && wj50.m88271j(this.f20823e, axa0Var.f20823e) && this.f20824f == axa0Var.f20824f && this.f20825g == axa0Var.f20825g && this.f20826h == axa0Var.f20826h && this.f20827i == axa0Var.f20827i;
    }

    public final int hashCode() {
        int iHashCode = (this.f20821c.hashCode() + s571.m77243b(this.f20819a.hashCode() * 31, 31, this.f20820b)) * 31;
        Integer num = this.f20822d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Intent intent = this.f20823e;
        return Boolean.hashCode(this.f20827i) + s571.m77245d(f710.m40938f(this.f20825g, f710.m40938f(this.f20824f, (iHashCode2 + (intent != null ? intent.hashCode() : 0)) * 31, 31), 31), 31, this.f20826h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        String str2;
        parcel.writeString(this.f20819a);
        parcel.writeString(this.f20820b);
        parcel.writeParcelable(this.f20821c, i);
        Integer num = this.f20822d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nap.m64025r(parcel, 1, num);
        }
        parcel.writeParcelable(this.f20823e, i);
        int i2 = this.f20824f;
        if (i2 == 1) {
            str = "READY";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "LOADING";
        }
        parcel.writeString(str);
        int i3 = this.f20825g;
        if (i3 == 1) {
            str2 = "NONE";
        } else if (i3 == 2) {
            str2 = "LOGIN_FAILED";
        } else {
            if (i3 != 3) {
                throw null;
            }
            str2 = "UPGRADE_REQUIRED";
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f20826h ? 1 : 0);
        parcel.writeInt(this.f20827i ? 1 : 0);
    }
}
