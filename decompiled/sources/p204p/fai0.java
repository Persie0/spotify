package p204p;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class fai0 implements j561, Serializable {

    /* JADX INFO: renamed from: a */
    public final int f67564a;

    public fai0() {
        ddg1.m35736g(2, "expectedValuesPerKey");
        this.f67564a = 2;
    }

    @Override // p204p.j561
    public final Object get() {
        return new ArrayList(this.f67564a);
    }
}
