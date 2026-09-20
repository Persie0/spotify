package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vlc0 implements Parcelable {
    public static final Parcelable.Creator<vlc0> CREATOR = new f4c0(6);

    /* JADX INFO: renamed from: a */
    public final String f242452a;

    /* JADX INFO: renamed from: b */
    public final boolean f242453b;

    /* JADX INFO: renamed from: c */
    public final String f242454c;

    public vlc0(String str, String str2, boolean z) {
        this.f242452a = str;
        this.f242453b = z;
        this.f242454c = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m85945c() {
        return this.f242452a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlc0)) {
            return false;
        }
        vlc0 vlc0Var = (vlc0) obj;
        return wj50.m88271j(this.f242452a, vlc0Var.f242452a) && this.f242453b == vlc0Var.f242453b && wj50.m88271j(this.f242454c, vlc0Var.f242454c);
    }

    public final int hashCode() {
        return this.f242454c.hashCode() + s571.m77245d(this.f242452a.hashCode() * 31, 31, this.f242453b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242452a);
        parcel.writeInt(this.f242453b ? 1 : 0);
        parcel.writeString(this.f242454c);
    }
}
