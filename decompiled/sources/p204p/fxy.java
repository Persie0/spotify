package p204p;

import java.io.File;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class fxy implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final File f74484a;

    /* JADX INFO: renamed from: b */
    public final int f74485b = 2;

    public fxy(File file) {
        this.f74484a = file;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new dxy(this);
    }
}
