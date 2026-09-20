package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class mui0 implements Parcelable {
    public static final Parcelable.Creator<mui0> CREATOR = new rri0(4);

    /* JADX INFO: renamed from: a */
    public final lui0 f147366a;

    /* JADX INFO: renamed from: b */
    public final boolean f147367b;

    /* JADX INFO: renamed from: c */
    public final boolean f147368c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1808eb f147369d;

    static {
        new mui0(null, 15);
    }

    public mui0(lui0 lui0Var, boolean z, boolean z2, AbstractC1808eb abstractC1808eb) {
        this.f147366a = lui0Var;
        this.f147367b = z;
        this.f147368c = z2;
        this.f147369d = abstractC1808eb;
    }

    /* JADX INFO: renamed from: c */
    public static mui0 m62875c(mui0 mui0Var, lui0 lui0Var, boolean z, AbstractC1808eb abstractC1808eb, int i) {
        if ((i & 1) != 0) {
            lui0Var = mui0Var.f147366a;
        }
        boolean z2 = (i & 2) != 0 ? mui0Var.f147367b : false;
        if ((i & 4) != 0) {
            z = mui0Var.f147368c;
        }
        if ((i & 8) != 0) {
            abstractC1808eb = mui0Var.f147369d;
        }
        mui0Var.getClass();
        return new mui0(lui0Var, z2, z, abstractC1808eb);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mui0)) {
            return false;
        }
        mui0 mui0Var = (mui0) obj;
        return wj50.m88271j(this.f147366a, mui0Var.f147366a) && this.f147367b == mui0Var.f147367b && this.f147368c == mui0Var.f147368c && wj50.m88271j(this.f147369d, mui0Var.f147369d);
    }

    /* JADX INFO: renamed from: g */
    public final lui0 m62876g() {
        return this.f147366a;
    }

    public final int hashCode() {
        return this.f147369d.hashCode() + s571.m77245d(s571.m77245d(this.f147366a.hashCode() * 31, 31, this.f147367b), 31, this.f147368c);
    }

    public final String toString() {
        return "NameModel(nameState=" + qpv0.f191387a.mo54112b(this.f147366a.getClass()).mo29111F() + ", isLoading=" + this.f147367b + ", isScreenReaderEnabled=" + this.f147368c + ", acceptanceModel=" + this.f147369d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f147366a, i);
        parcel.writeInt(this.f147367b ? 1 : 0);
        parcel.writeInt(this.f147368c ? 1 : 0);
        parcel.writeParcelable(this.f147369d, i);
    }

    public /* synthetic */ mui0(kui0 kui0Var, int i) {
        this((i & 1) != 0 ? jui0.f116116b : kui0Var, false, false, new C1735cb(new C2607yb(false), new C2447ub(false, false), new C2208ob(false, false), new C1974ic(false, false), false));
    }
}
