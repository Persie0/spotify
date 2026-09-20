package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class gqy implements kqy {
    public static final Parcelable.Creator<gqy> CREATOR = new eqy(1);

    /* JADX INFO: renamed from: a */
    public final String f83577a;

    /* JADX INFO: renamed from: b */
    public final String f83578b;

    public gqy(String str, String str2) {
        this.f83577a = str;
        this.f83578b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f83578b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqy)) {
            return false;
        }
        gqy gqyVar = (gqy) obj;
        return wj50.m88271j(this.f83577a, gqyVar.f83577a) && wj50.m88271j(this.f83578b, gqyVar.f83578b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f83577a;
    }

    public final int hashCode() {
        return this.f83578b.hashCode() + (this.f83577a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f83577a);
        parcel.writeString(this.f83578b);
    }
}
