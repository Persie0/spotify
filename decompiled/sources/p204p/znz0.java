package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class znz0 implements Parcelable {
    public static final Parcelable.Creator<znz0> CREATOR = new vcz0(9);

    /* JADX INFO: renamed from: a */
    public final Set f284603a;

    /* JADX INFO: renamed from: b */
    public final boolean f284604b;

    public znz0(Set set, boolean z) {
        this.f284603a = set;
        this.f284604b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znz0)) {
            return false;
        }
        znz0 znz0Var = (znz0) obj;
        return wj50.m88271j(this.f284603a, znz0Var.f284603a) && this.f284604b == znz0Var.f284604b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284604b) + (this.f284603a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator itM64022o = nap.m64022o(this.f284603a, parcel);
        while (itM64022o.hasNext()) {
            parcel.writeParcelable((Parcelable) itM64022o.next(), i);
        }
        parcel.writeInt(this.f284604b ? 1 : 0);
    }
}
