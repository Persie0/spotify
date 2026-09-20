package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class yud0 implements Parcelable {
    public static final Parcelable.Creator<yud0> CREATOR = new jfd0(16);

    /* JADX INFO: renamed from: a */
    public final uk91 f276331a;

    /* JADX INFO: renamed from: b */
    public final bes f276332b;

    public yud0(uk91 uk91Var, bes besVar) {
        this.f276331a = uk91Var;
        this.f276332b = besVar;
    }

    /* JADX INFO: renamed from: c */
    public static yud0 m94654c(yud0 yud0Var, uk91 uk91Var, bes besVar, int i) {
        if ((i & 1) != 0) {
            uk91Var = yud0Var.f276331a;
        }
        if ((i & 2) != 0) {
            besVar = yud0Var.f276332b;
        }
        yud0Var.getClass();
        return new yud0(uk91Var, besVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yud0)) {
            return false;
        }
        yud0 yud0Var = (yud0) obj;
        return wj50.m88271j(this.f276331a, yud0Var.f276331a) && wj50.m88271j(this.f276332b, yud0Var.f276332b);
    }

    public final int hashCode() {
        return this.f276332b.hashCode() + (this.f276331a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f276331a, i);
        parcel.writeParcelable(this.f276332b, i);
    }

    public /* synthetic */ yud0(uk91 uk91Var) {
        this(uk91Var, aes.f14944a);
    }
}
