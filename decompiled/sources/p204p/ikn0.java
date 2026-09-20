package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class ikn0 implements Parcelable {
    public static final Parcelable.Creator<ikn0> CREATOR = new ejn0(7);

    /* JADX INFO: renamed from: a */
    public final String f103145a;

    /* JADX INFO: renamed from: b */
    public final String f103146b;

    /* JADX INFO: renamed from: c */
    public final String f103147c;

    /* JADX INFO: renamed from: d */
    public final String f103148d;

    /* JADX INFO: renamed from: e */
    public final boolean f103149e;

    public ikn0(String str, String str2, String str3, String str4, boolean z) {
        this.f103145a = str;
        this.f103146b = str2;
        this.f103147c = str3;
        this.f103148d = str4;
        this.f103149e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikn0)) {
            return false;
        }
        ikn0 ikn0Var = (ikn0) obj;
        return wj50.m88271j(this.f103145a, ikn0Var.f103145a) && wj50.m88271j(this.f103146b, ikn0Var.f103146b) && wj50.m88271j(this.f103147c, ikn0Var.f103147c) && wj50.m88271j(this.f103148d, ikn0Var.f103148d) && this.f103149e == ikn0Var.f103149e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f103149e) + s571.m77243b(s571.m77243b(s571.m77243b(this.f103145a.hashCode() * 31, 31, this.f103146b), 31, this.f103147c), 31, this.f103148d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f103145a);
        parcel.writeString(this.f103146b);
        parcel.writeString(this.f103147c);
        parcel.writeString(this.f103148d);
        parcel.writeInt(this.f103149e ? 1 : 0);
    }
}
