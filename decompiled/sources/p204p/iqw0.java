package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class iqw0 implements Parcelable {
    public static final Parcelable.Creator<iqw0> CREATOR = new b8w0(16);

    /* JADX INFO: renamed from: a */
    public final String f104856a;

    /* JADX INFO: renamed from: b */
    public final String f104857b;

    public iqw0(String str, String str2) {
        this.f104856a = str;
        this.f104857b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m51415c() {
        return this.f104857b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqw0)) {
            return false;
        }
        iqw0 iqw0Var = (iqw0) obj;
        return wj50.m88271j(this.f104856a, iqw0Var.f104856a) && wj50.m88271j(this.f104857b, iqw0Var.f104857b);
    }

    /* JADX INFO: renamed from: g */
    public final String m51416g() {
        return this.f104856a;
    }

    public final int hashCode() {
        return this.f104857b.hashCode() + (this.f104856a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f104856a);
        parcel.writeString(this.f104857b);
    }
}
