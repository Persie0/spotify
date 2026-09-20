package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class xr01 implements Parcelable {
    public static final Parcelable.Creator<xr01> CREATOR = new sp01(16);

    /* JADX INFO: renamed from: a */
    public final dd41 f265192a;

    public xr01(dd41 dd41Var) {
        this.f265192a = dd41Var;
        yr01.m94402a(dd41Var);
    }

    /* JADX INFO: renamed from: c */
    public final String m91910c() {
        return String.valueOf(this.f265192a.f47707a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr01) && wj50.m88271j(this.f265192a, ((xr01) obj).f265192a);
    }

    /* JADX INFO: renamed from: g */
    public final String m91911g() {
        String strM35694A = this.f265192a.m35694A();
        wj50.m88279p(strM35694A);
        return strM35694A;
    }

    public final int hashCode() {
        return this.f265192a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ehf1.m38956v(this.f265192a, parcel);
    }
}
