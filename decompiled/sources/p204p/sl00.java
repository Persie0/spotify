package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class sl00 implements Parcelable {
    public static final Parcelable.Creator<sl00> CREATOR = new k700(13);

    /* JADX INFO: renamed from: a */
    public final String f210233a;

    /* JADX INFO: renamed from: b */
    public final int f210234b;

    /* JADX INFO: renamed from: c */
    public final int f210235c;

    /* JADX INFO: renamed from: d */
    public final int f210236d;

    /* JADX INFO: renamed from: e */
    public final String f210237e;

    /* JADX INFO: renamed from: f */
    public final long f210238f;

    public sl00(int i, int i2, int i3, long j, String str, String str2) {
        this.f210233a = str;
        this.f210234b = i;
        this.f210235c = i2;
        this.f210236d = i3;
        this.f210237e = str2;
        this.f210238f = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sl00)) {
            return false;
        }
        sl00 sl00Var = (sl00) obj;
        return wj50.m88271j(this.f210233a, sl00Var.f210233a) && this.f210234b == sl00Var.f210234b && this.f210235c == sl00Var.f210235c && this.f210236d == sl00Var.f210236d && wj50.m88271j(this.f210237e, sl00Var.f210237e) && this.f210238f == sl00Var.f210238f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f210238f) + s571.m77243b(f710.m40938f(this.f210236d, mt60.m62800g(this.f210235c, mt60.m62800g(this.f210234b, this.f210233a.hashCode() * 31, 31), 31), 31), 31, this.f210237e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f210233a);
        parcel.writeInt(this.f210234b);
        parcel.writeInt(this.f210235c);
        int i2 = this.f210236d;
        if (i2 == 1) {
            str = "IMAGE";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "VIDEO";
        }
        parcel.writeString(str);
        parcel.writeString(this.f210237e);
        parcel.writeLong(this.f210238f);
    }
}
