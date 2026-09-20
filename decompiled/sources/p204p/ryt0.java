package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class ryt0 implements Parcelable {
    public static final Parcelable.Creator<ryt0> CREATOR = new vit0(19);

    /* JADX INFO: renamed from: a */
    public final ArrayList f203960a;

    /* JADX INFO: renamed from: b */
    public final i8b0 f203961b;

    /* JADX INFO: renamed from: c */
    public final String f203962c;

    /* JADX INFO: renamed from: d */
    public final String f203963d;

    /* JADX INFO: renamed from: e */
    public final boolean f203964e;

    public ryt0(ArrayList arrayList, i8b0 i8b0Var, String str, String str2, boolean z) {
        this.f203960a = arrayList;
        this.f203961b = i8b0Var;
        this.f203962c = str;
        this.f203963d = str2;
        this.f203964e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryt0)) {
            return false;
        }
        ryt0 ryt0Var = (ryt0) obj;
        return this.f203960a.equals(ryt0Var.f203960a) && wj50.m88271j(this.f203961b, ryt0Var.f203961b) && wj50.m88271j(this.f203962c, ryt0Var.f203962c) && wj50.m88271j(this.f203963d, ryt0Var.f203963d) && this.f203964e == ryt0Var.f203964e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203964e) + s571.m77243b(s571.m77243b((this.f203961b.hashCode() + (this.f203960a.hashCode() * 31)) * 31, 31, this.f203962c), 31, this.f203963d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f203960a, parcel);
        while (itM42469m.hasNext()) {
            ((zkx0) itM42469m.next()).writeToParcel(parcel, i);
        }
        this.f203961b.writeToParcel(parcel, i);
        parcel.writeString(this.f203962c);
        parcel.writeString(this.f203963d);
        parcel.writeInt(this.f203964e ? 1 : 0);
    }
}
