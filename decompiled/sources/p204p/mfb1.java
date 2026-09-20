package p204p;

import android.os.Parcel;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class mfb1 extends lfb1 {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f143020d;

    /* JADX INFO: renamed from: e */
    public final Parcel f143021e;

    /* JADX INFO: renamed from: f */
    public final int f143022f;

    /* JADX INFO: renamed from: g */
    public final int f143023g;

    /* JADX INFO: renamed from: h */
    public final String f143024h;

    /* JADX INFO: renamed from: i */
    public int f143025i;

    /* JADX INFO: renamed from: j */
    public int f143026j;

    /* JADX INFO: renamed from: k */
    public int f143027k;

    public mfb1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new uj5(0), new uj5(0), new uj5(0));
    }

    @Override // p204p.lfb1
    /* JADX INFO: renamed from: a */
    public final mfb1 mo58850a() {
        Parcel parcel = this.f143021e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f143026j;
        if (i == this.f143022f) {
            i = this.f143023g;
        }
        return new mfb1(parcel, iDataPosition, i, dq60.m36616p(this.f143024h, "  ", new StringBuilder()), this.f132884a, this.f132885b, this.f132886c);
    }

    @Override // p204p.lfb1
    /* JADX INFO: renamed from: e */
    public final boolean mo58854e(int i) {
        while (this.f143026j < this.f143023g) {
            int i2 = this.f143027k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f143026j;
            Parcel parcel = this.f143021e;
            parcel.setDataPosition(i3);
            int i4 = parcel.readInt();
            this.f143027k = parcel.readInt();
            this.f143026j += i4;
        }
        return this.f143027k == i;
    }

    @Override // p204p.lfb1
    /* JADX INFO: renamed from: i */
    public final void mo58858i(int i) {
        int i2 = this.f143025i;
        SparseIntArray sparseIntArray = this.f143020d;
        Parcel parcel = this.f143021e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.f143025i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public mfb1(Parcel parcel, int i, int i2, String str, uj5 uj5Var, uj5 uj5Var2, uj5 uj5Var3) {
        super(uj5Var, uj5Var2, uj5Var3);
        this.f143020d = new SparseIntArray();
        this.f143025i = -1;
        this.f143027k = -1;
        this.f143021e = parcel;
        this.f143022f = i;
        this.f143023g = i2;
        this.f143026j = i;
        this.f143024h = str;
    }
}
