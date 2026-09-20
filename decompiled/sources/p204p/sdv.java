package p204p;

import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sdv implements Iterable, Closeable {

    /* JADX INFO: renamed from: a */
    public final DataHolder f208088a;

    /* JADX INFO: renamed from: b */
    public boolean f208089b = false;

    /* JADX INFO: renamed from: c */
    public ArrayList f208090c;

    public sdv(DataHolder dataHolder) {
        this.f208088a = dataHolder;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo53203a(int i, int i2);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m77878e();
    }

    /* JADX INFO: renamed from: e */
    public final void m77878e() {
        DataHolder dataHolder = this.f208088a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m77879f(int i) {
        if (i >= 0 && i < this.f208090c.size()) {
            return ((Integer) this.f208090c.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 42);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int getCount() {
        m77880i();
        return this.f208090c.size();
    }

    /* JADX INFO: renamed from: i */
    public final void m77880i() {
        synchronized (this) {
            try {
                if (!this.f208089b) {
                    DataHolder dataHolder = this.f208088a;
                    ig31.m50506x(dataHolder);
                    int i = dataHolder.f1868h;
                    ArrayList arrayList = new ArrayList();
                    this.f208090c = arrayList;
                    if (i > 0) {
                        arrayList.add(0);
                        int iM1502k = this.f208088a.m1502k(0);
                        DataHolder dataHolder2 = this.f208088a;
                        dataHolder2.m1503n0(0, "path");
                        String string = dataHolder2.f1864d[iM1502k].getString(0, dataHolder2.f1863c.getInt("path"));
                        for (int i2 = 1; i2 < i; i2++) {
                            int iM1502k2 = this.f208088a.m1502k(i2);
                            DataHolder dataHolder3 = this.f208088a;
                            dataHolder3.m1503n0(i2, "path");
                            String string2 = dataHolder3.f1864d[iM1502k2].getString(i2, dataHolder3.f1863c.getInt("path"));
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder("path".length() + 42 + String.valueOf(i2).length() + 14 + String.valueOf(iM1502k2).length());
                                sb.append("Missing value for markerColumn: ");
                                sb.append("path");
                                sb.append(", at row: ");
                                sb.append(i2);
                                sb.append(", for window: ");
                                sb.append(iM1502k2);
                                throw new NullPointerException(sb.toString());
                            }
                            if (!string2.equals(string)) {
                                this.f208090c.add(Integer.valueOf(i2));
                                string = string2;
                            }
                        }
                    }
                    this.f208089b = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new bdo(this);
    }
}
