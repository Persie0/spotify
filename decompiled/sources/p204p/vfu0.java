package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vfu0 implements Parcelable {
    public static final Parcelable.Creator<vfu0> CREATOR = new v5u0(14);

    /* JADX INFO: renamed from: a */
    public final List f241036a;

    /* JADX INFO: renamed from: b */
    public final int f241037b;

    /* JADX INFO: renamed from: c */
    public final String f241038c;

    /* JADX INFO: renamed from: d */
    public final String f241039d;

    public vfu0(int i, String str, String str2, List list) {
        this.f241036a = list;
        this.f241037b = i;
        this.f241038c = str;
        this.f241039d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfu0)) {
            return false;
        }
        vfu0 vfu0Var = (vfu0) obj;
        return wj50.m88271j(this.f241036a, vfu0Var.f241036a) && this.f241037b == vfu0Var.f241037b && wj50.m88271j(this.f241038c, vfu0Var.f241038c) && wj50.m88271j(this.f241039d, vfu0Var.f241039d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(mt60.m62800g(this.f241037b, this.f241036a.hashCode() * 31, 31), 31, this.f241038c);
        String str = this.f241039d;
        return iM77243b + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f241036a);
        while (itM42468l.hasNext()) {
            ((ocu0) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f241037b);
        parcel.writeString(this.f241038c);
        parcel.writeString(this.f241039d);
    }
}
