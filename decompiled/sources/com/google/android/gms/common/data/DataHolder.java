package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Map;
import p204p.AbstractC2206o9;
import p204p.alf1;
import p204p.g2a1;
import p204p.ig31;
import p204p.tne1;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class DataHolder extends AbstractC2206o9 implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new tne1(23);

    /* JADX INFO: renamed from: X */
    public static final g2a1 f1860X = new g2a1(new String[0]);

    /* JADX INFO: renamed from: a */
    public final int f1861a;

    /* JADX INFO: renamed from: b */
    public final String[] f1862b;

    /* JADX INFO: renamed from: c */
    public Bundle f1863c;

    /* JADX INFO: renamed from: d */
    public final CursorWindow[] f1864d;

    /* JADX INFO: renamed from: e */
    public final int f1865e;

    /* JADX INFO: renamed from: f */
    public final Bundle f1866f;

    /* JADX INFO: renamed from: g */
    public int[] f1867g;

    /* JADX INFO: renamed from: h */
    public int f1868h;

    /* JADX INFO: renamed from: i */
    public boolean f1869i;

    /* JADX INFO: renamed from: t */
    public final boolean f1870t;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f1869i = false;
        this.f1870t = true;
        this.f1861a = i;
        this.f1862b = strArr;
        this.f1864d = cursorWindowArr;
        this.f1865e = i2;
        this.f1866f = bundle;
    }

    /* JADX INFO: renamed from: M */
    public final void m1501M() {
        this.f1863c = new Bundle();
        int i = 0;
        while (true) {
            String[] strArr = this.f1862b;
            if (i >= strArr.length) {
                break;
            }
            this.f1863c.putInt(strArr[i], i);
            i++;
        }
        CursorWindow[] cursorWindowArr = this.f1864d;
        this.f1867g = new int[cursorWindowArr.length];
        int numRows = 0;
        for (int i2 = 0; i2 < cursorWindowArr.length; i2++) {
            this.f1867g[i2] = numRows;
            numRows += cursorWindowArr[i2].getNumRows() - (numRows - cursorWindowArr[i2].getStartPosition());
        }
        this.f1868h = numRows;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f1869i) {
                    this.f1869i = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f1864d;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.f1870t && this.f1864d.length > 0) {
                synchronized (this) {
                    z = this.f1869i;
                }
                if (!z) {
                    close();
                    new StringBuilder(String.valueOf(toString()).length() + 178);
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m1502k(int i) {
        int length;
        int i2 = 0;
        ig31.m50471A(i >= 0 && i < this.f1868h);
        while (true) {
            int[] iArr = this.f1867g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1503n0(int i, String str) {
        boolean z;
        Bundle bundle = this.f1863c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        synchronized (this) {
            z = this.f1869i;
        }
        if (z) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f1868h) {
            throw new CursorIndexOutOfBoundsException(i, this.f1868h);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM26329l = alf1.m26329l(parcel);
        alf1.m26309O(parcel, 1, this.f1862b);
        alf1.m26311Q(parcel, 2, this.f1864d, i);
        alf1.m26302H(parcel, 3, this.f1865e);
        alf1.m26297C(parcel, 4, this.f1866f);
        alf1.m26302H(parcel, 1000, this.f1861a);
        alf1.m26331n(iM26329l, parcel);
        if ((i & 1) != 0) {
            close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.CursorWindow] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public DataHolder(g2a1 g2a1Var, int i) {
        ?? r8;
        CursorWindow[] cursorWindowArr;
        boolean zPutDouble;
        CursorWindow cursorWindow;
        String[] strArrM43384p = g2a1Var.m43384p();
        boolean z = false;
        if (g2a1Var.m43384p().length == 0) {
            cursorWindowArr = new CursorWindow[0];
        } else {
            ArrayList arrayListM43385q = g2a1Var.m43385q();
            int size = arrayListM43385q.size();
            CursorWindow cursorWindow2 = new CursorWindow(false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(cursorWindow2);
            cursorWindow2.setNumColumns(g2a1Var.m43384p().length);
            int i2 = 0;
            boolean z2 = false;
            while (i2 < size) {
                try {
                    r8 = cursorWindow2;
                    boolean zAllocRow = r8.allocRow();
                    ?? r9 = r8;
                    if (!zAllocRow) {
                        new StringBuilder(String.valueOf(i2).length() + 61);
                        cursorWindow = new CursorWindow(z);
                        cursorWindow.setStartPosition(i2);
                        cursorWindow.setNumColumns(g2a1Var.m43384p().length);
                        arrayList.add(cursorWindow);
                        if (!cursorWindow.allocRow()) {
                            r9 = cursorWindow;
                            arrayList.remove(cursorWindow);
                            cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                        }
                    }
                    r9 = cursorWindow;
                    Map map = (Map) arrayListM43385q.get(i2);
                    boolean zPutNull = true;
                    ?? r13 = z;
                    while (true) {
                        if (r13 >= g2a1Var.m43384p().length) {
                            z2 = zPutNull ? false : z2;
                            i2++;
                            z = false;
                            r8 = r9;
                        } else if (zPutNull) {
                            String str = g2a1Var.m43384p()[r13];
                            Object obj = map.get(str);
                            if (obj == null) {
                                zPutNull = r9.putNull(i2, r13);
                            } else {
                                if (obj instanceof String) {
                                    zPutDouble = r9.putString((String) obj, i2, r13);
                                } else if (obj instanceof Long) {
                                    zPutDouble = r9.putLong(((Long) obj).longValue(), i2, r13);
                                } else if (obj instanceof Integer) {
                                    zPutDouble = r9.putLong(((Integer) obj).intValue(), i2, r13);
                                } else if (obj instanceof Boolean) {
                                    zPutDouble = r9.putLong(true != ((Boolean) obj).booleanValue() ? 0L : 1L, i2, r13);
                                } else if (obj instanceof byte[]) {
                                    zPutDouble = r9.putBlob((byte[]) obj, i2, r13);
                                } else if (obj instanceof Double) {
                                    zPutDouble = r9.putDouble(((Double) obj).doubleValue(), i2, r13);
                                } else {
                                    if (!(obj instanceof Float)) {
                                        String string = obj.toString();
                                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 32 + string.length());
                                        sb.append("Unsupported object for column ");
                                        sb.append(str);
                                        sb.append(": ");
                                        sb.append(string);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    zPutDouble = r9.putDouble(((Float) obj).floatValue(), i2, r13);
                                }
                                zPutNull = zPutDouble;
                            }
                            r13++;
                        }
                        if (z2) {
                            throw new zac();
                        }
                        new StringBuilder(String.valueOf(i2).length() + 63);
                        r9.freeLastRow();
                        CursorWindow cursorWindow3 = new CursorWindow(false);
                        cursorWindow3.setStartPosition(i2);
                        cursorWindow3.setNumColumns(g2a1Var.m43384p().length);
                        arrayList.add(cursorWindow3);
                        i2--;
                        z2 = true;
                        r9 = cursorWindow3;
                        i2++;
                        z = false;
                        r8 = r9;
                    }
                } catch (RuntimeException e) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((CursorWindow) arrayList.get(i3)).close();
                    }
                    throw e;
                }
            }
            r8 = cursorWindow2;
            cursorWindowArr = (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
        }
        this.f1869i = false;
        this.f1870t = true;
        this.f1861a = 1;
        ig31.m50506x(strArrM43384p);
        this.f1862b = strArrM43384p;
        ig31.m50506x(cursorWindowArr);
        this.f1864d = cursorWindowArr;
        this.f1865e = i;
        this.f1866f = null;
        m1501M();
    }
}
