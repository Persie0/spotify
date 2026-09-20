package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class jec0 extends s2v implements Iterator, pq60 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f111530e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jec0(mec0 mec0Var, int i) {
        super(mec0Var);
        this.f111530e = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f111530e) {
            case 0:
                m77098b();
                int i = this.f205073a;
                mec0 mec0Var = (mec0) this.f205076d;
                if (i >= mec0Var.f142672f) {
                    throw new NoSuchElementException();
                }
                this.f205073a = i + 1;
                this.f205074b = i;
                kec0 kec0Var = new kec0(mec0Var, i);
                m77105i();
                return kec0Var;
            default:
                m77098b();
                int i2 = this.f205073a;
                mec0 mec0Var2 = (mec0) this.f205076d;
                if (i2 >= mec0Var2.f142672f) {
                    throw new NoSuchElementException();
                }
                this.f205073a = i2 + 1;
                this.f205074b = i2;
                Object[] objArr = mec0Var2.f142668b;
                wj50.m88279p(objArr);
                Object obj = objArr[this.f205074b];
                m77105i();
                return obj;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m53090o(StringBuilder sb) {
        int i = this.f205073a;
        mec0 mec0Var = (mec0) this.f205076d;
        if (i >= mec0Var.f142672f) {
            throw new NoSuchElementException();
        }
        this.f205073a = i + 1;
        this.f205074b = i;
        Object obj = mec0Var.f142667a[i];
        if (obj == mec0Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj);
        }
        sb.append('=');
        Object[] objArr = mec0Var.f142668b;
        wj50.m88279p(objArr);
        Object obj2 = objArr[this.f205074b];
        if (obj2 == mec0Var) {
            sb.append("(this Map)");
        } else {
            sb.append(obj2);
        }
        m77105i();
    }

    /* JADX INFO: renamed from: p */
    public int m53091p() {
        int i = this.f205073a;
        mec0 mec0Var = (mec0) this.f205076d;
        if (i >= mec0Var.f142672f) {
            throw new NoSuchElementException();
        }
        this.f205073a = i + 1;
        this.f205074b = i;
        Object obj = mec0Var.f142667a[i];
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Object[] objArr = mec0Var.f142668b;
        wj50.m88279p(objArr);
        Object obj2 = objArr[this.f205074b];
        int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        m77105i();
        return iHashCode2;
    }
}
