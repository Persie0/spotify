package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public final class arf0 implements Parcelable {
    public static final Parcelable.Creator<arf0> CREATOR = new r4f0(13);

    /* JADX INFO: renamed from: a */
    public final String f19054a;

    /* JADX INFO: renamed from: b */
    public final String f19055b;

    public arf0(String str, String str2) {
        this.f19054a = str;
        this.f19055b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arf0)) {
            return false;
        }
        arf0 arf0Var = (arf0) obj;
        return wj50.m88271j(this.f19054a, arf0Var.f19054a) && wj50.m88271j(this.f19055b, arf0Var.f19055b);
    }

    public final int hashCode() {
        return this.f19055b.hashCode() + (this.f19054a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19054a);
        parcel.writeString(this.f19055b);
    }
}
