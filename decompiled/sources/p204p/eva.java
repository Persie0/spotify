package p204p;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class eva extends OutputStream {

    /* JADX INFO: renamed from: g */
    public static final byte[] f63188g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f63189h = new byte[0];

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63190a;

    /* JADX INFO: renamed from: b */
    public final int f63191b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f63192c;

    /* JADX INFO: renamed from: d */
    public int f63193d;

    /* JADX INFO: renamed from: e */
    public byte[] f63194e;

    /* JADX INFO: renamed from: f */
    public int f63195f;

    public eva(int i) {
        this.f63190a = i;
        switch (i) {
            case 1:
                this.f63191b = 128;
                this.f63192c = new ArrayList();
                this.f63194e = new byte[128];
                break;
            default:
                this.f63191b = 128;
                this.f63192c = new ArrayList();
                this.f63194e = new byte[128];
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40101a(int i) {
        this.f63192c.add(new xj90(this.f63194e));
        int length = this.f63193d + this.f63194e.length;
        this.f63193d = length;
        this.f63194e = new byte[Math.max(this.f63191b, Math.max(i, length >>> 1))];
        this.f63195f = 0;
    }

    /* JADX INFO: renamed from: c */
    public void m40102c() {
        int i = this.f63195f;
        byte[] bArr = this.f63194e;
        int length = bArr.length;
        ArrayList arrayList = this.f63192c;
        if (i >= length) {
            arrayList.add(new xj90(this.f63194e));
            this.f63194e = f63188g;
        } else if (i > 0) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            arrayList.add(new xj90(bArr2));
        }
        this.f63193d += this.f63195f;
        this.f63195f = 0;
    }

    /* JADX INFO: renamed from: e */
    public synchronized hva m40103e() {
        ArrayList arrayList;
        m40102c();
        arrayList = this.f63192c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((hva) it.next());
            }
            arrayList = arrayList2;
        }
        return arrayList.isEmpty() ? hva.f95637a : hva.m48761a(arrayList.iterator(), arrayList.size());
    }

    /* JADX INFO: renamed from: f */
    public void m40104f(int i) {
        this.f63192c.add(new r9f1(this.f63194e));
        int length = this.f63193d + this.f63194e.length;
        this.f63193d = length;
        this.f63194e = new byte[Math.max(this.f63191b, Math.max(i, length >>> 1))];
        this.f63195f = 0;
    }

    public final String toString() {
        int i;
        int i2;
        switch (this.f63190a) {
            case 0:
                String hexString = Integer.toHexString(System.identityHashCode(this));
                synchronized (this) {
                    i = this.f63193d + this.f63195f;
                }
                return String.format("<ByteString.Output@%s size=%d>", hexString, Integer.valueOf(i));
            default:
                Locale locale = Locale.ROOT;
                String hexString2 = Integer.toHexString(System.identityHashCode(this));
                synchronized (this) {
                    i2 = this.f63193d + this.f63195f;
                }
                return "<ByteString.Output@" + hexString2 + " size=" + i2 + ">";
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        int i2 = this.f63190a;
        synchronized (this) {
            switch (i2) {
                case 0:
                    try {
                        if (this.f63195f == this.f63194e.length) {
                            m40101a(1);
                        }
                        byte[] bArr = this.f63194e;
                        int i3 = this.f63195f;
                        this.f63195f = i3 + 1;
                        bArr[i3] = (byte) i;
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                default:
                    try {
                        if (this.f63195f == this.f63194e.length) {
                            m40104f(1);
                        }
                        byte[] bArr2 = this.f63194e;
                        int i4 = this.f63195f;
                        this.f63195f = i4 + 1;
                        bArr2[i4] = (byte) i;
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
            }
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        int i3 = this.f63190a;
        synchronized (this) {
            switch (i3) {
                case 0:
                    try {
                        byte[] bArr2 = this.f63194e;
                        int length = bArr2.length;
                        int i4 = this.f63195f;
                        if (i2 <= length - i4) {
                            System.arraycopy(bArr, i, bArr2, i4, i2);
                            this.f63195f += i2;
                        } else {
                            int length2 = bArr2.length - i4;
                            System.arraycopy(bArr, i, bArr2, i4, length2);
                            int i5 = i2 - length2;
                            m40101a(i5);
                            System.arraycopy(bArr, i + length2, this.f63194e, 0, i5);
                            this.f63195f = i5;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                default:
                    byte[] bArr3 = this.f63194e;
                    int length3 = bArr3.length;
                    int i6 = this.f63195f;
                    int i7 = length3 - i6;
                    if (i2 <= i7) {
                        System.arraycopy(bArr, i, bArr3, i6, i2);
                        this.f63195f += i2;
                        return;
                    }
                    System.arraycopy(bArr, i, bArr3, i6, i7);
                    int i8 = i2 - i7;
                    m40104f(i8);
                    System.arraycopy(bArr, i + i7, this.f63194e, 0, i8);
                    this.f63195f = i8;
                    return;
            }
        }
    }
}
