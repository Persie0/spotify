package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o581 implements Parcelable {
    public static final Parcelable.Creator<o581> CREATOR = new sr71(25);

    /* JADX INFO: renamed from: a */
    public final String f161912a;

    /* JADX INFO: renamed from: b */
    public final String f161913b;

    /* JADX INFO: renamed from: c */
    public final duf f161914c;

    /* JADX INFO: renamed from: d */
    public final String f161915d;

    /* JADX INFO: renamed from: e */
    public final int f161916e;

    /* JADX INFO: renamed from: f */
    public final String f161917f;

    /* JADX INFO: renamed from: g */
    public final String f161918g;

    /* JADX INFO: renamed from: h */
    public final fuz0 f161919h;

    /* JADX INFO: renamed from: i */
    public final int f161920i;

    /* JADX INFO: renamed from: t */
    public final List f161921t;

    public o581(String str, String str2, duf dufVar, String str3, int i, String str4, String str5, fuz0 fuz0Var, int i2, List list) {
        this.f161912a = str;
        this.f161913b = str2;
        this.f161914c = dufVar;
        this.f161915d = str3;
        this.f161916e = i;
        this.f161917f = str4;
        this.f161918g = str5;
        this.f161919h = fuz0Var;
        this.f161920i = i2;
        this.f161921t = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o581)) {
            return false;
        }
        o581 o581Var = (o581) obj;
        return wj50.m88271j(this.f161912a, o581Var.f161912a) && wj50.m88271j(this.f161913b, o581Var.f161913b) && wj50.m88271j(this.f161914c, o581Var.f161914c) && wj50.m88271j(this.f161915d, o581Var.f161915d) && this.f161916e == o581Var.f161916e && wj50.m88271j(this.f161917f, o581Var.f161917f) && wj50.m88271j(this.f161918g, o581Var.f161918g) && wj50.m88271j(this.f161919h, o581Var.f161919h) && this.f161920i == o581Var.f161920i && wj50.m88271j(this.f161921t, o581Var.f161921t);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(s571.m77243b(mt60.m62800g(this.f161916e, s571.m77243b((this.f161914c.hashCode() + s571.m77243b(this.f161912a.hashCode() * 31, 31, this.f161913b)) * 31, 31, this.f161915d), 31), 31, this.f161917f), 31, this.f161918g);
        fuz0 fuz0Var = this.f161919h;
        int iHashCode = (iM77243b + (fuz0Var == null ? 0 : Arrays.hashCode(fuz0Var.f73606a))) * 31;
        int i = this.f161920i;
        return this.f161921t.hashCode() + ((iHashCode + (i != 0 ? edb.m38547C(i) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f161912a);
        parcel.writeString(this.f161913b);
        parcel.writeParcelable(this.f161914c, i);
        parcel.writeString(this.f161915d);
        parcel.writeInt(this.f161916e);
        parcel.writeString(this.f161917f);
        parcel.writeString(this.f161918g);
        parcel.writeParcelable(this.f161919h, i);
        int i2 = this.f161920i;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(a831.m25023o(i2));
        }
        Iterator itM42468l = fr0.m42468l(parcel, this.f161921t);
        while (itM42468l.hasNext()) {
            ((k581) itM42468l.next()).writeToParcel(parcel, i);
        }
    }
}
