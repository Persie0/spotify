package p204p;

import com.google.android.gms.common.data.DataHolder;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class bdo implements Iterator {

    /* JADX INFO: renamed from: a */
    public final sdv f26188a;

    /* JADX INFO: renamed from: b */
    public int f26189b = -1;

    public bdo(sdv sdvVar) {
        this.f26188a = sdvVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f26189b < this.f26188a.getCount() + (-1);
    }

    @Override // java.util.Iterator
    public final Object next() {
        int iIntValue;
        int iIntValue2;
        if (!hasNext()) {
            int i = this.f26189b;
            throw new NoSuchElementException(s571.m77248g(i, "Cannot advance the iterator beyond ", new StringBuilder(String.valueOf(i).length() + 35)));
        }
        int i2 = this.f26189b;
        int i3 = i2 + 1;
        this.f26189b = i3;
        sdv sdvVar = this.f26188a;
        DataHolder dataHolder = sdvVar.f208088a;
        sdvVar.m77880i();
        int iM77879f = sdvVar.m77879f(i3);
        int i4 = 0;
        if (i3 >= 0 && i3 != sdvVar.f208090c.size()) {
            if (i3 == sdvVar.f208090c.size() - 1) {
                ig31.m50506x(dataHolder);
                iIntValue = dataHolder.f1868h;
                iIntValue2 = ((Integer) sdvVar.f208090c.get(i3)).intValue();
            } else {
                iIntValue = ((Integer) sdvVar.f208090c.get(i2 + 2)).intValue();
                iIntValue2 = ((Integer) sdvVar.f208090c.get(i3)).intValue();
            }
            i4 = iIntValue - iIntValue2;
            if (i4 == 1) {
                int iM77879f2 = sdvVar.m77879f(i3);
                ig31.m50506x(dataHolder);
                dataHolder.m1502k(iM77879f2);
                i4 = 1;
            }
        }
        return sdvVar.mo53203a(iM77879f, i4);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
