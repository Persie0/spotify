package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class q0t implements Parcelable {
    public static final Parcelable.Creator<q0t> CREATOR = new f9s(19);

    /* JADX INFO: renamed from: a */
    public final String f184072a;

    /* JADX INFO: renamed from: b */
    public final String f184073b;

    public q0t(String str, String str2) {
        this.f184072a = str;
        this.f184073b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m71863c() {
        return this.f184072a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0t)) {
            return false;
        }
        q0t q0tVar = (q0t) obj;
        return wj50.m88271j(this.f184072a, q0tVar.f184072a) && wj50.m88271j(this.f184073b, q0tVar.f184073b);
    }

    public final int hashCode() {
        return this.f184073b.hashCode() + (this.f184072a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f184072a);
        parcel.writeString(this.f184073b);
    }
}
