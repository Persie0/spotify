package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class k340 implements Parcelable {
    public static final Parcelable.Creator<k340> CREATOR = new bw30(29);

    /* JADX INFO: renamed from: a */
    public final String f118759a;

    /* JADX INFO: renamed from: b */
    public final String f118760b;

    public k340(String str, String str2) {
        this.f118759a = str;
        this.f118760b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m55228c() {
        return this.f118760b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k340)) {
            return false;
        }
        k340 k340Var = (k340) obj;
        return wj50.m88271j(this.f118759a, k340Var.f118759a) && wj50.m88271j(this.f118760b, k340Var.f118760b);
    }

    /* JADX INFO: renamed from: g */
    public final String m55229g() {
        return this.f118759a;
    }

    public final int hashCode() {
        return this.f118760b.hashCode() + (this.f118759a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118759a);
        parcel.writeString(this.f118760b);
    }
}
