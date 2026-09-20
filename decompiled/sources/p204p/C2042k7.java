package p204p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.k7 */
/* JADX INFO: loaded from: classes11.dex */
public class C2042k7 implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119871a;

    /* JADX INFO: renamed from: b */
    public int f119872b;

    /* JADX INFO: renamed from: c */
    public final Object f119873c;

    public /* synthetic */ C2042k7(Object obj, int i) {
        this.f119871a = i;
        this.f119873c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f119871a) {
            case 0:
                return this.f119872b < ((AbstractC2154n7) this.f119873c).mo33075a();
            case 1:
                return this.f119872b < ((Object[]) this.f119873c).length;
            case 2:
                return this.f119872b > 0;
            case 3:
                return this.f119872b > 0;
            case 4:
                return this.f119872b < ((mw31) this.f119873c).m62986h();
            case 5:
                return this.f119872b < ((byte[]) this.f119873c).length;
            case 6:
                return this.f119872b < ((long[]) this.f119873c).length;
            case 7:
                return this.f119872b < ((short[]) this.f119873c).length;
            default:
                return this.f119872b < ((ViewGroup) this.f119873c).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f119871a) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AbstractC2154n7 abstractC2154n7 = (AbstractC2154n7) this.f119873c;
                int i = this.f119872b;
                this.f119872b = i + 1;
                return abstractC2154n7.get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.f119873c;
                    int i2 = this.f119872b;
                    this.f119872b = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f119872b--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                ktz0 ktz0Var = (ktz0) this.f119873c;
                int iMo33222e = ktz0Var.mo33222e();
                int i3 = this.f119872b;
                this.f119872b = i3 - 1;
                return ktz0Var.mo33225h(iMo33222e - i3);
            case 3:
                kzv kzvVar = (kzv) this.f119873c;
                int i4 = kzvVar.f245523c;
                int i5 = this.f119872b;
                this.f119872b = i5 - 1;
                return kzvVar.f245525e[i4 - i5];
            case 4:
                mw31 mw31Var = (mw31) this.f119873c;
                int i6 = this.f119872b;
                this.f119872b = i6 + 1;
                return mw31Var.m62987i(i6);
            case 5:
                int i7 = this.f119872b;
                byte[] bArr = (byte[]) this.f119873c;
                if (i7 >= bArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f119872b));
                }
                this.f119872b = i7 + 1;
                return new uq91(bArr[i7]);
            case 6:
                int i8 = this.f119872b;
                long[] jArr = (long[]) this.f119873c;
                if (i8 >= jArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f119872b));
                }
                this.f119872b = i8 + 1;
                return new as91(jArr[i8]);
            case 7:
                int i9 = this.f119872b;
                short[] sArr = (short[]) this.f119873c;
                if (i9 >= sArr.length) {
                    throw new NoSuchElementException(String.valueOf(this.f119872b));
                }
                this.f119872b = i9 + 1;
                return new os91(sArr[i9]);
            default:
                ViewGroup viewGroup = (ViewGroup) this.f119873c;
                int i10 = this.f119872b;
                this.f119872b = i10 + 1;
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f119871a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.f119873c;
                int i = this.f119872b - 1;
                this.f119872b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public C2042k7(ktz0 ktz0Var) {
        this.f119871a = 2;
        this.f119873c = ktz0Var;
        this.f119872b = ktz0Var.mo33222e();
    }

    public C2042k7(kzv kzvVar) {
        this.f119871a = 3;
        this.f119873c = kzvVar;
        this.f119872b = kzvVar.f245523c;
    }
}
