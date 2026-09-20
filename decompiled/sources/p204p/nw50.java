package p204p;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class nw50 extends o3a1 {

    /* JADX INFO: renamed from: b */
    public int f159022b;

    /* JADX INFO: renamed from: c */
    public Object f159023c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f159024d;

    /* JADX INFO: renamed from: e */
    public final Iterator f159025e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f159026f;

    public nw50() {
        super(0);
        this.f159022b = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        c95.m31855u(this.f159022b != 4);
        int iM38547C = edb.m38547C(this.f159022b);
        if (iM38547C == 0) {
            return true;
        }
        if (iM38547C != 2) {
            this.f159022b = 4;
            switch (this.f159024d) {
                case 0:
                    do {
                        Iterator it = this.f159025e;
                        if (!it.hasNext()) {
                            this.f159022b = 3;
                            next = null;
                        } else {
                            next = it.next();
                        }
                        break;
                    } while (!((wfq0) this.f159026f).apply(next));
                    break;
                case 1:
                    do {
                        Iterator it2 = this.f159025e;
                        if (!it2.hasNext()) {
                            this.f159022b = 3;
                            next = null;
                        } else {
                            next = it2.next();
                        }
                        break;
                    } while (!((o601) this.f159026f).f162186d.contains(next));
                    break;
                default:
                    do {
                        Iterator it3 = this.f159025e;
                        if (!it3.hasNext()) {
                            this.f159022b = 3;
                            next = null;
                        } else {
                            next = it3.next();
                        }
                        break;
                    } while (((zh21) ((o601) this.f159026f).f162186d).f282787d.equals(next));
                    break;
            }
            this.f159023c = next;
            if (this.f159022b != 3) {
                this.f159022b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f159022b = 2;
        Object obj = this.f159023c;
        this.f159023c = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nw50(Iterator it, wfq0 wfq0Var) {
        this();
        this.f159024d = 0;
        this.f159025e = it;
        this.f159026f = wfq0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nw50(o601 o601Var) {
        this();
        this.f159024d = 1;
        this.f159026f = o601Var;
        this.f159025e = o601Var.f162185c.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nw50(o601 o601Var, byte b) {
        this();
        this.f159024d = 2;
        this.f159026f = o601Var;
        this.f159025e = o601Var.f162185c.iterator();
    }
}
