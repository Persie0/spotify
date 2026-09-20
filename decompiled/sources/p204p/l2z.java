package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class l2z extends m2z {
    public static final Parcelable.Creator<l2z> CREATOR = new c2z(7);

    /* JADX INFO: renamed from: b */
    public final g2z f129129b;

    public /* synthetic */ l2z() {
        this(g2z.f76031b);
    }

    @Override // p204p.m2z
    /* JADX INFO: renamed from: c */
    public final g2z mo46503c() {
        return this.f129129b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2z) && this.f129129b == ((l2z) obj).f129129b;
    }

    public final int hashCode() {
        return this.f129129b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f129129b.name());
    }

    public l2z(g2z g2zVar) {
        super("VIDEO");
        this.f129129b = g2zVar;
    }
}
