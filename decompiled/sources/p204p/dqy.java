package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class dqy implements kqy {
    public static final Parcelable.Creator<dqy> CREATOR = new p7y(29);

    /* JADX INFO: renamed from: a */
    public final String f52113a;

    /* JADX INFO: renamed from: b */
    public final String f52114b;

    public dqy(String str, String str2) {
        this.f52113a = str;
        this.f52114b = str2;
    }

    @Override // p204p.kqy
    /* JADX INFO: renamed from: V */
    public final String mo36688V() {
        return this.f52114b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqy)) {
            return false;
        }
        dqy dqyVar = (dqy) obj;
        return wj50.m88271j(this.f52113a, dqyVar.f52113a) && wj50.m88271j(this.f52114b, dqyVar.f52114b);
    }

    @Override // p204p.kqy
    public final String getEventId() {
        return this.f52113a;
    }

    public final int hashCode() {
        return this.f52114b.hashCode() + (this.f52113a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f52113a);
        parcel.writeString(this.f52114b);
    }
}
