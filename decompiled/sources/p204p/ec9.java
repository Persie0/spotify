package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ec9 implements Parcelable {
    public static final Parcelable.Creator<ec9> CREATOR = new dc9(0);

    /* JADX INFO: renamed from: a */
    public final String f58266a;

    /* JADX INFO: renamed from: b */
    public final boolean f58267b;

    public ec9(String str, boolean z) {
        this.f58266a = str;
        this.f58267b = z;
    }

    /* JADX INFO: renamed from: c */
    public static ec9 m38489c(ec9 ec9Var, boolean z) {
        String str = ec9Var.f58266a;
        ec9Var.getClass();
        return new ec9(str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec9)) {
            return false;
        }
        ec9 ec9Var = (ec9) obj;
        return wj50.m88271j(this.f58266a, ec9Var.f58266a) && this.f58267b == ec9Var.f58267b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58267b) + (this.f58266a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f58266a);
        parcel.writeInt(this.f58267b ? 1 : 0);
    }
}
