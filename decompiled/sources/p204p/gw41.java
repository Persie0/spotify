package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public interface gw41 {
    /* JADX INFO: renamed from: a */
    void mo31967a(mwt mwtVar);

    /* JADX INFO: renamed from: b */
    void mo31968b(mwt mwtVar);

    /* JADX INFO: renamed from: c */
    default boolean mo31969c() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    Bundle mo31970d();

    /* JADX INFO: renamed from: e */
    void mo31971e(Object obj);

    /* JADX INFO: renamed from: f */
    default paq mo31972f() {
        paq paqVarMo31977k = mo31977k();
        return paqVarMo31977k == null ? new paq(null) : paqVarMo31977k;
    }

    /* JADX INFO: renamed from: g */
    default paq mo31973g() {
        paq paqVarMo31977k = mo31977k();
        if (mo31975i() == null) {
            paqVarMo31977k = null;
        }
        if (paqVarMo31977k == null) {
            return new paq(null);
        }
        return new paq(paqVarMo31977k.f175594a, paqVarMo31977k.f175595b, paqVarMo31977k.m69496c(mo31974h()), null);
    }

    Object getState();

    /* JADX INFO: renamed from: h */
    default String mo31974h() {
        String strMo31975i = mo31975i();
        return strMo31975i == null ? toString() : strMo31975i;
    }

    /* JADX INFO: renamed from: i */
    default String mo31975i() {
        return null;
    }

    /* JADX INFO: renamed from: j */
    void mo31976j(Bundle bundle);

    /* JADX INFO: renamed from: k */
    default paq mo31977k() {
        return null;
    }

    default Bundle serialize() {
        return null;
    }
}
