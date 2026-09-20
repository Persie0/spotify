package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class iqy implements kqy {
    public static final Parcelable.Creator<iqy> CREATOR = new eqy(3);

    /* JADX INFO: renamed from: a */
    public final String f104865a;

    /* JADX INFO: renamed from: b */
    public final String f104866b;

    public iqy(String str, String str2) {
        this.f104865a = str;
        this.f104866b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f104866b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqy)) {
            return false;
        }
        iqy iqyVar = (iqy) obj;
        return wj50.m88271j(this.f104865a, iqyVar.f104865a) && wj50.m88271j(this.f104866b, iqyVar.f104866b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f104865a;
    }

    public final int hashCode() {
        return this.f104866b.hashCode() + (this.f104865a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f104865a);
        parcel.writeString(this.f104866b);
    }
}
