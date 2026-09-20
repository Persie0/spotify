package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class dcc1 implements fcc1 {
    public static final Parcelable.Creator<dcc1> CREATOR = new c8b1(24);

    /* JADX INFO: renamed from: a */
    public final Uri f47493a;

    /* JADX INFO: renamed from: b */
    public final String f47494b;

    /* JADX INFO: renamed from: c */
    public final z0r f47495c;

    public dcc1(Uri uri, String str, z0r z0rVar) {
        this.f47493a = uri;
        this.f47494b = str;
        this.f47495c = z0rVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dcc1)) {
            return false;
        }
        dcc1 dcc1Var = (dcc1) obj;
        return wj50.m88271j(this.f47493a, dcc1Var.f47493a) && wj50.m88271j(this.f47494b, dcc1Var.f47494b) && wj50.m88271j(this.f47495c, dcc1Var.f47495c);
    }

    public final int hashCode() {
        Uri uri = this.f47493a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f47494b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        z0r z0rVar = this.f47495c;
        return iHashCode2 + (z0rVar != null ? z0rVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47493a, i);
        parcel.writeString(this.f47494b);
        parcel.writeParcelable(this.f47495c, i);
    }
}
