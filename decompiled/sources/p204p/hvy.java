package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class hvy implements lvy {
    public static final Parcelable.Creator<hvy> CREATOR = new eqy(12);

    /* JADX INFO: renamed from: a */
    public final String f95812a;

    /* JADX INFO: renamed from: b */
    public final String f95813b;

    /* JADX INFO: renamed from: c */
    public final String f95814c;

    /* JADX INFO: renamed from: d */
    public final String f95815d;

    /* JADX INFO: renamed from: e */
    public final List f95816e;

    /* JADX INFO: renamed from: f */
    public final boolean f95817f;

    /* JADX INFO: renamed from: g */
    public final fvy f95818g;

    public hvy(String str, String str2, String str3, String str4, ArrayList arrayList, boolean z, fvy fvyVar) {
        this.f95812a = str;
        this.f95813b = str2;
        this.f95814c = str3;
        this.f95815d = str4;
        this.f95816e = arrayList;
        this.f95817f = z;
        this.f95818g = fvyVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvy)) {
            return false;
        }
        hvy hvyVar = (hvy) obj;
        return wj50.m88271j(this.f95812a, hvyVar.f95812a) && wj50.m88271j(this.f95813b, hvyVar.f95813b) && wj50.m88271j(this.f95814c, hvyVar.f95814c) && wj50.m88271j(this.f95815d, hvyVar.f95815d) && wj50.m88271j(this.f95816e, hvyVar.f95816e) && this.f95817f == hvyVar.f95817f && wj50.m88271j(this.f95818g, hvyVar.f95818g);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f95812a.hashCode() * 31, 31, this.f95813b);
        String str = this.f95814c;
        int iM77243b2 = s571.m77243b((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f95815d);
        List list = this.f95816e;
        return this.f95818g.hashCode() + s571.m77245d((iM77243b2 + (list != null ? list.hashCode() : 0)) * 31, 31, this.f95817f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f95812a);
        parcel.writeString(this.f95813b);
        parcel.writeString(this.f95814c);
        parcel.writeString(this.f95815d);
        List list = this.f95816e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((gvy) it.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.f95817f ? 1 : 0);
        this.f95818g.writeToParcel(parcel, i);
    }
}
