package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class uk91 implements Parcelable {
    public static final Parcelable.Creator<uk91> CREATOR = new f891(22);

    /* JADX INFO: renamed from: a */
    public final long f231264a;

    /* JADX INFO: renamed from: b */
    public final long f231265b;

    /* JADX INFO: renamed from: c */
    public final long f231266c;

    public uk91(long j, long j2) {
        this.f231264a = j;
        this.f231265b = j2;
        this.f231266c = j2 - j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk91)) {
            return false;
        }
        uk91 uk91Var = (uk91) obj;
        return this.f231264a == uk91Var.f231264a && this.f231265b == uk91Var.f231265b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f231265b) + (Long.hashCode(this.f231264a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f231264a);
        parcel.writeLong(this.f231265b);
    }
}
