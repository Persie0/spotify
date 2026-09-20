package p204p;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b661 extends d661 {

    /* JADX INFO: renamed from: d */
    public int[] f23852d;

    /* JADX INFO: renamed from: e */
    public long[] f23853e;

    /* JADX INFO: renamed from: f */
    public double[] f23854f;

    /* JADX INFO: renamed from: g */
    public String[] f23855g;

    /* JADX INFO: renamed from: h */
    public byte[][] f23856h;

    /* JADX INFO: renamed from: i */
    public Cursor f23857i;

    public b661(u561 u561Var, String str) {
        super(u561Var, str);
        this.f23852d = new int[0];
        this.f23853e = new long[0];
        this.f23854f = new double[0];
        this.f23855g = new String[0];
        this.f23856h = new byte[0][];
    }

    /* JADX INFO: renamed from: f */
    public static void m28278f(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            mif1.m61859L(25, "column index out of range");
            throw null;
        }
    }

    @Override // p204p.d661, p204p.ezx0
    /* JADX INFO: renamed from: A */
    public final void mo24840A() {
        m35056a();
        this.f23852d = new int[0];
        this.f23853e = new long[0];
        this.f23854f = new double[0];
        this.f23855g = new String[0];
        this.f23856h = new byte[0][];
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: E1 */
    public final boolean mo24841E1() {
        m35056a();
        m28280e();
        Cursor cursor = this.f23857i;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: R */
    public final void mo24842R(int i, String str) {
        m35056a();
        m28279c(3, i);
        this.f23852d[i] = 3;
        this.f23855g[i] = str;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: Y */
    public final void mo24843Y(double d) {
        m35056a();
        m28279c(2, 3);
        this.f23852d[3] = 2;
        this.f23854f[3] = d;
    }

    /* JADX INFO: renamed from: c */
    public final void m28279c(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f23852d;
        if (iArr.length < i3) {
            this.f23852d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f23853e;
            if (jArr.length < i3) {
                this.f23853e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f23854f;
            if (dArr.length < i3) {
                this.f23854f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f23855g;
            if (strArr.length < i3) {
                this.f23855g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f23856h;
        if (bArr.length < i3) {
            this.f23856h = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f45614c) {
            mo24840A();
            reset();
        }
        this.f45614c = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m28280e() {
        if (this.f23857i == null) {
            this.f23857i = this.f45612a.mo82394d0(new d501(this, 16));
        }
    }

    /* JADX INFO: renamed from: g */
    public final Cursor m28281g() {
        Cursor cursor = this.f23857i;
        if (cursor != null) {
            return cursor;
        }
        mif1.m61859L(21, "no row");
        throw null;
    }

    @Override // p204p.ezx0
    public final byte[] getBlob(int i) {
        m35056a();
        Cursor cursorM28281g = m28281g();
        m28278f(cursorM28281g, i);
        return cursorM28281g.getBlob(i);
    }

    @Override // p204p.ezx0
    public final int getColumnCount() {
        m35056a();
        m28280e();
        Cursor cursor = this.f23857i;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // p204p.ezx0
    public final String getColumnName(int i) {
        m35056a();
        m28280e();
        Cursor cursor = this.f23857i;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        m28278f(cursor, i);
        return cursor.getColumnName(i);
    }

    @Override // p204p.ezx0
    public final double getDouble(int i) {
        m35056a();
        Cursor cursorM28281g = m28281g();
        m28278f(cursorM28281g, i);
        return cursorM28281g.getDouble(i);
    }

    @Override // p204p.ezx0
    public final long getLong(int i) {
        m35056a();
        Cursor cursorM28281g = m28281g();
        m28278f(cursorM28281g, i);
        return cursorM28281g.getLong(i);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: h1 */
    public final String mo24844h1(int i) {
        m35056a();
        Cursor cursorM28281g = m28281g();
        m28278f(cursorM28281g, i);
        return cursorM28281g.getString(i);
    }

    @Override // p204p.ezx0
    public final boolean isNull(int i) {
        m35056a();
        Cursor cursorM28281g = m28281g();
        m28278f(cursorM28281g, i);
        return cursorM28281g.isNull(i);
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: q */
    public final void mo24845q(byte[] bArr, int i) {
        m35056a();
        m28279c(4, i);
        this.f23852d[i] = 4;
        this.f23856h[i] = bArr;
    }

    @Override // p204p.d661, p204p.ezx0
    public final void reset() {
        m35056a();
        Cursor cursor = this.f23857i;
        if (cursor != null) {
            cursor.close();
        }
        this.f23857i = null;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: u */
    public final void mo24846u(int i, long j) {
        m35056a();
        m28279c(1, i);
        this.f23852d[i] = 1;
        this.f23853e[i] = j;
    }

    @Override // p204p.ezx0
    /* JADX INFO: renamed from: v */
    public final void mo24847v(int i) {
        m35056a();
        m28279c(5, i);
        this.f23852d[i] = 5;
    }
}
