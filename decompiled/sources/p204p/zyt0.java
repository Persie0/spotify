package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class zyt0 implements Parcelable {
    public static final Parcelable.Creator<zyt0> CREATOR = new vit0(22);

    /* JADX INFO: renamed from: a */
    public final String f287677a;

    /* JADX INFO: renamed from: b */
    public final String f287678b;

    public zyt0(String str, String str2) {
        this.f287677a = str;
        this.f287678b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m97247c() {
        return this.f287677a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zyt0)) {
            return false;
        }
        zyt0 zyt0Var = (zyt0) obj;
        return wj50.m88271j(this.f287677a, zyt0Var.f287677a) && wj50.m88271j(this.f287678b, zyt0Var.f287678b);
    }

    /* JADX INFO: renamed from: g */
    public final String m97248g() {
        return this.f287678b;
    }

    public final int hashCode() {
        return this.f287678b.hashCode() + (this.f287677a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f287677a);
        parcel.writeString(this.f287678b);
    }
}
