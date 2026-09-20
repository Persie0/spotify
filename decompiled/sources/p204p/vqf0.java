package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class vqf0 implements Parcelable {
    public static final Parcelable.Creator<vqf0> CREATOR = new r4f0(12);

    /* JADX INFO: renamed from: a */
    public final List f243942a;

    /* JADX INFO: renamed from: b */
    public final String f243943b;

    /* JADX INFO: renamed from: c */
    public final a151 f243944c;

    public vqf0(List list, String str, a151 a151Var) {
        this.f243942a = list;
        this.f243943b = str;
        this.f243944c = a151Var;
    }

    /* JADX INFO: renamed from: c */
    public static vqf0 m86209c(vqf0 vqf0Var, ArrayList arrayList, a151 a151Var, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = vqf0Var.f243942a;
        }
        String str = vqf0Var.f243943b;
        if ((i & 4) != 0) {
            a151Var = vqf0Var.f243944c;
        }
        vqf0Var.getClass();
        return new vqf0(list, str, a151Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqf0)) {
            return false;
        }
        vqf0 vqf0Var = (vqf0) obj;
        return wj50.m88271j(this.f243942a, vqf0Var.f243942a) && wj50.m88271j(this.f243943b, vqf0Var.f243943b) && wj50.m88271j(this.f243944c, vqf0Var.f243944c);
    }

    public final int hashCode() {
        return this.f243944c.hashCode() + s571.m77243b(this.f243942a.hashCode() * 31, 31, this.f243943b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42468l = fr0.m42468l(parcel, this.f243942a);
        while (itM42468l.hasNext()) {
            ((rsx) itM42468l.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f243943b);
        parcel.writeParcelable(this.f243944c, i);
    }
}
