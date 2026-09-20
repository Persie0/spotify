package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
@rtz0
public final class d850 implements Serializable, Parcelable {

    /* JADX INFO: renamed from: a */
    public final z650 f46380a;

    /* JADX INFO: renamed from: b */
    public final kbm0 f46381b;

    /* JADX INFO: renamed from: c */
    public final boolean f46382c;

    /* JADX INFO: renamed from: d */
    public final long f46383d;

    /* JADX INFO: renamed from: e */
    public final long f46384e;

    /* JADX INFO: renamed from: f */
    public final Integer f46385f;

    /* JADX INFO: renamed from: g */
    public final gt91 f46386g;

    /* JADX INFO: renamed from: h */
    public final String f46387h;

    /* JADX INFO: renamed from: i */
    public final String f46388i;

    /* JADX INFO: renamed from: t */
    public final String f46389t;
    public static final c850 Companion = new c850();
    public static final Parcelable.Creator<d850> CREATOR = new y240(29);

    public d850(int i, z650 z650Var, kbm0 kbm0Var, boolean z, long j, long j2, Integer num, gt91 gt91Var, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            edo.m38617p(i, 3, b850.f24493a.getDescriptor());
            throw null;
        }
        this.f46380a = z650Var;
        this.f46381b = kbm0Var;
        if ((i & 4) == 0) {
            this.f46382c = true;
        } else {
            this.f46382c = z;
        }
        if ((i & 8) == 0) {
            this.f46383d = 0L;
        } else {
            this.f46383d = j;
        }
        if ((i & 16) == 0) {
            this.f46384e = 0L;
        } else {
            this.f46384e = j2;
        }
        if ((i & 32) == 0) {
            this.f46385f = null;
        } else {
            this.f46385f = num;
        }
        if ((i & 64) == 0) {
            gt91.Companion.getClass();
            this.f46386g = gt91.f84115e;
        } else {
            this.f46386g = gt91Var;
        }
        if ((i & 128) == 0) {
            this.f46387h = null;
        } else {
            this.f46387h = str;
        }
        if ((i & 256) == 0) {
            this.f46388i = null;
        } else {
            this.f46388i = str2;
        }
        if ((i & 512) == 0) {
            this.f46389t = null;
        } else {
            this.f46389t = str3;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d850)) {
            return false;
        }
        d850 d850Var = (d850) obj;
        return wj50.m88271j(this.f46380a, d850Var.f46380a) && wj50.m88271j(this.f46381b, d850Var.f46381b) && this.f46382c == d850Var.f46382c && this.f46383d == d850Var.f46383d && this.f46384e == d850Var.f46384e && wj50.m88271j(this.f46385f, d850Var.f46385f) && wj50.m88271j(this.f46386g, d850Var.f46386g) && wj50.m88271j(this.f46387h, d850Var.f46387h) && wj50.m88271j(this.f46388i, d850Var.f46388i) && wj50.m88271j(this.f46389t, d850Var.f46389t);
    }

    public final int hashCode() {
        int iHashCode = this.f46380a.f279709a.hashCode() * 31;
        kbm0 kbm0Var = this.f46381b;
        int iM36605e = dq60.m36605e(dq60.m36605e(s571.m77245d((iHashCode + (kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode())) * 31, 31, this.f46382c), this.f46383d, 31), this.f46384e, 31);
        Integer num = this.f46385f;
        int iHashCode2 = (this.f46386g.hashCode() + ((iM36605e + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str = this.f46387h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f46388i;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f46389t;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46380a.f279709a);
        kbm0 kbm0Var = this.f46381b;
        parcel.writeString(kbm0Var != null ? kbm0Var.f121231a : null);
        parcel.writeInt(this.f46382c ? 1 : 0);
        parcel.writeLong(this.f46383d);
        parcel.writeLong(this.f46384e);
        parcel.writeValue(this.f46385f);
        parcel.writeString(this.f46387h);
        parcel.writeString(this.f46388i);
        parcel.writeString(this.f46389t);
        parcel.writeSerializable(this.f46386g);
    }

    public d850(z650 z650Var, kbm0 kbm0Var, boolean z, long j, long j2, Integer num, gt91 gt91Var, String str, String str2, String str3) {
        this.f46380a = z650Var;
        this.f46381b = kbm0Var;
        this.f46382c = z;
        this.f46383d = j;
        this.f46384e = j2;
        this.f46385f = num;
        this.f46386g = gt91Var;
        this.f46387h = str;
        this.f46388i = str2;
        this.f46389t = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d850(z650 z650Var, kbm0 kbm0Var) {
        this(z650Var, kbm0Var, true, 0L, 0L, null, gt91.f84115e, null, null, null);
        gt91.Companion.getClass();
    }
}
