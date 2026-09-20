package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public final class bon0 implements Parcelable {
    public static final Parcelable.Creator<bon0> CREATOR = new ejn0(14);

    /* JADX INFO: renamed from: a */
    public final String f29211a;

    /* JADX INFO: renamed from: b */
    public final int f29212b;

    public bon0(String str, int i) {
        this.f29211a = str;
        this.f29212b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bon0)) {
            return false;
        }
        bon0 bon0Var = (bon0) obj;
        return wj50.m88271j(this.f29211a, bon0Var.f29211a) && this.f29212b == bon0Var.f29212b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f29212b) + (this.f29211a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.f29211a);
        int i2 = this.f29212b;
        if (i2 == 1) {
            str = "BlockedAction";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str = "HostPaused";
        }
        parcel.writeString(str);
    }
}
