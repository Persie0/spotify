package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class h400 implements Parcelable {
    public static final Parcelable.Creator<h400> CREATOR = new ygz(28);

    /* JADX INFO: renamed from: a */
    public final ArrayList f87378a;

    /* JADX INFO: renamed from: b */
    public final String f87379b;

    public h400(ArrayList arrayList, String str) {
        this.f87378a = arrayList;
        this.f87379b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h400)) {
            return false;
        }
        h400 h400Var = (h400) obj;
        return this.f87378a.equals(h400Var.f87378a) && wj50.m88271j(this.f87379b, h400Var.f87379b);
    }

    public final int hashCode() {
        int iHashCode = this.f87378a.hashCode() * 31;
        String str = this.f87379b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM42469m = fr0.m42469m(this.f87378a, parcel);
        while (itM42469m.hasNext()) {
            ((ium0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f87379b);
    }
}
