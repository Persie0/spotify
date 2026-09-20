package p204p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public final class ubb extends xbb implements dga {

    /* JADX INFO: renamed from: g */
    public final Object f228673g;

    public ubb(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.f228673g = obj;
    }

    @Override // p204p.xbb, p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) throws IllegalAccessException {
        mo32239a(objArr);
        ((Field) this.f36366a).set(this.f228673g, bk5.m29583F0(objArr));
        return w2a1.f247311a;
    }
}
