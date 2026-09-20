package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public final class kqq0 implements z5z0, Parcelable {
    public static final Parcelable.Creator<kqq0> CREATOR = new vnp0(24);

    /* JADX INFO: renamed from: a */
    public final String f125380a;

    /* JADX INFO: renamed from: b */
    public final String f125381b;

    /* JADX INFO: renamed from: c */
    public final String f125382c;

    public kqq0(String str, String str2, String str3) {
        this.f125380a = str;
        this.f125381b = str2;
        this.f125382c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m57120c() {
        return this.f125382c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqq0)) {
            return false;
        }
        kqq0 kqq0Var = (kqq0) obj;
        return wj50.m88271j(this.f125380a, kqq0Var.f125380a) && wj50.m88271j(this.f125381b, kqq0Var.f125381b) && wj50.m88271j(this.f125382c, kqq0Var.f125382c);
    }

    /* JADX INFO: renamed from: g */
    public final String m57121g() {
        return this.f125381b;
    }

    public final String getTitle() {
        return this.f125380a;
    }

    public final int hashCode() {
        return this.f125382c.hashCode() + s571.m77243b(this.f125380a.hashCode() * 31, 31, this.f125381b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f125380a);
        parcel.writeString(this.f125381b);
        parcel.writeString(this.f125382c);
    }
}
