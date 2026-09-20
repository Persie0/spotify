package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class h2z extends m2z {
    public static final Parcelable.Creator<h2z> CREATOR = new c2z(3);

    /* JADX INFO: renamed from: b */
    public final g2z f87093b;

    public /* synthetic */ h2z() {
        this(g2z.f76031b);
    }

    @Override // p204p.m2z
    /* JADX INFO: renamed from: c */
    public final g2z mo46503c() {
        return this.f87093b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2z) && this.f87093b == ((h2z) obj).f87093b;
    }

    public final int hashCode() {
        return this.f87093b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f87093b.name());
    }

    public h2z(g2z g2zVar) {
        super("DOWNLOADED");
        this.f87093b = g2zVar;
    }
}
