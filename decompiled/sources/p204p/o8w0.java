package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class o8w0 implements r8w0 {
    public static final Parcelable.Creator<o8w0> CREATOR = new b8w0(5);

    /* JADX INFO: renamed from: a */
    public final String f162884a;

    /* JADX INFO: renamed from: b */
    public final String f162885b;

    public o8w0(String str, String str2) {
        this.f162884a = str;
        this.f162885b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8w0)) {
            return false;
        }
        o8w0 o8w0Var = (o8w0) obj;
        return wj50.m88271j(this.f162884a, o8w0Var.f162884a) && wj50.m88271j(this.f162885b, o8w0Var.f162885b);
    }

    @Override // p204p.r8w0
    public final String getId() {
        return this.f162884a;
    }

    public final String getUri() {
        return this.f162885b;
    }

    public final int hashCode() {
        return this.f162885b.hashCode() + (this.f162884a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f162884a);
        parcel.writeString(this.f162885b);
    }
}
