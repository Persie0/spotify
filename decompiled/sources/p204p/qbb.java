package p204p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes11.dex */
public final class qbb extends tbb implements dga {

    /* JADX INFO: renamed from: e */
    public final Object f187051e;

    public qbb(Field field, Object obj) {
        super(field, false);
        this.f187051e = obj;
    }

    @Override // p204p.tbb, p204p.lbb
    /* JADX INFO: renamed from: j */
    public final Object mo25448j(Object[] objArr) {
        mo32239a(objArr);
        return ((Field) this.f36366a).get(this.f187051e);
    }
}
