package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class fyy implements Parcelable {
    public static final Parcelable.Creator<fyy> CREATOR = new eqy(20);

    /* JADX INFO: renamed from: a */
    public final String f74865a;

    /* JADX INFO: renamed from: b */
    public final String f74866b;

    /* JADX INFO: renamed from: c */
    public final String f74867c;

    /* JADX INFO: renamed from: d */
    public final boolean f74868d;

    /* JADX INFO: renamed from: e */
    public final Set f74869e;

    public fyy(String str, String str2, String str3, boolean z, Set set) {
        this.f74865a = str;
        this.f74866b = str2;
        this.f74867c = str3;
        this.f74868d = z;
        this.f74869e = set;
    }

    /* JADX INFO: renamed from: c */
    public static fyy m43120c(fyy fyyVar, boolean z, Set set, int i) {
        String str = fyyVar.f74865a;
        String str2 = fyyVar.f74866b;
        String str3 = fyyVar.f74867c;
        if ((i & 8) != 0) {
            z = fyyVar.f74868d;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            set = fyyVar.f74869e;
        }
        return new fyy(str, str2, str3, z2, set);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyy)) {
            return false;
        }
        fyy fyyVar = (fyy) obj;
        return wj50.m88271j(this.f74865a, fyyVar.f74865a) && wj50.m88271j(this.f74866b, fyyVar.f74866b) && wj50.m88271j(this.f74867c, fyyVar.f74867c) && this.f74868d == fyyVar.f74868d && wj50.m88271j(this.f74869e, fyyVar.f74869e);
    }

    public final int hashCode() {
        return this.f74869e.hashCode() + s571.m77245d(s571.m77243b(s571.m77243b(this.f74865a.hashCode() * 31, 31, this.f74866b), 31, this.f74867c), 31, this.f74868d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74865a);
        parcel.writeString(this.f74866b);
        parcel.writeString(this.f74867c);
        parcel.writeInt(this.f74868d ? 1 : 0);
        Iterator itM64022o = nap.m64022o(this.f74869e, parcel);
        while (itM64022o.hasNext()) {
            ((fyy) itM64022o.next()).writeToParcel(parcel, i);
        }
    }
}
