package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class hz80 implements Parcelable {
    public static final Parcelable.Creator<hz80> CREATOR = new ct80(13);

    /* JADX INFO: renamed from: L0 */
    public final List f96811L0;

    /* JADX INFO: renamed from: M0 */
    public final Map f96812M0;

    /* JADX INFO: renamed from: N0 */
    public final boolean f96813N0;

    /* JADX INFO: renamed from: O0 */
    public final long f96814O0;

    /* JADX INFO: renamed from: P0 */
    public final int f96815P0;

    /* JADX INFO: renamed from: Q0 */
    public final b8l0 f96816Q0;

    /* JADX INFO: renamed from: R0 */
    public final gz80 f96817R0;

    /* JADX INFO: renamed from: S0 */
    public final int f96818S0;

    /* JADX INFO: renamed from: T0 */
    public final boolean f96819T0;

    /* JADX INFO: renamed from: U0 */
    public final boolean f96820U0;

    /* JADX INFO: renamed from: V0 */
    public final boolean f96821V0;

    /* JADX INFO: renamed from: X */
    public final Map f96822X;

    /* JADX INFO: renamed from: Y */
    public final ArrayList f96823Y;

    /* JADX INFO: renamed from: Z */
    public final List f96824Z;

    /* JADX INFO: renamed from: a */
    public final String f96825a;

    /* JADX INFO: renamed from: b */
    public final uzk f96826b;

    /* JADX INFO: renamed from: c */
    public final gz80 f96827c;

    /* JADX INFO: renamed from: d */
    public final String f96828d;

    /* JADX INFO: renamed from: e */
    public final String f96829e;

    /* JADX INFO: renamed from: f */
    public final boolean f96830f;

    /* JADX INFO: renamed from: g */
    public final String f96831g;

    /* JADX INFO: renamed from: h */
    public final boolean f96832h;

    /* JADX INFO: renamed from: i */
    public final lnn0 f96833i;

    /* JADX INFO: renamed from: t */
    public final noa1 f96834t;

    public hz80(String str, uzk uzkVar, gz80 gz80Var, String str2, String str3, boolean z, String str4, boolean z2, lnn0 lnn0Var, noa1 noa1Var, Map map, ArrayList arrayList, List list, List list2, Map map2, boolean z3, long j, int i, b8l0 b8l0Var, gz80 gz80Var2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f96825a = str;
        this.f96826b = uzkVar;
        this.f96827c = gz80Var;
        this.f96828d = str2;
        this.f96829e = str3;
        this.f96830f = z;
        this.f96831g = str4;
        this.f96832h = z2;
        this.f96833i = lnn0Var;
        this.f96834t = noa1Var;
        this.f96822X = map;
        this.f96823Y = arrayList;
        this.f96824Z = list;
        this.f96811L0 = list2;
        this.f96812M0 = map2;
        this.f96813N0 = z3;
        this.f96814O0 = j;
        this.f96815P0 = i;
        this.f96816Q0 = b8l0Var;
        this.f96817R0 = gz80Var2;
        this.f96818S0 = i2;
        this.f96819T0 = z4;
        this.f96820U0 = z5;
        this.f96821V0 = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz80)) {
            return false;
        }
        hz80 hz80Var = (hz80) obj;
        return wj50.m88271j(this.f96825a, hz80Var.f96825a) && wj50.m88271j(this.f96826b, hz80Var.f96826b) && wj50.m88271j(this.f96827c, hz80Var.f96827c) && wj50.m88271j(this.f96828d, hz80Var.f96828d) && wj50.m88271j(this.f96829e, hz80Var.f96829e) && this.f96830f == hz80Var.f96830f && wj50.m88271j(this.f96831g, hz80Var.f96831g) && this.f96832h == hz80Var.f96832h && this.f96833i == hz80Var.f96833i && wj50.m88271j(this.f96834t, hz80Var.f96834t) && wj50.m88271j(this.f96822X, hz80Var.f96822X) && this.f96823Y.equals(hz80Var.f96823Y) && wj50.m88271j(this.f96824Z, hz80Var.f96824Z) && wj50.m88271j(this.f96811L0, hz80Var.f96811L0) && wj50.m88271j(this.f96812M0, hz80Var.f96812M0) && this.f96813N0 == hz80Var.f96813N0 && this.f96814O0 == hz80Var.f96814O0 && this.f96815P0 == hz80Var.f96815P0 && this.f96816Q0 == hz80Var.f96816Q0 && wj50.m88271j(this.f96817R0, hz80Var.f96817R0) && this.f96818S0 == hz80Var.f96818S0 && this.f96819T0 == hz80Var.f96819T0 && this.f96820U0 == hz80Var.f96820U0 && this.f96821V0 == hz80Var.f96821V0;
    }

    public final int hashCode() {
        int iHashCode = (this.f96826b.hashCode() + (this.f96825a.hashCode() * 31)) * 31;
        gz80 gz80Var = this.f96827c;
        int iM77243b = s571.m77243b((iHashCode + (gz80Var == null ? 0 : gz80Var.hashCode())) * 31, 31, this.f96828d);
        String str = this.f96829e;
        int iM77245d = s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f96830f);
        String str2 = this.f96831g;
        int iHashCode2 = (this.f96816Q0.hashCode() + mt60.m62800g(this.f96815P0, dq60.m36605e(s571.m77245d(edb.m38557f(s571.m77244c(s571.m77244c(lq51.m59700f(this.f96823Y, edb.m38557f((this.f96834t.hashCode() + ((this.f96833i.hashCode() + s571.m77245d((iM77245d + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f96832h)) * 31)) * 31, 31, this.f96822X), 31), 31, this.f96824Z), 31, this.f96811L0), 31, this.f96812M0), 31, this.f96813N0), this.f96814O0, 31), 31)) * 31;
        gz80 gz80Var2 = this.f96817R0;
        return Boolean.hashCode(this.f96821V0) + s571.m77245d(s571.m77245d(mt60.m62800g(this.f96818S0, (iHashCode2 + (gz80Var2 != null ? gz80Var2.hashCode() : 0)) * 31, 31), 31, this.f96819T0), 31, this.f96820U0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f96825a);
        parcel.writeParcelable(this.f96826b, i);
        gz80 gz80Var = this.f96827c;
        if (gz80Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gz80Var.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f96828d);
        parcel.writeString(this.f96829e);
        parcel.writeInt(this.f96830f ? 1 : 0);
        parcel.writeString(this.f96831g);
        parcel.writeInt(this.f96832h ? 1 : 0);
        parcel.writeString(this.f96833i.name());
        parcel.writeParcelable(this.f96834t, i);
        Iterator itM91403l = xl81.m91403l(parcel, this.f96822X);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        Iterator itM42469m = fr0.m42469m(this.f96823Y, parcel);
        while (itM42469m.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42469m.next(), i);
        }
        Iterator itM42468l = fr0.m42468l(parcel, this.f96824Z);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f96811L0);
        while (itM42468l2.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l2.next(), i);
        }
        Iterator itM91403l2 = xl81.m91403l(parcel, this.f96812M0);
        while (itM91403l2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itM91403l2.next();
            parcel.writeString(((in80) entry2.getKey()).name());
            parcel.writeInt(((Number) entry2.getValue()).intValue());
        }
        parcel.writeInt(this.f96813N0 ? 1 : 0);
        parcel.writeLong(this.f96814O0);
        parcel.writeInt(this.f96815P0);
        parcel.writeString(this.f96816Q0.name());
        gz80 gz80Var2 = this.f96817R0;
        if (gz80Var2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            gz80Var2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f96818S0);
        parcel.writeInt(this.f96819T0 ? 1 : 0);
        parcel.writeInt(this.f96820U0 ? 1 : 0);
        parcel.writeInt(this.f96821V0 ? 1 : 0);
    }
}
