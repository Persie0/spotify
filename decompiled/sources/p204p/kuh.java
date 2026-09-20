package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class kuh extends zq50 {
    public static final Parcelable.Creator<kuh> CREATOR = new rae(24);

    /* JADX INFO: renamed from: a */
    public final String f126615a;

    /* JADX INFO: renamed from: b */
    public final eoo f126616b;

    /* JADX INFO: renamed from: c */
    public final String f126617c;

    /* JADX INFO: renamed from: d */
    public final String f126618d;

    public kuh(String str, eoo eooVar, String str2, String str3) {
        this.f126615a = str;
        this.f126616b = eooVar;
        this.f126617c = str2;
        this.f126618d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kuh)) {
            return false;
        }
        kuh kuhVar = (kuh) obj;
        return wj50.m88271j(this.f126615a, kuhVar.f126615a) && wj50.m88271j(this.f126616b, kuhVar.f126616b) && wj50.m88271j(this.f126617c, kuhVar.f126617c) && wj50.m88271j(this.f126618d, kuhVar.f126618d);
    }

    public final int hashCode() {
        return this.f126618d.hashCode() + s571.m77243b((this.f126616b.hashCode() + (this.f126615a.hashCode() * 31)) * 31, 31, this.f126617c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f126615a);
        this.f126616b.writeToParcel(parcel, i);
        parcel.writeString(this.f126617c);
        parcel.writeString(this.f126618d);
    }
}
