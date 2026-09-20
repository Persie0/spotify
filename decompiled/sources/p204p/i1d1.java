package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class i1d1 implements Parcelable {
    public static final Parcelable.Creator<i1d1> CREATOR = new vmc1(18);

    /* JADX INFO: renamed from: X */
    public final String f97482X;

    /* JADX INFO: renamed from: Y */
    public final String f97483Y;

    /* JADX INFO: renamed from: a */
    public final String f97484a;

    /* JADX INFO: renamed from: b */
    public final String f97485b;

    /* JADX INFO: renamed from: c */
    public final String f97486c;

    /* JADX INFO: renamed from: d */
    public final int f97487d;

    /* JADX INFO: renamed from: e */
    public final gm20 f97488e;

    /* JADX INFO: renamed from: f */
    public final List f97489f;

    /* JADX INFO: renamed from: g */
    public final cba f97490g;

    /* JADX INFO: renamed from: h */
    public final ifw f97491h;

    /* JADX INFO: renamed from: i */
    public final boolean f97492i;

    /* JADX INFO: renamed from: t */
    public final int f97493t;

    public i1d1(String str, String str2, String str3, int i, gm20 gm20Var, List list, cba cbaVar, ifw ifwVar, boolean z, int i2, String str4, String str5) {
        this.f97484a = str;
        this.f97485b = str2;
        this.f97486c = str3;
        this.f97487d = i;
        this.f97488e = gm20Var;
        this.f97489f = list;
        this.f97490g = cbaVar;
        this.f97491h = ifwVar;
        this.f97492i = z;
        this.f97493t = i2;
        this.f97482X = str4;
        this.f97483Y = str5;
    }

    /* JADX INFO: renamed from: g */
    public static i1d1 m49407g(i1d1 i1d1Var, ArrayList arrayList, ifw ifwVar, boolean z, int i) {
        String str = i1d1Var.f97484a;
        String str2 = i1d1Var.f97485b;
        String str3 = i1d1Var.f97486c;
        int i2 = i1d1Var.f97487d;
        gm20 gm20Var = i1d1Var.f97488e;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = i1d1Var.f97489f;
        }
        List list2 = list;
        cba cbaVar = i1d1Var.f97490g;
        ifw ifwVar2 = (i & 128) != 0 ? i1d1Var.f97491h : ifwVar;
        boolean z2 = (i & 256) != 0 ? i1d1Var.f97492i : z;
        int i3 = i1d1Var.f97493t;
        String str4 = i1d1Var.f97482X;
        String str5 = i1d1Var.f97483Y;
        i1d1Var.getClass();
        return new i1d1(str, str2, str3, i2, gm20Var, list2, cbaVar, ifwVar2, z2, i3, str4, str5);
    }

    /* JADX INFO: renamed from: c */
    public final i1d1 m49408c(int i, String str) {
        List<jnj0> list = this.f97489f;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (jnj0 jnj0VarM53823c : list) {
            if (wj50.m88271j(jnj0VarM53823c.f114121a, str)) {
                jnj0VarM53823c = jnj0.m53823c(jnj0VarM53823c, jnj0VarM53823c.f114125e + i);
            }
            arrayList.add(jnj0VarM53823c);
        }
        return m49407g(this, arrayList, null, false, 4063);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1d1)) {
            return false;
        }
        i1d1 i1d1Var = (i1d1) obj;
        return wj50.m88271j(this.f97484a, i1d1Var.f97484a) && wj50.m88271j(this.f97485b, i1d1Var.f97485b) && wj50.m88271j(this.f97486c, i1d1Var.f97486c) && this.f97487d == i1d1Var.f97487d && wj50.m88271j(this.f97488e, i1d1Var.f97488e) && wj50.m88271j(this.f97489f, i1d1Var.f97489f) && wj50.m88271j(this.f97490g, i1d1Var.f97490g) && wj50.m88271j(this.f97491h, i1d1Var.f97491h) && this.f97492i == i1d1Var.f97492i && this.f97493t == i1d1Var.f97493t && wj50.m88271j(this.f97482X, i1d1Var.f97482X) && wj50.m88271j(this.f97483Y, i1d1Var.f97483Y);
    }

    /* JADX INFO: renamed from: h */
    public final int m49409h() {
        Iterator it = this.f97489f.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((jnj0) it.next()).f114125e;
        }
        return i;
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f97493t, s571.m77245d((this.f97491h.hashCode() + ((this.f97490g.hashCode() + s571.m77244c((this.f97488e.hashCode() + mt60.m62800g(this.f97487d, s571.m77243b(s571.m77243b(this.f97484a.hashCode() * 31, 31, this.f97485b), 31, this.f97486c), 31)) * 31, 31, this.f97489f)) * 31)) * 31, 31, this.f97492i), 31);
        String str = this.f97482X;
        int iHashCode = (iM40938f + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97483Y;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f97484a);
        parcel.writeString(this.f97485b);
        parcel.writeString(this.f97486c);
        parcel.writeInt(this.f97487d);
        this.f97488e.writeToParcel(parcel, i);
        Iterator itM42468l = fr0.m42468l(parcel, this.f97489f);
        while (itM42468l.hasNext()) {
            ((jnj0) itM42468l.next()).writeToParcel(parcel, i);
        }
        this.f97490g.writeToParcel(parcel, i);
        this.f97491h.writeToParcel(parcel, i);
        parcel.writeInt(this.f97492i ? 1 : 0);
        int i2 = this.f97493t;
        if (i2 == 1) {
            str = "V1";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "V2";
        }
        parcel.writeString(str);
        parcel.writeString(this.f97482X);
        parcel.writeString(this.f97483Y);
    }
}
