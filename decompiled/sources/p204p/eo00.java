package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class eo00 implements Parcelable {
    public static final Parcelable.Creator<eo00> CREATOR = new k700(14);

    /* JADX INFO: renamed from: a */
    public final String f61261a;

    /* JADX INFO: renamed from: b */
    public final String f61262b;

    /* JADX INFO: renamed from: c */
    public final String f61263c;

    public eo00(String str, String str2, String str3) {
        this.f61261a = str;
        this.f61262b = str2;
        this.f61263c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m39536c() {
        return this.f61262b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo00)) {
            return false;
        }
        eo00 eo00Var = (eo00) obj;
        return wj50.m88271j(this.f61261a, eo00Var.f61261a) && wj50.m88271j(this.f61262b, eo00Var.f61262b) && wj50.m88271j(this.f61263c, eo00Var.f61263c);
    }

    public final String getUsername() {
        return this.f61263c;
    }

    public final int hashCode() {
        return this.f61263c.hashCode() + s571.m77243b(this.f61261a.hashCode() * 31, 31, this.f61262b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f61261a);
        parcel.writeString(this.f61262b);
        parcel.writeString(this.f61263c);
    }
}
