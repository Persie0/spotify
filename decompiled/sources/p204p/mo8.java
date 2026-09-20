package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class mo8 implements Parcelable {
    public static final Parcelable.Creator<mo8> CREATOR = new yi8(15);

    /* JADX INFO: renamed from: L0 */
    public final ern0 f145605L0;

    /* JADX INFO: renamed from: M0 */
    public final String f145606M0;

    /* JADX INFO: renamed from: N0 */
    public final Boolean f145607N0;

    /* JADX INFO: renamed from: O0 */
    public final xr01 f145608O0;

    /* JADX INFO: renamed from: P0 */
    public final f2r f145609P0;

    /* JADX INFO: renamed from: Q0 */
    public final z0r f145610Q0;

    /* JADX INFO: renamed from: X */
    public final String f145611X;

    /* JADX INFO: renamed from: Y */
    public final String f145612Y;

    /* JADX INFO: renamed from: Z */
    public final k1b1 f145613Z;

    /* JADX INFO: renamed from: a */
    public final String f145614a;

    /* JADX INFO: renamed from: b */
    public final int f145615b;

    /* JADX INFO: renamed from: c */
    public final qf40 f145616c;

    /* JADX INFO: renamed from: d */
    public final gcr0 f145617d;

    /* JADX INFO: renamed from: e */
    public final int f145618e;

    /* JADX INFO: renamed from: f */
    public final ao8 f145619f;

    /* JADX INFO: renamed from: g */
    public final zn8 f145620g;

    /* JADX INFO: renamed from: h */
    public final ck01 f145621h;

    /* JADX INFO: renamed from: i */
    public final ou31 f145622i;

    /* JADX INFO: renamed from: t */
    public final String f145623t;

    public mo8(String str, int i, qf40 qf40Var, gcr0 gcr0Var, int i2, ao8 ao8Var, zn8 zn8Var, ck01 ck01Var, ou31 ou31Var, String str2, String str3, String str4, k1b1 k1b1Var, ern0 ern0Var, String str5, Boolean bool, xr01 xr01Var, f2r f2rVar, z0r z0rVar) {
        this.f145614a = str;
        this.f145615b = i;
        this.f145616c = qf40Var;
        this.f145617d = gcr0Var;
        this.f145618e = i2;
        this.f145619f = ao8Var;
        this.f145620g = zn8Var;
        this.f145621h = ck01Var;
        this.f145622i = ou31Var;
        this.f145623t = str2;
        this.f145611X = str3;
        this.f145612Y = str4;
        this.f145613Z = k1b1Var;
        this.f145605L0 = ern0Var;
        this.f145606M0 = str5;
        this.f145607N0 = bool;
        this.f145608O0 = xr01Var;
        this.f145609P0 = f2rVar;
        this.f145610Q0 = z0rVar;
    }

    /* JADX INFO: renamed from: c */
    public static mo8 m62395c(mo8 mo8Var, int i, z0r z0rVar, int i2) {
        String str = mo8Var.f145614a;
        int i3 = (i2 & 2) != 0 ? mo8Var.f145615b : i;
        qf40 qf40Var = mo8Var.f145616c;
        gcr0 gcr0Var = mo8Var.f145617d;
        int i4 = mo8Var.f145618e;
        ao8 ao8Var = mo8Var.f145619f;
        zn8 zn8Var = mo8Var.f145620g;
        ck01 ck01Var = mo8Var.f145621h;
        ou31 ou31Var = mo8Var.f145622i;
        String str2 = mo8Var.f145623t;
        String str3 = mo8Var.f145611X;
        String str4 = mo8Var.f145612Y;
        k1b1 k1b1Var = mo8Var.f145613Z;
        ern0 ern0Var = mo8Var.f145605L0;
        String str5 = mo8Var.f145606M0;
        Boolean bool = mo8Var.f145607N0;
        xr01 xr01Var = mo8Var.f145608O0;
        f2r f2rVar = mo8Var.f145609P0;
        z0r z0rVar2 = (i2 & 262144) != 0 ? mo8Var.f145610Q0 : z0rVar;
        mo8Var.getClass();
        return new mo8(str, i3, qf40Var, gcr0Var, i4, ao8Var, zn8Var, ck01Var, ou31Var, str2, str3, str4, k1b1Var, ern0Var, str5, bool, xr01Var, f2rVar, z0rVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo8)) {
            return false;
        }
        mo8 mo8Var = (mo8) obj;
        return wj50.m88271j(this.f145614a, mo8Var.f145614a) && this.f145615b == mo8Var.f145615b && wj50.m88271j(this.f145616c, mo8Var.f145616c) && wj50.m88271j(this.f145617d, mo8Var.f145617d) && this.f145618e == mo8Var.f145618e && wj50.m88271j(this.f145619f, mo8Var.f145619f) && wj50.m88271j(this.f145620g, mo8Var.f145620g) && wj50.m88271j(this.f145621h, mo8Var.f145621h) && wj50.m88271j(this.f145622i, mo8Var.f145622i) && wj50.m88271j(this.f145623t, mo8Var.f145623t) && wj50.m88271j(this.f145611X, mo8Var.f145611X) && wj50.m88271j(this.f145612Y, mo8Var.f145612Y) && wj50.m88271j(this.f145613Z, mo8Var.f145613Z) && wj50.m88271j(this.f145605L0, mo8Var.f145605L0) && wj50.m88271j(this.f145606M0, mo8Var.f145606M0) && wj50.m88271j(this.f145607N0, mo8Var.f145607N0) && wj50.m88271j(this.f145608O0, mo8Var.f145608O0) && wj50.m88271j(this.f145609P0, mo8Var.f145609P0) && wj50.m88271j(this.f145610Q0, mo8Var.f145610Q0);
    }

    public final int hashCode() {
        int iM42461e = fr0.m42461e(this.f145616c, mt60.m62800g(this.f145615b, this.f145614a.hashCode() * 31, 31), 31);
        gcr0 gcr0Var = this.f145617d;
        int iM40938f = f710.m40938f(this.f145618e, (iM42461e + (gcr0Var == null ? 0 : gcr0Var.hashCode())) * 31, 31);
        ao8 ao8Var = this.f145619f;
        int iHashCode = (iM40938f + (ao8Var == null ? 0 : ao8Var.hashCode())) * 31;
        zn8 zn8Var = this.f145620g;
        int iHashCode2 = (this.f145622i.hashCode() + ((this.f145621h.hashCode() + ((iHashCode + (zn8Var == null ? 0 : zn8Var.hashCode())) * 31)) * 31)) * 31;
        String str = this.f145623t;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145611X;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f145612Y;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        k1b1 k1b1Var = this.f145613Z;
        int iHashCode6 = (this.f145605L0.hashCode() + ((iHashCode5 + (k1b1Var == null ? 0 : k1b1Var.hashCode())) * 31)) * 31;
        String str4 = this.f145606M0;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f145607N0;
        int iHashCode8 = (this.f145609P0.hashCode() + ((this.f145608O0.f265192a.hashCode() + ((iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        z0r z0rVar = this.f145610Q0;
        return iHashCode8 + (z0rVar != null ? z0rVar.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f145614a);
        parcel.writeInt(this.f145615b);
        qf40 qf40Var = this.f145616c;
        parcel.writeInt(((AbstractC2282q6) qf40Var).mo33075a());
        Iterator it = qf40Var.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
        parcel.writeParcelable(this.f145617d, i);
        parcel.writeString(stz0.m79362p(this.f145618e));
        parcel.writeParcelable(this.f145619f, i);
        parcel.writeParcelable(this.f145620g, i);
        parcel.writeParcelable(this.f145621h, i);
        parcel.writeParcelable(this.f145622i, i);
        parcel.writeString(this.f145623t);
        parcel.writeString(this.f145611X);
        parcel.writeString(this.f145612Y);
        parcel.writeParcelable(this.f145613Z, i);
        AbstractC2328r7 abstractC2328r7 = (AbstractC2328r7) this.f145605L0;
        parcel.writeInt(abstractC2328r7.mo36659c());
        for (Map.Entry entry : (ig40) abstractC2328r7.mo36657a()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeString(this.f145606M0);
        Boolean bool = this.f145607N0;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            ei6.m39078o(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f145608O0, i);
        parcel.writeParcelable(this.f145609P0, i);
    }
}
