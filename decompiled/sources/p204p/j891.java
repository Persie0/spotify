package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class j891 implements Parcelable {
    public static final Parcelable.Creator<j891> CREATOR = new f891(1);

    /* JADX INFO: renamed from: a */
    public final String f109868a;

    /* JADX INFO: renamed from: b */
    public final String f109869b;

    /* JADX INFO: renamed from: c */
    public final String f109870c;

    public j891(String str, String str2, String str3) {
        this.f109868a = str;
        this.f109869b = str2;
        this.f109870c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m52702c() {
        return this.f109870c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j891)) {
            return false;
        }
        j891 j891Var = (j891) obj;
        return wj50.m88271j(this.f109868a, j891Var.f109868a) && wj50.m88271j(this.f109869b, j891Var.f109869b) && wj50.m88271j(this.f109870c, j891Var.f109870c);
    }

    public final int hashCode() {
        return this.f109870c.hashCode() + s571.m77243b(this.f109868a.hashCode() * 31, 31, this.f109869b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f109868a);
        parcel.writeString(this.f109869b);
        parcel.writeString(this.f109870c);
    }
}
