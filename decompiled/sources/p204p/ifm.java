package p204p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ifm implements Parcelable {
    public static final Parcelable.Creator<ifm> CREATOR = new pkl(22);

    /* JADX INFO: renamed from: a */
    public final String f101782a;

    /* JADX INFO: renamed from: b */
    public final Bundle f101783b;

    /* JADX INFO: renamed from: c */
    public final String f101784c;

    public ifm(String str, String str2, Bundle bundle) {
        this.f101782a = str;
        this.f101783b = bundle;
        this.f101784c = str2;
    }

    /* JADX INFO: renamed from: c */
    public final Bundle m50442c() {
        return this.f101783b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifm)) {
            return false;
        }
        ifm ifmVar = (ifm) obj;
        return wj50.m88271j(this.f101782a, ifmVar.f101782a) && wj50.m88271j(this.f101783b, ifmVar.f101783b) && wj50.m88271j(this.f101784c, ifmVar.f101784c);
    }

    /* JADX INFO: renamed from: g */
    public final String m50443g() {
        return this.f101782a;
    }

    public final int hashCode() {
        int iHashCode = this.f101782a.hashCode() * 31;
        Bundle bundle = this.f101783b;
        return this.f101784c.hashCode() + ((iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f101782a);
        parcel.writeBundle(this.f101783b);
        parcel.writeString(this.f101784c);
    }
}
