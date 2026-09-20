package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class br5 implements Parcelable {
    public static final Parcelable.Creator<br5> CREATOR = new vp5(3);

    /* JADX INFO: renamed from: a */
    public final String f29969a;

    /* JADX INFO: renamed from: b */
    public final String f29970b;

    public br5(String str, String str2) {
        this.f29969a = str;
        this.f29970b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br5)) {
            return false;
        }
        br5 br5Var = (br5) obj;
        return wj50.m88271j(this.f29969a, br5Var.f29969a) && wj50.m88271j(this.f29970b, br5Var.f29970b);
    }

    public final int hashCode() {
        return this.f29970b.hashCode() + (this.f29969a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29969a);
        parcel.writeString(this.f29970b);
    }
}
