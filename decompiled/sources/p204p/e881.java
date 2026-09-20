package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class e881 implements Parcelable {
    public static final Parcelable.Creator<e881> CREATOR = new sr71(29);

    /* JADX INFO: renamed from: X */
    public final int f57103X;

    /* JADX INFO: renamed from: Y */
    public final List f57104Y;

    /* JADX INFO: renamed from: a */
    public final String f57105a;

    /* JADX INFO: renamed from: b */
    public final String f57106b;

    /* JADX INFO: renamed from: c */
    public final fuz0 f57107c;

    /* JADX INFO: renamed from: d */
    public final duf f57108d;

    /* JADX INFO: renamed from: e */
    public final String f57109e;

    /* JADX INFO: renamed from: f */
    public final int f57110f;

    /* JADX INFO: renamed from: g */
    public final String f57111g;

    /* JADX INFO: renamed from: h */
    public final String f57112h;

    /* JADX INFO: renamed from: i */
    public final fuz0 f57113i;

    /* JADX INFO: renamed from: t */
    public final String f57114t;

    public e881(String str, String str2, fuz0 fuz0Var, duf dufVar, String str3, int i, String str4, String str5, fuz0 fuz0Var2, String str6, int i2, List list) {
        this.f57105a = str;
        this.f57106b = str2;
        this.f57107c = fuz0Var;
        this.f57108d = dufVar;
        this.f57109e = str3;
        this.f57110f = i;
        this.f57111g = str4;
        this.f57112h = str5;
        this.f57113i = fuz0Var2;
        this.f57114t = str6;
        this.f57103X = i2;
        this.f57104Y = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e881)) {
            return false;
        }
        e881 e881Var = (e881) obj;
        return wj50.m88271j(this.f57105a, e881Var.f57105a) && wj50.m88271j(this.f57106b, e881Var.f57106b) && wj50.m88271j(this.f57107c, e881Var.f57107c) && wj50.m88271j(this.f57108d, e881Var.f57108d) && wj50.m88271j(this.f57109e, e881Var.f57109e) && this.f57110f == e881Var.f57110f && wj50.m88271j(this.f57111g, e881Var.f57111g) && wj50.m88271j(this.f57112h, e881Var.f57112h) && wj50.m88271j(this.f57113i, e881Var.f57113i) && wj50.m88271j(this.f57114t, e881Var.f57114t) && this.f57103X == e881Var.f57103X && wj50.m88271j(this.f57104Y, e881Var.f57104Y);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f57105a.hashCode() * 31, 31, this.f57106b);
        fuz0 fuz0Var = this.f57107c;
        int iM77243b2 = s571.m77243b(s571.m77243b(mt60.m62800g(this.f57110f, s571.m77243b((this.f57108d.hashCode() + ((iM77243b + (fuz0Var == null ? 0 : Arrays.hashCode(fuz0Var.f73606a))) * 31)) * 31, 31, this.f57109e), 31), 31, this.f57111g), 31, this.f57112h);
        fuz0 fuz0Var2 = this.f57113i;
        int iM77243b3 = s571.m77243b((iM77243b2 + (fuz0Var2 == null ? 0 : Arrays.hashCode(fuz0Var2.f73606a))) * 31, 31, this.f57114t);
        int i = this.f57103X;
        return this.f57104Y.hashCode() + ((iM77243b3 + (i != 0 ? edb.m38547C(i) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57105a);
        parcel.writeString(this.f57106b);
        parcel.writeParcelable(this.f57107c, i);
        parcel.writeParcelable(this.f57108d, i);
        parcel.writeString(this.f57109e);
        parcel.writeInt(this.f57110f);
        parcel.writeString(this.f57111g);
        parcel.writeString(this.f57112h);
        parcel.writeParcelable(this.f57113i, i);
        parcel.writeString(this.f57114t);
        int i2 = this.f57103X;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(a831.m25023o(i2));
        }
        Iterator itM42468l = fr0.m42468l(parcel, this.f57104Y);
        while (itM42468l.hasNext()) {
            ((a881) itM42468l.next()).writeToParcel(parcel, i);
        }
    }
}
