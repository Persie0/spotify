package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: p.l5 */
/* JADX INFO: loaded from: classes8.dex */
public final class C2078l5 implements go01, Parcelable {
    public static final Parcelable.Creator<C2078l5> CREATOR = new ora(10);

    /* JADX INFO: renamed from: a */
    public final String f129781a;

    /* JADX INFO: renamed from: b */
    public final List f129782b;

    public C2078l5(String str, ArrayList arrayList) {
        this.f129781a = str;
        this.f129782b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2078l5)) {
            return false;
        }
        C2078l5 c2078l5 = (C2078l5) obj;
        return wj50.m88271j(this.f129781a, c2078l5.f129781a) && wj50.m88271j(this.f129782b, c2078l5.f129782b);
    }

    public final int hashCode() {
        return this.f129782b.hashCode() + (this.f129781a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f129781a);
        parcel.writeStringList(this.f129782b);
    }
}
