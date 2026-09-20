package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class sua implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f214037a = 0;

    /* JADX INFO: renamed from: b */
    public int f214038b = 0;

    /* JADX INFO: renamed from: c */
    public final int f214039c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Iterable f214040d;

    public sua(zhf1 zhf1Var) {
        this.f214040d = zhf1Var;
        this.f214039c = zhf1Var.mo29248d();
    }

    /* JADX INFO: renamed from: a */
    public byte m79386a() {
        try {
            byte[] bArr = ((xj90) this.f214040d).f262074b;
            int i = this.f214038b;
            this.f214038b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f214037a) {
            case 0:
                return this.f214038b < this.f214039c;
            case 1:
                return this.f214038b < this.f214039c;
            case 2:
                return this.f214038b < this.f214039c;
            case 3:
                return this.f214038b < this.f214039c;
            case 4:
                return this.f214038b < this.f214039c;
            case 5:
                return this.f214038b < this.f214039c;
            case 6:
                return this.f214038b < this.f214039c;
            default:
                return this.f214038b < this.f214039c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f214037a) {
            case 0:
                int i = this.f214038b;
                if (i >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i + 1;
                return Byte.valueOf(((ava) this.f214040d).mo27233f(i));
            case 1:
                int i2 = this.f214038b;
                if (i2 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i2 + 1;
                return Byte.valueOf(((fva) this.f214040d).mo30596f(i2));
            case 2:
                int i3 = this.f214038b;
                if (i3 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i3 + 1;
                return Byte.valueOf(((cva) this.f214040d).mo34016m(i3));
            case 3:
                int i4 = this.f214038b;
                if (i4 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i4 + 1;
                return Byte.valueOf(((dva) this.f214040d).f53405b[i4]);
            case 4:
                return Byte.valueOf(m79386a());
            case 5:
                int i5 = this.f214038b;
                if (i5 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i5 + 1;
                return Byte.valueOf(((zhf1) this.f214040d).mo29247b(i5));
            case 6:
                int i6 = this.f214038b;
                if (i6 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i6 + 1;
                return Byte.valueOf(((rzf1) this.f214040d).mo40351b(i6));
            default:
                int i7 = this.f214038b;
                if (i7 >= this.f214039c) {
                    throw new NoSuchElementException();
                }
                this.f214038b = i7 + 1;
                return Byte.valueOf(((jah1) this.f214040d).mo41179b(i7));
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f214037a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            case 6:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public sua(rzf1 rzf1Var) {
        this.f214040d = rzf1Var;
        this.f214039c = rzf1Var.mo40353e();
    }

    public sua(jah1 jah1Var) {
        this.f214040d = jah1Var;
        this.f214039c = jah1Var.mo41180d();
    }

    public sua(ava avaVar) {
        this.f214040d = avaVar;
        this.f214039c = avaVar.size();
    }

    public sua(cva cvaVar) {
        this.f214040d = cvaVar;
        this.f214039c = cvaVar.size();
    }

    public sua(dva dvaVar) {
        this.f214040d = dvaVar;
        this.f214039c = dvaVar.size();
    }

    public sua(fva fvaVar) {
        this.f214040d = fvaVar;
        this.f214039c = fvaVar.size();
    }

    public sua(xj90 xj90Var) {
        this.f214040d = xj90Var;
        this.f214039c = xj90Var.f262074b.length;
    }
}
