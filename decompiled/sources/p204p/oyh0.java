package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oyh0 extends b221 implements pkw0, gkx, ks61 {
    public static final Parcelable.Creator<oyh0> CREATOR = new ruh0(15);

    /* JADX INFO: renamed from: a */
    public final String f171767a;

    /* JADX INFO: renamed from: b */
    public final String f171768b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f171769c;

    /* JADX INFO: renamed from: d */
    public final List f171770d;

    /* JADX INFO: renamed from: e */
    public final int f171771e;

    /* JADX INFO: renamed from: f */
    public final String f171772f;

    /* JADX INFO: renamed from: g */
    public final String f171773g;

    /* JADX INFO: renamed from: h */
    public final int f171774h;

    public oyh0(String str, String str2, ArrayList arrayList, List list, int i, String str3, String str4, int i2) {
        this.f171767a = str;
        this.f171768b = str2;
        this.f171769c = arrayList;
        this.f171770d = list;
        this.f171771e = i;
        this.f171772f = str3;
        this.f171773g = str4;
        this.f171774h = i2;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: C0 */
    public final String mo28933C0() {
        return this.f171772f;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: D */
    public final int mo28934D() {
        return this.f171771e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyh0)) {
            return false;
        }
        oyh0 oyh0Var = (oyh0) obj;
        return wj50.m88271j(this.f171767a, oyh0Var.f171767a) && wj50.m88271j(this.f171768b, oyh0Var.f171768b) && this.f171769c.equals(oyh0Var.f171769c) && wj50.m88271j(this.f171770d, oyh0Var.f171770d) && this.f171771e == oyh0Var.f171771e && wj50.m88271j(this.f171772f, oyh0Var.f171772f) && wj50.m88271j(this.f171773g, oyh0Var.f171773g) && this.f171774h == oyh0Var.f171774h;
    }

    @Override // p204p.gkx
    /* JADX INFO: renamed from: g0 */
    public final List mo28936g0() {
        return this.f171769c;
    }

    @Override // p204p.b221
    public final String getUri() {
        return this.f171767a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f171774h) + s571.m77243b(s571.m77243b(mt60.m62800g(this.f171771e, s571.m77244c(lq51.m59700f(this.f171769c, s571.m77243b(this.f171767a.hashCode() * 31, 31, this.f171768b), 31), 31, this.f171770d), 31), 31, this.f171772f), 31, this.f171773g);
    }

    @Override // p204p.ks61
    /* JADX INFO: renamed from: p */
    public final List mo28937p() {
        return this.f171770d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f171767a);
        parcel.writeString(this.f171768b);
        Iterator itM42469m = fr0.m42469m(this.f171769c, parcel);
        while (itM42469m.hasNext()) {
            ((bej) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.f171770d);
        parcel.writeInt(this.f171771e);
        parcel.writeString(this.f171772f);
        parcel.writeString(this.f171773g);
        parcel.writeString(o7t0.m66399m(this.f171774h));
    }

    @Override // p204p.pkw0
    /* JADX INFO: renamed from: y1 */
    public final int mo28938y1() {
        return this.f171774h;
    }
}
