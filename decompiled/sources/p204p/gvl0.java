package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class gvl0 implements Parcelable {
    public static final Parcelable.Creator<gvl0> CREATOR = new cpl0(3);

    /* JADX INFO: renamed from: a */
    public final oe70 f84780a;

    /* JADX INFO: renamed from: b */
    public final xi3 f84781b;

    /* JADX INFO: renamed from: c */
    public final wr31 f84782c;

    /* JADX INFO: renamed from: d */
    public final List f84783d;

    /* JADX INFO: renamed from: e */
    public final ibj f84784e;

    /* JADX INFO: renamed from: f */
    public final boolean f84785f;

    public gvl0(oe70 oe70Var, xi3 xi3Var, wr31 wr31Var, List list, ibj ibjVar, boolean z) {
        this.f84780a = oe70Var;
        this.f84781b = xi3Var;
        this.f84782c = wr31Var;
        this.f84783d = list;
        this.f84784e = ibjVar;
        this.f84785f = z;
    }

    /* JADX INFO: renamed from: c */
    public static gvl0 m45897c(gvl0 gvl0Var, xi3 xi3Var, wr31 wr31Var, ibj ibjVar, int i) {
        oe70 oe70Var = gvl0Var.f84780a;
        if ((i & 2) != 0) {
            xi3Var = gvl0Var.f84781b;
        }
        xi3 xi3Var2 = xi3Var;
        if ((i & 4) != 0) {
            wr31Var = gvl0Var.f84782c;
        }
        wr31 wr31Var2 = wr31Var;
        List list = gvl0Var.f84783d;
        if ((i & 16) != 0) {
            ibjVar = gvl0Var.f84784e;
        }
        boolean z = gvl0Var.f84785f;
        gvl0Var.getClass();
        return new gvl0(oe70Var, xi3Var2, wr31Var2, list, ibjVar, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvl0)) {
            return false;
        }
        gvl0 gvl0Var = (gvl0) obj;
        return wj50.m88271j(this.f84780a, gvl0Var.f84780a) && this.f84781b == gvl0Var.f84781b && this.f84782c == gvl0Var.f84782c && wj50.m88271j(this.f84783d, gvl0Var.f84783d) && wj50.m88271j(this.f84784e, gvl0Var.f84784e) && this.f84785f == gvl0Var.f84785f;
    }

    /* JADX INFO: renamed from: g */
    public final hbj m45898g() {
        ibj ibjVar = this.f84784e;
        if (ibjVar instanceof hbj) {
            return (hbj) ibjVar;
        }
        return null;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84785f) + ((this.f84784e.hashCode() + s571.m77244c((this.f84782c.hashCode() + ((this.f84781b.hashCode() + (this.f84780a.hashCode() * 31)) * 31)) * 31, 31, this.f84783d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f84780a.writeToParcel(parcel, i);
        parcel.writeString(this.f84781b.name());
        parcel.writeString(this.f84782c.name());
        Iterator itM42468l = fr0.m42468l(parcel, this.f84783d);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeParcelable(this.f84784e, i);
        parcel.writeInt(this.f84785f ? 1 : 0);
    }
}
