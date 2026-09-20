package p204p;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/* JADX INFO: loaded from: classes4.dex */
public final class chc0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37987a;

    /* JADX INFO: renamed from: b */
    public Object f37988b;

    /* JADX INFO: renamed from: c */
    public Object f37989c;

    public /* synthetic */ chc0(int i, Object obj, Object obj2) {
        this.f37987a = i;
        this.f37988b = obj;
        this.f37989c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public xj90 m32762a() {
        xj90 xj90Var;
        Stack stack = (Stack) this.f37988b;
        xj90 xj90Var2 = (xj90) this.f37989c;
        if (xj90Var2 == null) {
            throw new NoSuchElementException();
        }
        while (!stack.isEmpty()) {
            hva hvaVar = ((ukx0) stack.pop()).f231383d;
            while (hvaVar instanceof ukx0) {
                ukx0 ukx0Var = (ukx0) hvaVar;
                stack.push(ukx0Var);
                hvaVar = ukx0Var.f231382c;
            }
            xj90 xj90Var3 = (xj90) hvaVar;
            if (xj90Var3.f262074b.length != 0) {
                xj90Var = xj90Var3;
                this.f37989c = xj90Var;
                return xj90Var2;
            }
        }
        xj90Var = null;
        this.f37989c = xj90Var;
        return xj90Var2;
    }

    /* JADX INFO: renamed from: b */
    public q9f1 m32763b() {
        q9f1 q9f1Var;
        ArrayDeque arrayDeque = (ArrayDeque) this.f37988b;
        q9f1 q9f1Var2 = (q9f1) this.f37989c;
        if (q9f1Var2 == null) {
            throw new NoSuchElementException();
        }
        do {
            q9f1Var = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            s9f1 s9f1Var = ((ubf1) arrayDeque.pop()).f228744e;
            while (s9f1Var instanceof ubf1) {
                ubf1 ubf1Var = (ubf1) s9f1Var;
                arrayDeque.push(ubf1Var);
                s9f1Var = ubf1Var.f228743d;
            }
            q9f1Var = (q9f1) s9f1Var;
        } while (q9f1Var.m77583v());
        this.f37989c = q9f1Var;
        return q9f1Var2;
    }

    public boolean equals(Object obj) {
        switch (this.f37987a) {
            case 0:
                return ((Iterator) this.f37989c).equals(obj);
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f37987a) {
            case 0:
                return ((Iterator) this.f37989c).hasNext();
            case 1:
                qmj0 qmj0Var = (qmj0) this.f37988b;
                return (qmj0Var == null || qmj0Var == ((qmj0) this.f37989c)) ? false : true;
            case 2:
                return ((xj90) this.f37989c) != null;
            case 3:
                return ((Iterator) this.f37989c).hasNext();
            default:
                return ((q9f1) this.f37989c) != null;
        }
    }

    public int hashCode() {
        switch (this.f37987a) {
            case 0:
                return ((Iterator) this.f37989c).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f37987a) {
            case 0:
                return ((Iterator) this.f37989c).next();
            case 1:
                qmj0 qmj0Var = (qmj0) this.f37988b;
                this.f37988b = qmj0Var.f190236e;
                return qmj0Var;
            case 2:
                return m32762a();
            case 3:
                Map.Entry entry = (Map.Entry) ((Iterator) this.f37989c).next();
                this.f37988b = entry;
                return entry.getKey();
            default:
                return m32763b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f37987a) {
            case 0:
                ((fhc0) this.f37988b).m41656c();
                ((Iterator) this.f37989c).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("remove");
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                Map.Entry entry = (Map.Entry) this.f37988b;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                ((Iterator) this.f37989c).remove();
                collection.size();
                collection.clear();
                this.f37988b = null;
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String toString() {
        switch (this.f37987a) {
            case 0:
                return ((Iterator) this.f37989c).toString();
            default:
                return super.toString();
        }
    }

    public chc0(y7f1 y7f1Var, Iterator it) {
        this.f37987a = 3;
        this.f37989c = it;
    }

    public chc0(s9f1 s9f1Var) {
        this.f37987a = 4;
        if (s9f1Var instanceof ubf1) {
            ubf1 ubf1Var = (ubf1) s9f1Var;
            ArrayDeque arrayDeque = new ArrayDeque(ubf1Var.f228746g);
            this.f37988b = arrayDeque;
            arrayDeque.push(ubf1Var);
            s9f1 s9f1Var2 = ubf1Var.f228743d;
            while (s9f1Var2 instanceof ubf1) {
                ubf1 ubf1Var2 = (ubf1) s9f1Var2;
                ((ArrayDeque) this.f37988b).push(ubf1Var2);
                s9f1Var2 = ubf1Var2.f228743d;
            }
            this.f37989c = (q9f1) s9f1Var2;
            return;
        }
        this.f37988b = null;
        this.f37989c = (q9f1) s9f1Var;
    }

    public chc0(hva hvaVar) {
        this.f37987a = 2;
        this.f37988b = new Stack();
        while (hvaVar instanceof ukx0) {
            ukx0 ukx0Var = (ukx0) hvaVar;
            ((Stack) this.f37988b).push(ukx0Var);
            hvaVar = ukx0Var.f231382c;
        }
        this.f37989c = (xj90) hvaVar;
    }
}
