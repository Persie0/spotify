package p204p;

import java.io.BufferedReader;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class tl80 implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final BufferedReader f221387a;

    public tl80(BufferedReader bufferedReader) {
        this.f221387a = bufferedReader;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        return new sl80(this);
    }
}
