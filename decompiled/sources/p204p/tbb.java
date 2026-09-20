package p204p;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tbb extends ccb {
    public tbb(Field field, boolean z) {
        super(field, field.getGenericType(), z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p204p.lbb
    /* JADX INFO: renamed from: j */
    public Object mo25448j(Object[] objArr) {
        mo32239a(objArr);
        return ((Field) this.f36366a).get(this.f36368c != null ? bk5.m29583F0(objArr) : null);
    }
}
