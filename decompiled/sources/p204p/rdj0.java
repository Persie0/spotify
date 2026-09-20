package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class rdj0 implements Parcelable {
    public static final Parcelable.Creator<rdj0> CREATOR = new rri0(26);

    /* JADX INFO: renamed from: a */
    public final int f198155a;

    /* JADX INFO: renamed from: b */
    public final String f198156b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f198157c;

    /* JADX INFO: renamed from: d */
    public final boolean f198158d;

    /* JADX INFO: renamed from: e */
    public final taj0 f198159e;

    /* JADX INFO: renamed from: f */
    public final boolean f198160f;

    public rdj0(int i, String str, ArrayList arrayList, boolean z, taj0 taj0Var, boolean z2) {
        this.f198155a = i;
        this.f198156b = str;
        this.f198157c = arrayList;
        this.f198158d = z;
        this.f198159e = taj0Var;
        this.f198160f = z2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdj0)) {
            return false;
        }
        rdj0 rdj0Var = (rdj0) obj;
        return this.f198155a == rdj0Var.f198155a && wj50.m88271j(this.f198156b, rdj0Var.f198156b) && this.f198157c.equals(rdj0Var.f198157c) && this.f198158d == rdj0Var.f198158d && wj50.m88271j(this.f198159e, rdj0Var.f198159e) && this.f198160f == rdj0Var.f198160f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f198160f) + ((this.f198159e.hashCode() + s571.m77245d(lq51.m59700f(this.f198157c, s571.m77243b(Integer.hashCode(this.f198155a) * 31, 31, this.f198156b), 31), 31, this.f198158d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f198155a);
        parcel.writeString(this.f198156b);
        Iterator itM42469m = fr0.m42469m(this.f198157c, parcel);
        while (itM42469m.hasNext()) {
            ((qdj0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f198158d ? 1 : 0);
        parcel.writeParcelable(this.f198159e, i);
        parcel.writeInt(this.f198160f ? 1 : 0);
    }
}
