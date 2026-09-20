package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class k2z extends m2z {
    public static final Parcelable.Creator<k2z> CREATOR = new c2z(6);

    /* JADX INFO: renamed from: b */
    public final g2z f118703b;

    public /* synthetic */ k2z() {
        this(g2z.f76030a);
    }

    @Override // p204p.m2z
    /* JADX INFO: renamed from: c */
    public final g2z mo46503c() {
        return this.f118703b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2z) && this.f118703b == ((k2z) obj).f118703b;
    }

    public final int hashCode() {
        return this.f118703b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f118703b.name());
    }

    public k2z(g2z g2zVar) {
        super("UNPLAYED");
        this.f118703b = g2zVar;
    }
}
