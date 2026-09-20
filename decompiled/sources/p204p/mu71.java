package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes6.dex */
public final class mu71 implements pu71 {
    public static final Parcelable.Creator<mu71> CREATOR = new sr71(1);

    /* JADX INFO: renamed from: a */
    public final long f147265a;

    public /* synthetic */ mu71(long j) {
        this.f147265a = j;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m62836c(long j, long j2) {
        return j == j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mu71) {
            return this.f147265a == ((mu71) obj).f147265a;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long m62837g() {
        return this.f147265a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f147265a);
    }

    public final String toString() {
        return edb.m38562k(this.f147265a, "Creator(ms=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f147265a);
    }
}
