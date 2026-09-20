package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xkx0 implements Parcelable {
    public static final Parcelable.Creator<xkx0> CREATOR = new luh0(14);

    /* JADX INFO: renamed from: a */
    public final String f262953a;

    /* JADX INFO: renamed from: b */
    public final String f262954b;

    /* JADX INFO: renamed from: c */
    public final String f262955c;

    /* JADX INFO: renamed from: d */
    public final String f262956d;

    /* JADX INFO: renamed from: e */
    public final List f262957e;

    /* JADX INFO: renamed from: f */
    public final int f262958f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f262959g;

    /* JADX INFO: renamed from: h */
    public final Long f262960h;

    public xkx0(String str, String str2, String str3, String str4, List list, int i, ArrayList arrayList, Long l) {
        this.f262953a = str;
        this.f262954b = str2;
        this.f262955c = str3;
        this.f262956d = str4;
        this.f262957e = list;
        this.f262958f = i;
        this.f262959g = arrayList;
        this.f262960h = l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkx0)) {
            return false;
        }
        xkx0 xkx0Var = (xkx0) obj;
        return wj50.m88271j(this.f262953a, xkx0Var.f262953a) && wj50.m88271j(this.f262954b, xkx0Var.f262954b) && wj50.m88271j(this.f262955c, xkx0Var.f262955c) && wj50.m88271j(this.f262956d, xkx0Var.f262956d) && wj50.m88271j(this.f262957e, xkx0Var.f262957e) && this.f262958f == xkx0Var.f262958f && this.f262959g.equals(xkx0Var.f262959g) && wj50.m88271j(this.f262960h, xkx0Var.f262960h);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f262953a.hashCode() * 31, 31, this.f262954b);
        String str = this.f262955c;
        int iM59700f = lq51.m59700f(this.f262959g, mt60.m62800g(this.f262958f, s571.m77244c(s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262956d), 31, this.f262957e), 31), 31);
        Long l = this.f262960h;
        return iM59700f + (l != null ? l.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f262953a);
        parcel.writeString(this.f262954b);
        parcel.writeString(this.f262955c);
        parcel.writeString(this.f262956d);
        parcel.writeStringList(this.f262957e);
        parcel.writeInt(this.f262958f);
        Iterator itM42469m = fr0.m42469m(this.f262959g, parcel);
        while (itM42469m.hasNext()) {
            ((wit0) itM42469m.next()).writeToParcel(parcel, i);
        }
        Long l = this.f262960h;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            nap.m64026s(parcel, 1, l);
        }
    }
}
