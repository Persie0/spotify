package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class v8c0 implements Parcelable {
    public static final Parcelable.Creator<v8c0> CREATOR = new f4c0(2);

    /* JADX INFO: renamed from: a */
    public final String f238468a;

    /* JADX INFO: renamed from: b */
    public final z5c0 f238469b;

    /* JADX INFO: renamed from: c */
    public final voc1 f238470c;

    public v8c0(String str, z5c0 z5c0Var, voc1 voc1Var) {
        this.f238468a = str;
        this.f238469b = z5c0Var;
        this.f238470c = voc1Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8c0)) {
            return false;
        }
        v8c0 v8c0Var = (v8c0) obj;
        return wj50.m88271j(this.f238468a, v8c0Var.f238468a) && this.f238469b == v8c0Var.f238469b && wj50.m88271j(this.f238470c, v8c0Var.f238470c);
    }

    public final int hashCode() {
        return this.f238470c.f243453a.hashCode() + ((this.f238469b.hashCode() + (this.f238468a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f238468a);
        parcel.writeString(this.f238469b.name());
        parcel.writeParcelable(this.f238470c, i);
    }
}
