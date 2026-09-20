package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes5.dex */
public final class ntd implements qtd {
    public static final Parcelable.Creator<ntd> CREATOR = new fjd(11);

    /* JADX INFO: renamed from: a */
    public final String f158049a;

    /* JADX INFO: renamed from: b */
    public final String f158050b;

    /* JADX INFO: renamed from: c */
    public final int f158051c;

    public ntd(String str, String str2, int i) {
        this.f158049a = str;
        this.f158050b = str2;
        this.f158051c = i;
    }

    @Override // p204p.qtd
    /* JADX INFO: renamed from: a */
    public final String mo65613a() {
        return this.f158049a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ntd)) {
            return false;
        }
        ntd ntdVar = (ntd) obj;
        return wj50.m88271j(this.f158049a, ntdVar.f158049a) && wj50.m88271j(this.f158050b, ntdVar.f158050b) && this.f158051c == ntdVar.f158051c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f158051c) + s571.m77243b(this.f158049a.hashCode() * 31, 31, this.f158050b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f158049a);
        parcel.writeString(this.f158050b);
        parcel.writeInt(this.f158051c);
    }
}
