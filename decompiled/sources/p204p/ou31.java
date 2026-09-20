package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class ou31 implements Parcelable {
    public static final Parcelable.Creator<ou31> CREATOR = new ln31(17);

    /* JADX INFO: renamed from: a */
    public final String f170161a;

    /* JADX INFO: renamed from: b */
    public final String f170162b;

    /* JADX INFO: renamed from: c */
    public final String f170163c;

    public ou31(String str, String str2, String str3) {
        this.f170161a = str;
        this.f170162b = str2;
        this.f170163c = str3;
    }

    /* JADX INFO: renamed from: c */
    public final String m68085c() {
        return this.f170163c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou31)) {
            return false;
        }
        ou31 ou31Var = (ou31) obj;
        return wj50.m88271j(this.f170161a, ou31Var.f170161a) && wj50.m88271j(this.f170162b, ou31Var.f170162b) && wj50.m88271j(this.f170163c, ou31Var.f170163c);
    }

    /* JADX INFO: renamed from: g */
    public final String m68086g() {
        return this.f170161a;
    }

    /* JADX INFO: renamed from: h */
    public final String m68087h() {
        return this.f170162b;
    }

    public final int hashCode() {
        return this.f170163c.hashCode() + s571.m77243b(this.f170161a.hashCode() * 31, 31, this.f170162b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f170161a);
        parcel.writeString(this.f170162b);
        parcel.writeString(this.f170163c);
    }
}
