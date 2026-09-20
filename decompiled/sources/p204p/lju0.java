package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class lju0 implements Parcelable {
    public static final Parcelable.Creator<lju0> CREATOR = new v5u0(19);

    /* JADX INFO: renamed from: a */
    public final String f134151a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f134152b;

    public lju0(String str, ArrayList arrayList) {
        this.f134151a = str;
        this.f134152b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lju0)) {
            return false;
        }
        lju0 lju0Var = (lju0) obj;
        return wj50.m88271j(this.f134151a, lju0Var.f134151a) && this.f134152b.equals(lju0Var.f134152b);
    }

    public final int hashCode() {
        return this.f134152b.hashCode() + (this.f134151a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134151a);
        ArrayList arrayList = this.f134152b;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), i);
        }
    }
}
