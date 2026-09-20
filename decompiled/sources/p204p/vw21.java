package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class vw21 implements Iterator {

    /* JADX INFO: renamed from: b */
    public static final vw21 f245382b = new vw21(0);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f245383a;

    public /* synthetic */ vw21(int i) {
        this.f245383a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f245383a) {
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f245383a) {
            case 0:
                throw new NoSuchElementException();
            default:
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f245383a) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
