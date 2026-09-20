package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class drw0 implements Parcelable {
    public static final Parcelable.Creator<drw0> CREATOR = new b8w0(17);

    /* JADX INFO: renamed from: e */
    public static final drw0 f52401e = new drw0("", "", "", "");

    /* JADX INFO: renamed from: a */
    public final String f52402a;

    /* JADX INFO: renamed from: b */
    public final String f52403b;

    /* JADX INFO: renamed from: c */
    public final String f52404c;

    /* JADX INFO: renamed from: d */
    public final String f52405d;

    public drw0(String str, String str2, String str3, String str4) {
        this.f52402a = str;
        this.f52403b = str2;
        this.f52404c = str3;
        this.f52405d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drw0)) {
            return false;
        }
        drw0 drw0Var = (drw0) obj;
        return wj50.m88271j(this.f52402a, drw0Var.f52402a) && wj50.m88271j(this.f52403b, drw0Var.f52403b) && wj50.m88271j(this.f52404c, drw0Var.f52404c) && wj50.m88271j(this.f52405d, drw0Var.f52405d);
    }

    public final int hashCode() {
        return this.f52405d.hashCode() + s571.m77243b(s571.m77243b(this.f52402a.hashCode() * 31, 31, this.f52403b), 31, this.f52404c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f52402a);
        parcel.writeString(this.f52403b);
        parcel.writeString(this.f52404c);
        parcel.writeString(this.f52405d);
    }
}
