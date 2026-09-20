package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class awv extends dwv {
    public static final Parcelable.Creator<awv> CREATOR = new m8v(29);

    /* JADX INFO: renamed from: X */
    public final int f20705X;

    /* JADX INFO: renamed from: Y */
    public final List f20706Y;

    /* JADX INFO: renamed from: a */
    public final sr01 f20707a;

    /* JADX INFO: renamed from: b */
    public final int f20708b;

    /* JADX INFO: renamed from: c */
    public final ou31 f20709c;

    /* JADX INFO: renamed from: d */
    public final z0r f20710d;

    /* JADX INFO: renamed from: e */
    public final mrp0 f20711e;

    /* JADX INFO: renamed from: f */
    public final icr0 f20712f;

    /* JADX INFO: renamed from: g */
    public final zvv f20713g;

    /* JADX INFO: renamed from: h */
    public final Map f20714h;

    /* JADX INFO: renamed from: i */
    public final tu71 f20715i;

    /* JADX INFO: renamed from: t */
    public final shv f20716t;

    public awv(sr01 sr01Var, int i, ou31 ou31Var, z0r z0rVar, mrp0 mrp0Var, icr0 icr0Var, zvv zvvVar, Map map, tu71 tu71Var, shv shvVar, int i2, List list) {
        this.f20707a = sr01Var;
        this.f20708b = i;
        this.f20709c = ou31Var;
        this.f20710d = z0rVar;
        this.f20711e = mrp0Var;
        this.f20712f = icr0Var;
        this.f20713g = zvvVar;
        this.f20714h = map;
        this.f20715i = tu71Var;
        this.f20716t = shvVar;
        this.f20705X = i2;
        this.f20706Y = list;
    }

    /* JADX INFO: renamed from: h */
    public static awv m27344h(awv awvVar, int i, z0r z0rVar, mrp0 mrp0Var, icr0 icr0Var, zvv zvvVar, int i2, int i3) {
        sr01 sr01Var = awvVar.f20707a;
        if ((i3 & 2) != 0) {
            i = awvVar.f20708b;
        }
        int i4 = i;
        ou31 ou31Var = awvVar.f20709c;
        z0r z0rVar2 = (i3 & 8) != 0 ? awvVar.f20710d : z0rVar;
        mrp0 mrp0Var2 = (i3 & 16) != 0 ? awvVar.f20711e : mrp0Var;
        icr0 icr0Var2 = (i3 & 32) != 0 ? awvVar.f20712f : icr0Var;
        zvv zvvVar2 = (i3 & 64) != 0 ? awvVar.f20713g : zvvVar;
        Map map = awvVar.f20714h;
        tu71 tu71Var = awvVar.f20715i;
        shv shvVar = awvVar.f20716t;
        int i5 = (i3 & 1024) != 0 ? awvVar.f20705X : i2;
        List list = awvVar.f20706Y;
        awvVar.getClass();
        return new awv(sr01Var, i4, ou31Var, z0rVar2, mrp0Var2, icr0Var2, zvvVar2, map, tu71Var, shvVar, i5, list);
    }

    @Override // p204p.dwv
    /* JADX INFO: renamed from: c */
    public final sr01 mo27345c() {
        return this.f20707a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awv)) {
            return false;
        }
        awv awvVar = (awv) obj;
        return wj50.m88271j(this.f20707a, awvVar.f20707a) && this.f20708b == awvVar.f20708b && wj50.m88271j(this.f20709c, awvVar.f20709c) && wj50.m88271j(this.f20710d, awvVar.f20710d) && wj50.m88271j(this.f20711e, awvVar.f20711e) && wj50.m88271j(this.f20712f, awvVar.f20712f) && this.f20713g == awvVar.f20713g && wj50.m88271j(this.f20714h, awvVar.f20714h) && wj50.m88271j(this.f20715i, awvVar.f20715i) && wj50.m88271j(this.f20716t, awvVar.f20716t) && this.f20705X == awvVar.f20705X && wj50.m88271j(this.f20706Y, awvVar.f20706Y);
    }

    @Override // p204p.dwv
    /* JADX INFO: renamed from: g */
    public final z0r mo27346g() {
        return this.f20710d;
    }

    public final int hashCode() {
        int iHashCode = (this.f20709c.hashCode() + f710.m40938f(this.f20708b, this.f20707a.hashCode() * 31, 31)) * 31;
        z0r z0rVar = this.f20710d;
        int iHashCode2 = (iHashCode + (z0rVar == null ? 0 : z0rVar.hashCode())) * 31;
        mrp0 mrp0Var = this.f20711e;
        int iM38557f = edb.m38557f((this.f20713g.hashCode() + ((this.f20712f.hashCode() + ((iHashCode2 + (mrp0Var == null ? 0 : mrp0Var.hashCode())) * 31)) * 31)) * 31, 31, this.f20714h);
        tu71 tu71Var = this.f20715i;
        int iHashCode3 = (iM38557f + (tu71Var == null ? 0 : Long.hashCode(tu71Var.f223785a))) * 31;
        shv shvVar = this.f20716t;
        return this.f20706Y.hashCode() + mt60.m62800g(this.f20705X, (iHashCode3 + (shvVar != null ? shvVar.hashCode() : 0)) * 31, 31);
    }

    /* JADX INFO: renamed from: j */
    public final gcr0 m27347j() {
        return (gcr0) this.f20714h.get(this.f20713g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f20707a, i);
        parcel.writeString(stz0.m79362p(this.f20708b));
        parcel.writeParcelable(this.f20709c, i);
        parcel.writeParcelable(this.f20711e, i);
        parcel.writeParcelable(this.f20712f, i);
        parcel.writeString(this.f20713g.name());
        Iterator itM91403l = xl81.m91403l(parcel, this.f20714h);
        while (itM91403l.hasNext()) {
            Map.Entry entry = (Map.Entry) itM91403l.next();
            parcel.writeString(((zvv) entry.getKey()).name());
            parcel.writeParcelable((Parcelable) entry.getValue(), i);
        }
        parcel.writeParcelable(this.f20715i, i);
        parcel.writeParcelable(this.f20716t, i);
        parcel.writeInt(this.f20705X);
        Iterator itM42468l = fr0.m42468l(parcel, this.f20706Y);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
    }
}
