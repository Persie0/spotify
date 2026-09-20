package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jyn0 extends myn0 {
    public static final Parcelable.Creator<jyn0> CREATOR = new ejn0(17);

    /* JADX INFO: renamed from: a */
    public final String f117439a;

    /* JADX INFO: renamed from: b */
    public final int f117440b;

    /* JADX INFO: renamed from: c */
    public final b221 f117441c;

    /* JADX INFO: renamed from: d */
    public final boolean f117442d;

    /* JADX INFO: renamed from: e */
    public final boolean f117443e;

    /* JADX INFO: renamed from: f */
    public final List f117444f;

    /* JADX INFO: renamed from: g */
    public final boolean f117445g;

    public jyn0(String str, int i, b221 b221Var, boolean z, boolean z2, List list, boolean z3) {
        this.f117439a = str;
        this.f117440b = i;
        this.f117441c = b221Var;
        this.f117442d = z;
        this.f117443e = z2;
        this.f117444f = list;
        this.f117445g = z3;
    }

    /* JADX INFO: renamed from: c */
    public static jyn0 m54800c(jyn0 jyn0Var, boolean z, ArrayList arrayList, boolean z2, int i) {
        String str = jyn0Var.f117439a;
        int i2 = jyn0Var.f117440b;
        b221 b221Var = jyn0Var.f117441c;
        if ((i & 8) != 0) {
            z = jyn0Var.f117442d;
        }
        boolean z3 = z;
        boolean z4 = (i & 16) != 0 ? jyn0Var.f117443e : true;
        List list = arrayList;
        if ((i & 32) != 0) {
            list = jyn0Var.f117444f;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z2 = jyn0Var.f117445g;
        }
        jyn0Var.getClass();
        return new jyn0(str, i2, b221Var, z3, z4, list2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyn0)) {
            return false;
        }
        jyn0 jyn0Var = (jyn0) obj;
        return wj50.m88271j(this.f117439a, jyn0Var.f117439a) && this.f117440b == jyn0Var.f117440b && wj50.m88271j(this.f117441c, jyn0Var.f117441c) && this.f117442d == jyn0Var.f117442d && this.f117443e == jyn0Var.f117443e && wj50.m88271j(this.f117444f, jyn0Var.f117444f) && this.f117445g == jyn0Var.f117445g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f117445g) + s571.m77244c(s571.m77245d(s571.m77245d((this.f117441c.hashCode() + mt60.m62800g(this.f117440b, this.f117439a.hashCode() * 31, 31)) * 31, 31, this.f117442d), 31, this.f117443e), 31, this.f117444f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f117439a);
        parcel.writeInt(this.f117440b);
        parcel.writeParcelable(this.f117441c, i);
        parcel.writeInt(this.f117442d ? 1 : 0);
        parcel.writeInt(this.f117443e ? 1 : 0);
        parcel.writeStringList(this.f117444f);
        parcel.writeInt(this.f117445g ? 1 : 0);
    }

    public /* synthetic */ jyn0(String str, int i, b221 b221Var, boolean z, List list, int i2) {
        this(str, i, b221Var, z, false, list, false);
    }
}
