package p196j$.nio.file;

import java.util.Iterator;
import p196j$.desugar.sun.nio.p197fs.AbstractC1419g;

/* JADX INFO: renamed from: j$.nio.file.b0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1464b0 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f10544a;

    public C1464b0(Iterator it) {
        this.f10544a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10544a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return AbstractC1419g.m23821d(this.f10544a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f10544a.remove();
    }
}
