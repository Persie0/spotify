package p204p;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class e4g1 extends AbstractC2206o9 {
    public static final Parcelable.Creator<e4g1> CREATOR = new xvf1(20);

    /* JADX INFO: renamed from: a */
    public final int f56085a;

    /* JADX INFO: renamed from: b */
    public final String f56086b;

    /* JADX INFO: renamed from: c */
    public final byte[] f56087c;

    /* JADX INFO: renamed from: d */
    public final String f56088d;

    public e4g1(int i, String str, String str2, byte[] bArr) {
        this.f56085a = i;
        this.f56086b = str;
        this.f56087c = bArr;
        this.f56088d = str2;
    }

    public final String toString() {
        byte[] bArr = this.f56087c;
        String string = (bArr == null ? "null" : Integer.valueOf(bArr.length)).toString();
        StringBuilder sb = new StringBuilder("MessageEventParcelable[");
        sb.append(this.f56085a);
        sb.append(",");
        sb.append(this.f56086b);
        sb.append(", size=");
        return dq60.m36616p(string, "]", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26314T = alf1.m26314T(20293, parcel);
        alf1.m26313S(parcel, 2, 4);
        parcel.writeInt(this.f56085a);
        alf1.m26308N(parcel, 3, this.f56086b);
        alf1.m26298D(parcel, 4, this.f56087c);
        alf1.m26308N(parcel, 5, this.f56088d);
        alf1.m26316V(iM26314T, parcel);
    }
}
