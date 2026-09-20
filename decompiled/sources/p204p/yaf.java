package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class yaf implements Serializable {

    /* JADX INFO: renamed from: a */
    public final juk[] f270884a;

    public yaf(juk[] jukVarArr) {
        this.f270884a = jukVarArr;
    }

    private final Object readResolve() {
        juk[] jukVarArr = this.f270884a;
        juk jukVarMo26608y = dau.f47107a;
        for (juk jukVar : jukVarArr) {
            jukVarMo26608y = jukVarMo26608y.mo26608y(jukVar);
        }
        return jukVarMo26608y;
    }
}
