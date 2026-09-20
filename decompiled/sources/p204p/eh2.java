package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class eh2 implements Parcelable {
    public static final Parcelable.Creator<eh2> CREATOR = new lb2(12);

    /* JADX INFO: renamed from: a */
    public final int f59459a;

    /* JADX INFO: renamed from: b */
    public final int f59460b;

    /* JADX INFO: renamed from: c */
    public final List f59461c;

    /* JADX INFO: renamed from: d */
    public final boolean f59462d;

    /* JADX INFO: renamed from: e */
    public final boolean f59463e;

    /* JADX INFO: renamed from: f */
    public final int f59464f;

    /* JADX INFO: renamed from: g */
    public final bdb1 f59465g;

    public eh2(int i, int i2, List list, boolean z, boolean z2, int i3, bdb1 bdb1Var) {
        this.f59459a = i;
        this.f59460b = i2;
        this.f59461c = list;
        this.f59462d = z;
        this.f59463e = z2;
        this.f59464f = i3;
        this.f59465g = bdb1Var;
    }

    /* JADX INFO: renamed from: c */
    public static eh2 m38891c(eh2 eh2Var, boolean z, boolean z2, bdb1 bdb1Var, int i) {
        int i2 = eh2Var.f59459a;
        int i3 = eh2Var.f59460b;
        List list = eh2Var.f59461c;
        if ((i & 8) != 0) {
            z = eh2Var.f59462d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = eh2Var.f59463e;
        }
        boolean z4 = z2;
        int i4 = eh2Var.f59464f;
        if ((i & 64) != 0) {
            bdb1Var = eh2Var.f59465g;
        }
        eh2Var.getClass();
        return new eh2(i2, i3, list, z3, z4, i4, bdb1Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh2)) {
            return false;
        }
        eh2 eh2Var = (eh2) obj;
        return this.f59459a == eh2Var.f59459a && this.f59460b == eh2Var.f59460b && wj50.m88271j(this.f59461c, eh2Var.f59461c) && this.f59462d == eh2Var.f59462d && this.f59463e == eh2Var.f59463e && this.f59464f == eh2Var.f59464f && this.f59465g == eh2Var.f59465g;
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f59464f, s571.m77245d(s571.m77245d(s571.m77244c(mt60.m62800g(this.f59460b, Integer.hashCode(this.f59459a) * 31, 31), 31, this.f59461c), 31, this.f59462d), 31, this.f59463e), 31);
        bdb1 bdb1Var = this.f59465g;
        return iM62800g + (bdb1Var == null ? 0 : bdb1Var.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f59459a);
        parcel.writeInt(this.f59460b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f59461c);
        while (itM42468l.hasNext()) {
            parcel.writeParcelable((Parcelable) itM42468l.next(), i);
        }
        parcel.writeInt(this.f59462d ? 1 : 0);
        parcel.writeInt(this.f59463e ? 1 : 0);
        parcel.writeInt(this.f59464f);
        bdb1 bdb1Var = this.f59465g;
        if (bdb1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bdb1Var.name());
        }
    }
}
