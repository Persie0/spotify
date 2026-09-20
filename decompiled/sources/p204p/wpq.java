package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class wpq implements Iterator, pq60 {

    /* JADX INFO: renamed from: a */
    public int f253807a = -1;

    /* JADX INFO: renamed from: b */
    public int f253808b;

    /* JADX INFO: renamed from: c */
    public int f253809c;

    /* JADX INFO: renamed from: d */
    public b450 f253810d;

    /* JADX INFO: renamed from: e */
    public int f253811e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xpq f253812f;

    public wpq(xpq xpqVar) {
        this.f253812f = xpqVar;
        int iM63437n = n0e1.m63437n(0, 0, xpqVar.f264705a.length());
        this.f253808b = iM63437n;
        this.f253809c = iM63437n;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX INFO: renamed from: a */
    public final void m88721a() {
        pqm0 pqm0Var;
        int i = this.f253809c;
        if (i < 0) {
            this.f253807a = 0;
            this.f253810d = null;
            return;
        }
        xpq xpqVar = this.f253812f;
        int i2 = xpqVar.f264706b;
        if (i2 > 0) {
            int i3 = this.f253811e + 1;
            this.f253811e = i3;
            if (i3 >= i2) {
                this.f253810d = new b450(this.f253808b, wl51.m88453C0(xpqVar.f264705a), 1);
                this.f253809c = -1;
            } else if (i > xpqVar.f264705a.length() && (pqm0Var = (pqm0) xpqVar.f264707c.invoke(xpqVar.f264705a, Integer.valueOf(this.f253809c))) != null) {
                int iIntValue = ((Number) pqm0Var.f180350a).intValue();
                int iIntValue2 = ((Number) pqm0Var.f180351b).intValue();
                this.f253810d = n0e1.m63417Y(this.f253808b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f253808b = i4;
                this.f253809c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f253810d = new b450(this.f253808b, wl51.m88453C0(xpqVar.f264705a), 1);
                this.f253809c = -1;
            }
        } else if (i > xpqVar.f264705a.length()) {
            this.f253810d = new b450(this.f253808b, wl51.m88453C0(xpqVar.f264705a), 1);
            this.f253809c = -1;
        } else {
            int iIntValue3 = ((Number) pqm0Var.f180350a).intValue();
            int iIntValue4 = ((Number) pqm0Var.f180351b).intValue();
            this.f253810d = n0e1.m63417Y(this.f253808b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.f253808b = i5;
            this.f253809c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f253807a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f253807a == -1) {
            m88721a();
        }
        return this.f253807a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f253807a == -1) {
            m88721a();
        }
        if (this.f253807a == 0) {
            throw new NoSuchElementException();
        }
        b450 b450Var = this.f253810d;
        this.f253810d = null;
        this.f253807a = -1;
        return b450Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
