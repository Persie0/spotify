package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class zjn0 implements akn0 {
    public static final Parcelable.Creator<zjn0> CREATOR = new ejn0(6);

    /* JADX INFO: renamed from: a */
    public final String f283475a;

    /* JADX INFO: renamed from: b */
    public final String f283476b;

    /* JADX INFO: renamed from: c */
    public final String f283477c;

    /* JADX INFO: renamed from: d */
    public final String f283478d;

    public zjn0(String str, String str2, String str3, String str4) {
        this.f283475a = str;
        this.f283476b = str2;
        this.f283477c = str3;
        this.f283478d = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zjn0)) {
            return false;
        }
        zjn0 zjn0Var = (zjn0) obj;
        return wj50.m88271j(this.f283475a, zjn0Var.f283475a) && wj50.m88271j(this.f283476b, zjn0Var.f283476b) && wj50.m88271j(this.f283477c, zjn0Var.f283477c) && wj50.m88271j(this.f283478d, zjn0Var.f283478d);
    }

    public final int hashCode() {
        return this.f283478d.hashCode() + s571.m77243b(s571.m77243b(this.f283475a.hashCode() * 31, 31, this.f283476b), 31, this.f283477c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f283475a);
        parcel.writeString(this.f283476b);
        parcel.writeString(this.f283477c);
        parcel.writeString(this.f283478d);
    }
}
