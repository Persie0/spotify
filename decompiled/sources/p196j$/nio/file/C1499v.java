package p196j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: j$.nio.file.v */
/* JADX INFO: compiled from: r8-map-id-04ee2f9088c3b15d84c953b120137915627636a9db0b69fa821c3c44fa9a69b8 */
/* JADX INFO: loaded from: classes12.dex */
public final class C1499v implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f10593a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Path f10594b;

    public C1499v(Path path) {
        this.f10594b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10593a < this.f10594b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f10593a >= this.f10594b.getNameCount()) {
            throw new NoSuchElementException();
        }
        Path name = this.f10594b.getName(this.f10593a);
        this.f10593a++;
        return name;
    }
}
