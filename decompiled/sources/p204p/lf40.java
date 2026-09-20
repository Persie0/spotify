package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class lf40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object[] f132796a;

    public lf40(Object[] objArr) {
        this.f132796a = objArr;
    }

    public Object readResolve() {
        return pf40.m69792q(this.f132796a);
    }
}
