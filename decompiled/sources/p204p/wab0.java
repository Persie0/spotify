package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class wab0 implements Parcelable {
    public static final Parcelable.Creator<wab0> CREATOR = new l0b0(15);

    /* JADX INFO: renamed from: a */
    public final List f249431a;

    /* JADX INFO: renamed from: b */
    public final int f249432b;

    /* JADX INFO: renamed from: c */
    public final List f249433c;

    /* JADX INFO: renamed from: d */
    public final String f249434d;

    /* JADX INFO: renamed from: e */
    public final boolean f249435e;

    /* JADX INFO: renamed from: f */
    public final sab0 f249436f;

    /* JADX INFO: renamed from: g */
    public final vab0 f249437g;

    /* JADX INFO: renamed from: h */
    public final int f249438h;

    /* JADX INFO: renamed from: i */
    public final List f249439i;

    public wab0(List list, int i, List list2, String str, boolean z, sab0 sab0Var, vab0 vab0Var, int i2, List list3) {
        this.f249431a = list;
        this.f249432b = i;
        this.f249433c = list2;
        this.f249434d = str;
        this.f249435e = z;
        this.f249436f = sab0Var;
        this.f249437g = vab0Var;
        this.f249438h = i2;
        this.f249439i = list3;
    }

    /* JADX INFO: renamed from: c */
    public final sab0 m87589c() {
        return this.f249436f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wab0)) {
            return false;
        }
        wab0 wab0Var = (wab0) obj;
        return wj50.m88271j(this.f249431a, wab0Var.f249431a) && this.f249432b == wab0Var.f249432b && wj50.m88271j(this.f249433c, wab0Var.f249433c) && wj50.m88271j(this.f249434d, wab0Var.f249434d) && this.f249435e == wab0Var.f249435e && wj50.m88271j(this.f249436f, wab0Var.f249436f) && wj50.m88271j(this.f249437g, wab0Var.f249437g) && this.f249438h == wab0Var.f249438h && wj50.m88271j(this.f249439i, wab0Var.f249439i);
    }

    /* JADX INFO: renamed from: g */
    public final int m87590g() {
        return this.f249432b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m87591h() {
        return this.f249435e;
    }

    public final int hashCode() {
        return this.f249439i.hashCode() + f710.m40938f(this.f249438h, s571.m77245d((this.f249436f.hashCode() + s571.m77245d(s571.m77243b(s571.m77244c(f710.m40938f(this.f249432b, this.f249431a.hashCode() * 31, 31), 31, this.f249433c), 31, this.f249434d), 31, this.f249435e)) * 31, 31, this.f249437g.f239175a), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        Iterator itM42468l = fr0.m42468l(parcel, this.f249431a);
        while (itM42468l.hasNext()) {
            ((rab0) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(y8a0.m93110o(this.f249432b));
        Iterator itM42468l2 = fr0.m42468l(parcel, this.f249433c);
        while (itM42468l2.hasNext()) {
            ((uab0) itM42468l2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f249434d);
        parcel.writeInt(this.f249435e ? 1 : 0);
        this.f249436f.writeToParcel(parcel, i);
        this.f249437g.writeToParcel(parcel, i);
        int i2 = this.f249438h;
        if (i2 == 1) {
            str = "NONE";
        } else if (i2 == 2) {
            str = "UNCAPPED";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "CAPPED";
        }
        parcel.writeString(str);
        parcel.writeStringList(this.f249439i);
    }
}
