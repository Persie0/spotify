package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class m3l0 implements Parcelable {
    public static final Parcelable.Creator<m3l0> CREATOR = new oxk0(20);

    /* JADX INFO: renamed from: a */
    public final String f139677a;

    /* JADX INFO: renamed from: b */
    public final String f139678b;

    /* JADX INFO: renamed from: c */
    public final String f139679c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f139680d;

    /* JADX INFO: renamed from: e */
    public final o3l0 f139681e;

    /* JADX INFO: renamed from: f */
    public final boolean f139682f;

    /* JADX INFO: renamed from: g */
    public final boolean f139683g;

    public m3l0(String str, String str2, String str3, ArrayList arrayList, o3l0 o3l0Var, boolean z, boolean z2) {
        this.f139677a = str;
        this.f139678b = str2;
        this.f139679c = str3;
        this.f139680d = arrayList;
        this.f139681e = o3l0Var;
        this.f139682f = z;
        this.f139683g = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3l0)) {
            return false;
        }
        m3l0 m3l0Var = (m3l0) obj;
        return wj50.m88271j(this.f139677a, m3l0Var.f139677a) && wj50.m88271j(this.f139678b, m3l0Var.f139678b) && wj50.m88271j(this.f139679c, m3l0Var.f139679c) && this.f139680d.equals(m3l0Var.f139680d) && wj50.m88271j(this.f139681e, m3l0Var.f139681e) && this.f139682f == m3l0Var.f139682f && this.f139683g == m3l0Var.f139683g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f139677a.hashCode() * 31, 31, this.f139678b);
        String str = this.f139679c;
        int iM59700f = lq51.m59700f(this.f139680d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        o3l0 o3l0Var = this.f139681e;
        return Boolean.hashCode(this.f139683g) + s571.m77245d((iM59700f + (o3l0Var != null ? o3l0Var.hashCode() : 0)) * 31, 31, this.f139682f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f139677a);
        parcel.writeString(this.f139678b);
        parcel.writeString(this.f139679c);
        Iterator itM42469m = fr0.m42469m(this.f139680d, parcel);
        while (itM42469m.hasNext()) {
            ((q3l0) itM42469m.next()).writeToParcel(parcel, i);
        }
        o3l0 o3l0Var = this.f139681e;
        if (o3l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            o3l0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f139682f ? 1 : 0);
        parcel.writeInt(this.f139683g ? 1 : 0);
    }
}
