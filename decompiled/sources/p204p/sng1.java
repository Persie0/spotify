package p204p;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sng1 extends zeg1 {

    /* JADX INFO: renamed from: n */
    public static final WeakReference f210933n = new WeakReference(null);

    /* JADX INFO: renamed from: m */
    public WeakReference f210934m;

    public sng1(byte[] bArr) {
        super(bArr);
        this.f210934m = f210933n;
    }

    @Override // p204p.zeg1
    /* JADX INFO: renamed from: c2 */
    public final byte[] mo29346c2() {
        byte[] bArrMo76287e2;
        synchronized (this) {
            try {
                bArrMo76287e2 = (byte[]) this.f210934m.get();
                if (bArrMo76287e2 == null) {
                    bArrMo76287e2 = mo76287e2();
                    this.f210934m = new WeakReference(bArrMo76287e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrMo76287e2;
    }

    /* JADX INFO: renamed from: e2 */
    public abstract byte[] mo76287e2();
}
