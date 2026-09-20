package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class ng9 implements Parcelable {
    public static final Parcelable.Creator<ng9> CREATOR = new dc9(6);

    /* JADX INFO: renamed from: a */
    public final String f153598a;

    public ng9(String str) {
        this.f153598a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m64381c() {
        return this.f153598a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng9) && wj50.m88271j(this.f153598a, ((ng9) obj).f153598a);
    }

    public final int hashCode() {
        return this.f153598a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f153598a);
    }
}
