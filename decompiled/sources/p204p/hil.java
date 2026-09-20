package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@rtz0
public final class hil implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final int f91832a;

    /* JADX INFO: renamed from: b */
    public final int f91833b;

    /* JADX INFO: renamed from: c */
    public final List f91834c;

    /* JADX INFO: renamed from: d */
    public final String f91835d;

    /* JADX INFO: renamed from: e */
    public final String f91836e;

    /* JADX INFO: renamed from: f */
    public final String f91837f;

    /* JADX INFO: renamed from: g */
    public final w28 f91838g;

    /* JADX INFO: renamed from: h */
    public final boolean f91839h;

    /* JADX INFO: renamed from: i */
    public final vw5 f91840i;
    public static final gil Companion = new gil();
    public static final Parcelable.Creator<hil> CREATOR = new z4l(21);

    /* JADX INFO: renamed from: t */
    public static final fr70[] f91831t = {null, null, q3d0.m72078I(2, bpj.f29497X0), null, null, null, null, null, null};

    public /* synthetic */ hil(int i, int i2, int i3, List list, String str, String str2, String str3, w28 w28Var, boolean z, vw5 vw5Var) {
        if ((i & 1) == 0) {
            this.f91832a = 0;
        } else {
            this.f91832a = i2;
        }
        if ((i & 2) == 0) {
            this.f91833b = 0;
        } else {
            this.f91833b = i3;
        }
        if ((i & 4) == 0) {
            this.f91834c = lau.f131415a;
        } else {
            this.f91834c = list;
        }
        if ((i & 8) == 0) {
            this.f91835d = null;
        } else {
            this.f91835d = str;
        }
        if ((i & 16) == 0) {
            this.f91836e = null;
        } else {
            this.f91836e = str2;
        }
        if ((i & 32) == 0) {
            this.f91837f = null;
        } else {
            this.f91837f = str3;
        }
        if ((i & 64) == 0) {
            this.f91838g = null;
        } else {
            this.f91838g = w28Var;
        }
        if ((i & 128) == 0) {
            this.f91839h = false;
        } else {
            this.f91839h = z;
        }
        if ((i & 256) == 0) {
            this.f91840i = null;
        } else {
            this.f91840i = vw5Var;
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
        if (!(obj instanceof hil)) {
            return false;
        }
        hil hilVar = (hil) obj;
        return this.f91832a == hilVar.f91832a && this.f91833b == hilVar.f91833b && wj50.m88271j(this.f91834c, hilVar.f91834c) && wj50.m88271j(this.f91835d, hilVar.f91835d) && wj50.m88271j(this.f91836e, hilVar.f91836e) && wj50.m88271j(this.f91837f, hilVar.f91837f) && wj50.m88271j(this.f91838g, hilVar.f91838g) && this.f91839h == hilVar.f91839h && wj50.m88271j(this.f91840i, hilVar.f91840i);
    }

    public final int hashCode() {
        int iM77244c = s571.m77244c(mt60.m62800g(this.f91833b, Integer.hashCode(this.f91832a) * 31, 31), 31, this.f91834c);
        String str = this.f91835d;
        int iHashCode = (iM77244c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f91836e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f91837f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        w28 w28Var = this.f91838g;
        int iM77245d = s571.m77245d((iHashCode3 + (w28Var == null ? 0 : w28Var.hashCode())) * 31, 31, this.f91839h);
        vw5 vw5Var = this.f91840i;
        return iM77245d + (vw5Var != null ? vw5Var.f245394a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f91832a);
        parcel.writeInt(this.f91833b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f91834c);
        while (itM42468l.hasNext()) {
            ((v940) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f91835d);
        parcel.writeString(this.f91836e);
        parcel.writeString(this.f91837f);
        w28 w28Var = this.f91838g;
        if (w28Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            w28Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f91839h ? 1 : 0);
        vw5 vw5Var = this.f91840i;
        if (vw5Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            vw5Var.writeToParcel(parcel, i);
        }
    }

    public hil(int i, int i2, ArrayList arrayList, String str, String str2, String str3, w28 w28Var, boolean z, vw5 vw5Var) {
        this.f91832a = i;
        this.f91833b = i2;
        this.f91834c = arrayList;
        this.f91835d = str;
        this.f91836e = str2;
        this.f91837f = str3;
        this.f91838g = w28Var;
        this.f91839h = z;
        this.f91840i = vw5Var;
    }
}
