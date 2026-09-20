package p204p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class k310 implements qsz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f118743a;

    /* JADX INFO: renamed from: b */
    public final Object f118744b;

    /* JADX INFO: renamed from: c */
    public final Object f118745c;

    public /* synthetic */ k310(int i, Object obj, Object obj2) {
        this.f118743a = i;
        this.f118744b = obj;
        this.f118745c = obj2;
    }

    @Override // p204p.qsz0
    public final Iterator iterator() {
        switch (this.f118743a) {
            case 0:
                return new j310(this);
            case 1:
                ArrayList arrayListM30497U = btz0.m30497U((a7z) this.f118744b);
                j6f.m52572d0(arrayListM30497U, (ecb) this.f118745c);
                return arrayListM30497U.iterator();
            default:
                return new j310(this, (byte) 0);
        }
    }
}
