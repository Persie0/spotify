package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public final class w940 implements Parcelable {
    public static final Parcelable.Creator<w940> CREATOR = new y240(7);

    /* JADX INFO: renamed from: a */
    public final String f249070a;

    /* JADX INFO: renamed from: b */
    public final String f249071b;

    /* JADX INFO: renamed from: c */
    public final int f249072c;

    public w940(String str, String str2, int i) {
        this.f249070a = str;
        this.f249071b = str2;
        this.f249072c = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w940)) {
            return false;
        }
        w940 w940Var = (w940) obj;
        return wj50.m88271j(this.f249070a, w940Var.f249070a) && wj50.m88271j(this.f249071b, w940Var.f249071b) && this.f249072c == w940Var.f249072c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249072c) + s571.m77243b(this.f249070a.hashCode() * 31, 31, this.f249071b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f249070a);
        parcel.writeString(this.f249071b);
        parcel.writeInt(this.f249072c);
    }
}
