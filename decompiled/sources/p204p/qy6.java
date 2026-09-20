package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class qy6 implements Parcelable {
    public static final Parcelable.Creator<qy6> CREATOR = new fi6(22);

    /* JADX INFO: renamed from: a */
    public final String f193826a;

    /* JADX INFO: renamed from: b */
    public final String f193827b;

    public qy6(String str, String str2) {
        this.f193826a = str;
        this.f193827b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy6)) {
            return false;
        }
        qy6 qy6Var = (qy6) obj;
        return wj50.m88271j(this.f193826a, qy6Var.f193826a) && wj50.m88271j(this.f193827b, qy6Var.f193827b);
    }

    public final int hashCode() {
        return this.f193827b.hashCode() + (this.f193826a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f193826a);
        parcel.writeString(this.f193827b);
    }
}
