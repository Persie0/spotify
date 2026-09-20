package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class i2z extends m2z {
    public static final Parcelable.Creator<i2z> CREATOR = new c2z(4);

    /* JADX INFO: renamed from: b */
    public final g2z f97944b;

    public /* synthetic */ i2z() {
        this(g2z.f76030a);
    }

    @Override // p204p.m2z
    /* JADX INFO: renamed from: c */
    public final g2z mo46503c() {
        return this.f97944b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2z) && this.f97944b == ((i2z) obj).f97944b;
    }

    public final int hashCode() {
        return this.f97944b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f97944b.name());
    }

    public i2z(g2z g2zVar) {
        super("FINISHED");
        this.f97944b = g2zVar;
    }
}
