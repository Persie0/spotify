package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class fqy implements kqy {
    public static final Parcelable.Creator<fqy> CREATOR = new eqy(0);

    /* JADX INFO: renamed from: a */
    public final String f72310a;

    /* JADX INFO: renamed from: b */
    public final String f72311b;

    public fqy(String str, String str2) {
        this.f72310a = str;
        this.f72311b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f72311b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqy)) {
            return false;
        }
        fqy fqyVar = (fqy) obj;
        return wj50.m88271j(this.f72310a, fqyVar.f72310a) && wj50.m88271j(this.f72311b, fqyVar.f72311b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f72310a;
    }

    public final int hashCode() {
        return this.f72311b.hashCode() + (this.f72310a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72310a);
        parcel.writeString(this.f72311b);
    }
}
