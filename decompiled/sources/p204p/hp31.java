package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class hp31 implements jp31 {
    public static final Parcelable.Creator<hp31> CREATOR = new ln31(2);

    /* JADX INFO: renamed from: a */
    public final String f93691a;

    /* JADX INFO: renamed from: b */
    public final String f93692b;

    public hp31(String str, String str2) {
        this.f93691a = str;
        this.f93692b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp31)) {
            return false;
        }
        hp31 hp31Var = (hp31) obj;
        return wj50.m88271j(this.f93691a, hp31Var.f93691a) && wj50.m88271j(this.f93692b, hp31Var.f93692b);
    }

    public final int hashCode() {
        return this.f93692b.hashCode() + (this.f93691a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f93691a);
        parcel.writeString(this.f93692b);
    }
}
