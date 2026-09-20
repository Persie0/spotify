package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class qdj0 implements Parcelable {
    public static final Parcelable.Creator<qdj0> CREATOR = new rri0(27);

    /* JADX INFO: renamed from: a */
    public final wwu f187700a;

    /* JADX INFO: renamed from: b */
    public final String f187701b;

    /* JADX INFO: renamed from: c */
    public final String f187702c;

    public qdj0(wwu wwuVar, String str, String str2) {
        this.f187700a = wwuVar;
        this.f187701b = str;
        this.f187702c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdj0)) {
            return false;
        }
        qdj0 qdj0Var = (qdj0) obj;
        return wj50.m88271j(this.f187700a, qdj0Var.f187700a) && wj50.m88271j(this.f187701b, qdj0Var.f187701b) && wj50.m88271j(this.f187702c, qdj0Var.f187702c);
    }

    public final int hashCode() {
        return this.f187702c.hashCode() + s571.m77243b(this.f187700a.hashCode() * 31, 31, this.f187701b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f187700a, i);
        parcel.writeString(this.f187701b);
        parcel.writeString(this.f187702c);
    }
}
