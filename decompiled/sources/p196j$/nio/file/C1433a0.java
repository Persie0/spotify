package p196j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.nio.file.a0 */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1433a0 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final Iterable f10515a;

    public C1433a0(Iterable iterable) {
        this.f10515a = iterable;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.f10515a.forEach(new C1502y(consumer, 1));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1464b0(this.f10515a.iterator());
    }
}
