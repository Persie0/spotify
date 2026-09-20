package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class j2z extends m2z {
    public static final Parcelable.Creator<j2z> CREATOR = new c2z(5);

    /* JADX INFO: renamed from: b */
    public final g2z f108194b;

    public /* synthetic */ j2z() {
        this(g2z.f76030a);
    }

    @Override // p204p.m2z
    /* JADX INFO: renamed from: c */
    public final g2z mo46503c() {
        return this.f108194b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2z) && this.f108194b == ((j2z) obj).f108194b;
    }

    public final int hashCode() {
        return this.f108194b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f108194b.name());
    }

    public j2z(g2z g2zVar) {
        super("INPROGRESS");
        this.f108194b = g2zVar;
    }
}
