package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ecj0 implements Parcelable {
    public static final Parcelable.Creator<ecj0> CREATOR = new rri0(22);

    /* JADX INFO: renamed from: a */
    public final int f58346a;

    /* JADX INFO: renamed from: b */
    public final String f58347b;

    /* JADX INFO: renamed from: c */
    public final List f58348c;

    /* JADX INFO: renamed from: d */
    public final String f58349d;

    public ecj0(int i, String str, String str2, List list) {
        this.f58346a = i;
        this.f58347b = str;
        this.f58348c = list;
        this.f58349d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecj0)) {
            return false;
        }
        ecj0 ecj0Var = (ecj0) obj;
        return this.f58346a == ecj0Var.f58346a && wj50.m88271j(this.f58347b, ecj0Var.f58347b) && wj50.m88271j(this.f58348c, ecj0Var.f58348c) && wj50.m88271j(this.f58349d, ecj0Var.f58349d);
    }

    public final int hashCode() {
        return this.f58349d.hashCode() + s571.m77244c(s571.m77243b(Integer.hashCode(this.f58346a) * 31, 31, this.f58347b), 31, this.f58348c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f58346a);
        parcel.writeString(this.f58347b);
        parcel.writeStringList(this.f58348c);
        parcel.writeString(this.f58349d);
    }
}
