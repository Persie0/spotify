package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class kqr0 implements Parcelable {
    public static final Parcelable.Creator<kqr0> CREATOR = new uir0(8);

    /* JADX INFO: renamed from: a */
    public final String f125385a;

    /* JADX INFO: renamed from: b */
    public final String f125386b;

    /* JADX INFO: renamed from: c */
    public final String f125387c;

    /* JADX INFO: renamed from: d */
    public final boolean f125388d;

    /* JADX INFO: renamed from: e */
    public final String f125389e;

    /* JADX INFO: renamed from: f */
    public final String f125390f;

    public kqr0(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.f125385a = str;
        this.f125386b = str2;
        this.f125387c = str3;
        this.f125388d = z;
        this.f125389e = str4;
        this.f125390f = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqr0)) {
            return false;
        }
        kqr0 kqr0Var = (kqr0) obj;
        return wj50.m88271j(this.f125385a, kqr0Var.f125385a) && wj50.m88271j(this.f125386b, kqr0Var.f125386b) && wj50.m88271j(this.f125387c, kqr0Var.f125387c) && this.f125388d == kqr0Var.f125388d && wj50.m88271j(this.f125389e, kqr0Var.f125389e) && wj50.m88271j(this.f125390f, kqr0Var.f125390f);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f125385a.hashCode() * 31, 31, this.f125386b);
        String str = this.f125387c;
        return this.f125390f.hashCode() + s571.m77243b(s571.m77245d((iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f125388d), 31, this.f125389e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f125385a);
        parcel.writeString(this.f125386b);
        parcel.writeString(this.f125387c);
        parcel.writeInt(this.f125388d ? 1 : 0);
        parcel.writeString(this.f125389e);
        parcel.writeString(this.f125390f);
    }
}
