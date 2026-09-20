package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g3d1 implements Parcelable {
    public static final Parcelable.Creator<g3d1> CREATOR = new vmc1(21);

    /* JADX INFO: renamed from: a */
    public final String f76181a;

    /* JADX INFO: renamed from: b */
    public final String f76182b;

    /* JADX INFO: renamed from: c */
    public final List f76183c;

    /* JADX INFO: renamed from: d */
    public final int f76184d;

    /* JADX INFO: renamed from: e */
    public final String f76185e;

    /* JADX INFO: renamed from: f */
    public final String f76186f;

    public g3d1(int i, String str, String str2, String str3, String str4, List list) {
        this.f76181a = str;
        this.f76182b = str2;
        this.f76183c = list;
        this.f76184d = i;
        this.f76185e = str3;
        this.f76186f = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m43481c() {
        return this.f76182b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3d1)) {
            return false;
        }
        g3d1 g3d1Var = (g3d1) obj;
        return wj50.m88271j(this.f76181a, g3d1Var.f76181a) && wj50.m88271j(this.f76182b, g3d1Var.f76182b) && wj50.m88271j(this.f76183c, g3d1Var.f76183c) && this.f76184d == g3d1Var.f76184d && wj50.m88271j(this.f76185e, g3d1Var.f76185e) && wj50.m88271j(this.f76186f, g3d1Var.f76186f);
    }

    /* JADX INFO: renamed from: g */
    public final String m43482g() {
        return this.f76186f;
    }

    /* JADX INFO: renamed from: h */
    public final String m43483h() {
        return this.f76185e;
    }

    public final int hashCode() {
        return this.f76186f.hashCode() + s571.m77243b(mt60.m62800g(this.f76184d, s571.m77244c(s571.m77243b(this.f76181a.hashCode() * 31, 31, this.f76182b), 31, this.f76183c), 31), 31, this.f76185e);
    }

    /* JADX INFO: renamed from: j */
    public final List m43484j() {
        return this.f76183c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f76181a);
        parcel.writeString(this.f76182b);
        Iterator itM42468l = fr0.m42468l(parcel, this.f76183c);
        while (itM42468l.hasNext()) {
            parcel.writeValue(itM42468l.next());
        }
        parcel.writeInt(this.f76184d);
        parcel.writeString(this.f76185e);
        parcel.writeString(this.f76186f);
    }
}
