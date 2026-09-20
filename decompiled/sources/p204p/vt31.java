package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class vt31 implements Parcelable {
    public static final Parcelable.Creator<vt31> CREATOR = new ln31(15);

    /* JADX INFO: renamed from: a */
    public final String f244542a;

    /* JADX INFO: renamed from: b */
    public final String f244543b;

    /* JADX INFO: renamed from: c */
    public final String f244544c;

    public vt31(String str, String str2, String str3) {
        this.f244542a = str;
        this.f244543b = str2;
        this.f244544c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt31)) {
            return false;
        }
        vt31 vt31Var = (vt31) obj;
        return wj50.m88271j(this.f244542a, vt31Var.f244542a) && wj50.m88271j(this.f244543b, vt31Var.f244543b) && wj50.m88271j(this.f244544c, vt31Var.f244544c);
    }

    public final int hashCode() {
        return this.f244544c.hashCode() + s571.m77243b(this.f244542a.hashCode() * 31, 31, this.f244543b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f244542a);
        parcel.writeString(this.f244543b);
        parcel.writeString(this.f244544c);
    }
}
