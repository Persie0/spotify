package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class h0b0 extends w0b0 {
    public static final Parcelable.Creator<h0b0> CREATOR = new ama0(26);

    /* JADX INFO: renamed from: a */
    public final String f86198a;

    /* JADX INFO: renamed from: b */
    public final String f86199b;

    public h0b0(String str, String str2) {
        this.f86198a = str;
        this.f86199b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0b0)) {
            return false;
        }
        h0b0 h0b0Var = (h0b0) obj;
        return wj50.m88271j(this.f86198a, h0b0Var.f86198a) && wj50.m88271j(this.f86199b, h0b0Var.f86199b);
    }

    /* JADX INFO: renamed from: g */
    public final String m46271g() {
        return this.f86198a;
    }

    /* JADX INFO: renamed from: h */
    public final String m46272h() {
        return this.f86199b;
    }

    public final int hashCode() {
        return this.f86199b.hashCode() + (this.f86198a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f86198a);
        parcel.writeString(this.f86199b);
    }
}
