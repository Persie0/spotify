package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class jkn0 implements zz41 {
    public static final Parcelable.Creator<jkn0> CREATOR = new ejn0(8);

    /* JADX INFO: renamed from: a */
    public final akn0 f113336a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f113337b;

    /* JADX INFO: renamed from: c */
    public final String f113338c;

    public jkn0(akn0 akn0Var, ArrayList arrayList, String str) {
        this.f113336a = akn0Var;
        this.f113337b = arrayList;
        this.f113338c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkn0)) {
            return false;
        }
        jkn0 jkn0Var = (jkn0) obj;
        return wj50.m88271j(this.f113336a, jkn0Var.f113336a) && wj50.m88271j(this.f113337b, jkn0Var.f113337b) && wj50.m88271j(this.f113338c, jkn0Var.f113338c);
    }

    @Override // p204p.zz41
    public final String getId() {
        return this.f113338c;
    }

    public final int hashCode() {
        return this.f113338c.hashCode() + lq51.m59700f(this.f113337b, this.f113336a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f113336a, i);
        Iterator itM42469m = fr0.m42469m(this.f113337b, parcel);
        while (itM42469m.hasNext()) {
            ((ikn0) itM42469m.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.f113338c);
    }

    public /* synthetic */ jkn0(akn0 akn0Var, ArrayList arrayList) {
        this(akn0Var, arrayList, "PeopleBottomSheet");
    }
}
