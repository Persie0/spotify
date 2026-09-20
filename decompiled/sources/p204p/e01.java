package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public final class e01 extends z01 implements c01 {
    public static final Parcelable.Creator<e01> CREATOR = new zz0(4);

    /* JADX INFO: renamed from: a */
    public final String f54821a;

    /* JADX INFO: renamed from: b */
    public final String f54822b;

    public e01(String str, String str2) {
        this.f54821a = str;
        this.f54822b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e01)) {
            return false;
        }
        e01 e01Var = (e01) obj;
        return wj50.m88271j(this.f54821a, e01Var.f54821a) && wj50.m88271j(this.f54822b, e01Var.f54822b);
    }

    @Override // p204p.c01
    /* JADX INFO: renamed from: g */
    public final String mo31065g() {
        return this.f54822b;
    }

    @Override // p204p.c01
    public final String getTitle() {
        return this.f54821a;
    }

    public final int hashCode() {
        return this.f54822b.hashCode() + (this.f54821a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f54821a);
        parcel.writeString(this.f54822b);
    }
}
