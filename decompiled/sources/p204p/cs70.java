package p204p;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class cs70 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41484a;

    /* JADX INFO: renamed from: b */
    public Iterator f41485b;

    public /* synthetic */ cs70(int i) {
        this.f41484a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f41484a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.f41485b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f41484a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f41485b.next();
                if (!(entry.getValue() instanceof ds70)) {
                    return entry;
                }
                bs70 bs70Var = new bs70();
                bs70Var.f30259a = entry;
                return bs70Var;
            case 1:
                return (String) this.f41485b.next();
            case 2:
                return (String) this.f41485b.next();
            case 3:
                return (String) this.f41485b.next();
            case 4:
                return (String) this.f41485b.next();
            default:
                return (String) this.f41485b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f41484a) {
            case 0:
                this.f41485b.remove();
                return;
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public cs70(hyf1 hyf1Var) {
        this.f41484a = 5;
        this.f41485b = hyf1Var.f96581a.iterator();
    }

    public cs70(Iterator it) {
        this.f41484a = 0;
        this.f41485b = it;
    }
}
