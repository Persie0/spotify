package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class bpe1 implements Parcelable {
    public static final Parcelable.Creator<bpe1> CREATOR = new tne1(2);

    /* JADX INFO: renamed from: i */
    public static final Object f29423i = kkc0.m56695h0(new pqm0(jev.f111670a, d5a.class), new pqm0(jev.f111671b, mm11.class), new pqm0(jev.f111672c, h03.class), new pqm0(jev.f111673d, h5x.class), new pqm0(jev.f111674e, d8b1.class), new pqm0(jev.f111675f, kw5.class), new pqm0(jev.f111676g, mo7.class), new pqm0(jev.f111677h, lrz.class), new pqm0(jev.f111678i, hxk.class), new pqm0(jev.f111679t, ckp0.class), new pqm0(jev.f111667X, ncq0.class), new pqm0(jev.f111668Y, xca0.class), new pqm0(jev.f111669Z, qij0.class), new pqm0(jev.f111663L0, uyh.class), new pqm0(jev.f111664M0, ko3.class));

    /* JADX INFO: renamed from: a */
    public final String f29424a;

    /* JADX INFO: renamed from: b */
    public final String f29425b;

    /* JADX INFO: renamed from: c */
    public final boolean f29426c;

    /* JADX INFO: renamed from: d */
    public final String f29427d;

    /* JADX INFO: renamed from: e */
    public final jev f29428e;

    /* JADX INFO: renamed from: f */
    public final String f29429f;

    /* JADX INFO: renamed from: g */
    public final n4y f29430g;

    /* JADX INFO: renamed from: h */
    public final int f29431h;

    public bpe1(String str, String str2, boolean z, String str3, jev jevVar, String str4, n4y n4yVar, int i) {
        this.f29424a = str;
        this.f29425b = str2;
        this.f29426c = z;
        this.f29427d = str3;
        this.f29428e = jevVar;
        this.f29429f = str4;
        this.f29430g = n4yVar;
        this.f29431h = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpe1)) {
            return false;
        }
        bpe1 bpe1Var = (bpe1) obj;
        return wj50.m88271j(this.f29424a, bpe1Var.f29424a) && wj50.m88271j(this.f29425b, bpe1Var.f29425b) && this.f29426c == bpe1Var.f29426c && wj50.m88271j(this.f29427d, bpe1Var.f29427d) && this.f29428e == bpe1Var.f29428e && wj50.m88271j(this.f29429f, bpe1Var.f29429f) && wj50.m88271j(this.f29430g, bpe1Var.f29430g) && this.f29431h == bpe1Var.f29431h;
    }

    public final int hashCode() {
        int iHashCode = (this.f29428e.hashCode() + s571.m77243b(s571.m77245d(s571.m77243b(this.f29424a.hashCode() * 31, 31, this.f29425b), 31, this.f29426c), 31, this.f29427d)) * 31;
        String str = this.f29429f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        n4y n4yVar = this.f29430g;
        return edb.m38547C(this.f29431h) + ((iHashCode2 + (n4yVar != null ? n4yVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f29424a);
        parcel.writeString(this.f29425b);
        parcel.writeInt(this.f29426c ? 1 : 0);
        parcel.writeString(this.f29427d);
        parcel.writeString(this.f29428e.name());
        parcel.writeString(this.f29429f);
        parcel.writeParcelable(this.f29430g, i);
        int i2 = this.f29431h;
        if (i2 == 1) {
            str = "Empty";
        } else if (i2 == 2) {
            str = "Waiting";
        } else if (i2 == 3) {
            str = "Downloading";
        } else if (i2 == 4) {
            str = "Downloaded";
        } else {
            if (i2 != 5) {
                throw null;
            }
            str = "Error";
        }
        parcel.writeString(str);
    }
}
