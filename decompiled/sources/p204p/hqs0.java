package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class hqs0 implements Parcelable {
    public static final Parcelable.Creator<hqs0> CREATOR = new wds0(7);

    /* JADX INFO: renamed from: a */
    public final ArrayList f94246a;

    /* JADX INFO: renamed from: b */
    public final String f94247b;

    public hqs0(ArrayList arrayList, String str) {
        this.f94246a = arrayList;
        this.f94247b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqs0)) {
            return false;
        }
        hqs0 hqs0Var = (hqs0) obj;
        return this.f94246a.equals(hqs0Var.f94246a) && wj50.m88271j(this.f94247b, hqs0Var.f94247b);
    }

    public final int hashCode() {
        return this.f94247b.hashCode() + (this.f94246a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f94246a, parcel);
        while (itM42469m.hasNext()) {
            ((iqs0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f94247b);
    }
}
