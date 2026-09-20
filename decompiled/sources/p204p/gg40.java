package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class gg40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object[] f79533a;

    public gg40(Object[] objArr) {
        this.f79533a = objArr;
    }

    public Object readResolve() {
        return hg40.m47407q(this.f79533a);
    }
}
