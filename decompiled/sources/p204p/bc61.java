package p204p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class bc61 extends gc61 {
    public static final Parcelable.Creator<bc61> CREATOR = new e361(21);

    /* JADX INFO: renamed from: a */
    public final String f25790a;

    /* JADX INFO: renamed from: b */
    public final boolean f25791b;

    /* JADX INFO: renamed from: c */
    public final String f25792c;

    /* JADX INFO: renamed from: d */
    public final Uri f25793d;

    public bc61(String str, boolean z, String str2, Uri uri) {
        this.f25790a = str;
        this.f25791b = z;
        this.f25792c = str2;
        this.f25793d = uri;
    }

    @Override // p204p.gc61
    /* JADX INFO: renamed from: c */
    public final String mo25442c() {
        return this.f25790a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc61)) {
            return false;
        }
        bc61 bc61Var = (bc61) obj;
        return wj50.m88271j(this.f25790a, bc61Var.f25790a) && this.f25791b == bc61Var.f25791b && wj50.m88271j(this.f25792c, bc61Var.f25792c) && wj50.m88271j(this.f25793d, bc61Var.f25793d);
    }

    public final int hashCode() {
        return this.f25793d.hashCode() + s571.m77243b(s571.m77245d(this.f25790a.hashCode() * 31, 31, this.f25791b), 31, this.f25792c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25790a);
        parcel.writeInt(this.f25791b ? 1 : 0);
        parcel.writeString(this.f25792c);
        parcel.writeParcelable(this.f25793d, i);
    }
}
