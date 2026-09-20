package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class ee0 implements ge0 {
    public static final Parcelable.Creator<ee0> CREATOR = new C2267ps(21);

    /* JADX INFO: renamed from: a */
    public final List f58631a;

    /* JADX INFO: renamed from: b */
    public final tfu f58632b;

    /* JADX INFO: renamed from: c */
    public final boolean f58633c;

    public ee0(List list, tfu tfuVar, boolean z) {
        this.f58631a = list;
        this.f58632b = tfuVar;
        this.f58633c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee0)) {
            return false;
        }
        ee0 ee0Var = (ee0) obj;
        return wj50.m88271j(this.f58631a, ee0Var.f58631a) && this.f58632b == ee0Var.f58632b && this.f58633c == ee0Var.f58633c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58633c) + ((this.f58632b.hashCode() + (this.f58631a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f58631a);
        parcel.writeString(this.f58632b.name());
        parcel.writeInt(this.f58633c ? 1 : 0);
    }
}
