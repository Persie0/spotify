package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class n3l0 implements Parcelable {
    public static final Parcelable.Creator<n3l0> CREATOR = new oxk0(21);

    /* JADX INFO: renamed from: a */
    public final String f150076a;

    /* JADX INFO: renamed from: b */
    public final String f150077b;

    /* JADX INFO: renamed from: c */
    public final String f150078c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f150079d;

    /* JADX INFO: renamed from: e */
    public final p3l0 f150080e;

    /* JADX INFO: renamed from: f */
    public final boolean f150081f;

    /* JADX INFO: renamed from: g */
    public final boolean f150082g;

    /* JADX INFO: renamed from: h */
    public final String f150083h;

    public n3l0(String str, String str2, String str3, ArrayList arrayList, p3l0 p3l0Var, boolean z, boolean z2) {
        this.f150076a = str;
        this.f150077b = str2;
        this.f150078c = str3;
        this.f150079d = arrayList;
        this.f150080e = p3l0Var;
        this.f150081f = z;
        this.f150082g = z2;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r3l0) it.next()).f195519a);
        }
        this.f150083h = phf1.m69989h(arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3l0)) {
            return false;
        }
        n3l0 n3l0Var = (n3l0) obj;
        return wj50.m88271j(this.f150076a, n3l0Var.f150076a) && wj50.m88271j(this.f150077b, n3l0Var.f150077b) && wj50.m88271j(this.f150078c, n3l0Var.f150078c) && this.f150079d.equals(n3l0Var.f150079d) && wj50.m88271j(this.f150080e, n3l0Var.f150080e) && this.f150081f == n3l0Var.f150081f && this.f150082g == n3l0Var.f150082g;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f150076a.hashCode() * 31, 31, this.f150077b);
        String str = this.f150078c;
        int iM59700f = lq51.m59700f(this.f150079d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        p3l0 p3l0Var = this.f150080e;
        return Boolean.hashCode(this.f150082g) + s571.m77245d((iM59700f + (p3l0Var != null ? p3l0Var.hashCode() : 0)) * 31, 31, this.f150081f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f150076a);
        parcel.writeString(this.f150077b);
        parcel.writeString(this.f150078c);
        Iterator itM42469m = fr0.m42469m(this.f150079d, parcel);
        while (itM42469m.hasNext()) {
            ((r3l0) itM42469m.next()).writeToParcel(parcel, i);
        }
        p3l0 p3l0Var = this.f150080e;
        if (p3l0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            p3l0Var.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f150081f ? 1 : 0);
        parcel.writeInt(this.f150082g ? 1 : 0);
    }
}
