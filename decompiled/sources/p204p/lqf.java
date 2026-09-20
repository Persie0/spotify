package p204p;

import java.util.AbstractMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lqf implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136034a = 2;

    /* JADX INFO: renamed from: b */
    public int f136035b;

    /* JADX INFO: renamed from: c */
    public int f136036c;

    /* JADX INFO: renamed from: d */
    public int f136037d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractMap f136038e;

    public lqf(zif1 zif1Var) {
        this.f136038e = zif1Var;
        this.f136035b = zif1Var.f283159e;
        this.f136036c = zif1Var.isEmpty() ? -1 : 0;
        this.f136037d = -1;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo54089a(int i);

    /* JADX INFO: renamed from: b */
    public abstract Object mo41666b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f136034a) {
            case 0:
                return this.f136036c >= 0;
            case 1:
                return this.f136036c >= 0;
            default:
                return this.f136036c >= 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f136034a) {
            case 0:
                nqf nqfVar = (nqf) this.f136038e;
                if (nqfVar.f157265e != this.f136035b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.f136036c;
                this.f136037d = i;
                Object objMo54089a = mo54089a(i);
                int i2 = this.f136036c + 1;
                if (i2 >= nqfVar.f157266f) {
                    i2 = -1;
                }
                this.f136036c = i2;
                return objMo54089a;
            case 1:
                zif1 zif1Var = (zif1) this.f136038e;
                if (zif1Var.f283159e != this.f136035b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i3 = this.f136036c;
                this.f136037d = i3;
                Object objMo41666b = mo41666b(i3);
                int i4 = this.f136036c + 1;
                if (i4 >= zif1Var.f283160f) {
                    i4 = -1;
                }
                this.f136036c = i4;
                return objMo41666b;
            default:
                fug1 fug1Var = (fug1) this.f136038e;
                if (fug1Var.f73500e != this.f136035b) {
                    throw new ConcurrentModificationException();
                }
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i5 = this.f136036c;
                this.f136037d = i5;
                Object objMo41666b2 = mo41666b(i5);
                int i6 = this.f136036c + 1;
                if (i6 >= fug1Var.f73501f) {
                    i6 = -1;
                }
                this.f136036c = i6;
                return objMo41666b2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f136034a) {
            case 0:
                nqf nqfVar = (nqf) this.f136038e;
                if (nqfVar.f157265e != this.f136035b) {
                    throw new ConcurrentModificationException();
                }
                c95.m31856v(this.f136037d >= 0, "no calls to next() since the last call to remove()");
                this.f136035b += 32;
                nqfVar.remove(nqfVar.m65424k()[this.f136037d]);
                this.f136036c--;
                this.f136037d = -1;
                return;
            case 1:
                zif1 zif1Var = (zif1) this.f136038e;
                int i = zif1Var.f283159e;
                int i2 = this.f136035b;
                if (i != i2) {
                    throw new ConcurrentModificationException();
                }
                int i3 = this.f136037d;
                if (!(i3 >= 0)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.f136035b = i2 + 32;
                zif1Var.remove(zif1Var.m96205b()[i3]);
                this.f136036c--;
                this.f136037d = -1;
                return;
            default:
                fug1 fug1Var = (fug1) this.f136038e;
                if (fug1Var.f73500e != this.f136035b) {
                    throw new ConcurrentModificationException();
                }
                bnf1.m29983s(this.f136037d >= 0, "no calls to next() since the last call to remove()");
                this.f136035b += 32;
                fug1Var.remove(fug1Var.m42729a()[this.f136037d]);
                this.f136036c--;
                this.f136037d = -1;
                return;
        }
    }

    public lqf(fug1 fug1Var) {
        Objects.requireNonNull(fug1Var);
        this.f136038e = fug1Var;
        this.f136035b = fug1Var.f73500e;
        this.f136036c = fug1Var.isEmpty() ? -1 : 0;
        this.f136037d = -1;
    }

    public lqf(nqf nqfVar) {
        this.f136038e = nqfVar;
        this.f136035b = nqfVar.f157265e;
        this.f136036c = nqfVar.isEmpty() ? -1 : 0;
        this.f136037d = -1;
    }
}
