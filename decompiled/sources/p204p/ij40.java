package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ij40 implements Parcelable {
    public static final Parcelable.Creator<ij40> CREATOR = new y240(13);

    /* JADX INFO: renamed from: a */
    public final String f102688a;

    /* JADX INFO: renamed from: b */
    public final String f102689b;

    /* JADX INFO: renamed from: c */
    public final String f102690c;

    /* JADX INFO: renamed from: d */
    public final String f102691d;

    public ij40(String str, String str2, String str3, String str4) {
        this.f102688a = str;
        this.f102689b = str2;
        this.f102690c = str3;
        this.f102691d = str4;
    }

    /* JADX INFO: renamed from: c */
    public final String m50769c() {
        return this.f102688a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij40)) {
            return false;
        }
        ij40 ij40Var = (ij40) obj;
        return wj50.m88271j(this.f102688a, ij40Var.f102688a) && wj50.m88271j(this.f102689b, ij40Var.f102689b) && wj50.m88271j(this.f102690c, ij40Var.f102690c) && wj50.m88271j(this.f102691d, ij40Var.f102691d);
    }

    public final int hashCode() {
        return this.f102691d.hashCode() + s571.m77243b(s571.m77243b(this.f102688a.hashCode() * 31, 31, this.f102689b), 31, this.f102690c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f102688a);
        parcel.writeString(this.f102689b);
        parcel.writeString(this.f102690c);
        parcel.writeString(this.f102691d);
    }
}
