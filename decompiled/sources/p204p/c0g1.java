package p204p;

import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class c0g1 extends g5f1 {
    /* JADX INFO: renamed from: j2 */
    public final void m31141j2(byte[] bArr, boolean z) {
        Parcel parcelM43604d2 = m43604d2();
        int i = qmf1.f190217a;
        parcelM43604d2.writeInt(z ? 1 : 0);
        parcelM43604d2.writeByteArray(bArr);
        try {
            this.f76674l.transact(1, parcelM43604d2, null, 1);
        } finally {
            parcelM43604d2.recycle();
        }
    }
}
