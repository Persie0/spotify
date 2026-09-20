package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class lk9 implements Parcelable {
    public static final Parcelable.Creator<lk9> CREATOR = new n6f1(5);

    /* JADX INFO: renamed from: a */
    public final String f134290a;

    /* JADX INFO: renamed from: b */
    public final String f134291b;

    public lk9(String str, String str2) {
        this.f134290a = str;
        this.f134291b = str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m59218c() {
        return this.f134290a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk9)) {
            return false;
        }
        lk9 lk9Var = (lk9) obj;
        return wj50.m88271j(this.f134290a, lk9Var.f134290a) && wj50.m88271j(this.f134291b, lk9Var.f134291b);
    }

    /* JADX INFO: renamed from: g */
    public final String m59219g() {
        return this.f134291b;
    }

    public final int hashCode() {
        return this.f134291b.hashCode() + (this.f134290a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f134290a);
        parcel.writeString(this.f134291b);
    }
}
