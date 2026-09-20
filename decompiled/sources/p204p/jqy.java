package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class jqy implements kqy {
    public static final Parcelable.Creator<jqy> CREATOR = new eqy(4);

    /* JADX INFO: renamed from: a */
    public final String f115020a;

    /* JADX INFO: renamed from: b */
    public final String f115021b;

    public jqy(String str, String str2) {
        this.f115020a = str;
        this.f115021b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f115021b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqy)) {
            return false;
        }
        jqy jqyVar = (jqy) obj;
        return wj50.m88271j(this.f115020a, jqyVar.f115020a) && wj50.m88271j(this.f115021b, jqyVar.f115021b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f115020a;
    }

    public final int hashCode() {
        return this.f115021b.hashCode() + (this.f115020a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f115020a);
        parcel.writeString(this.f115021b);
    }
}
