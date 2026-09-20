package p204p;

import java.lang.reflect.Type;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ila implements hk60.InterfaceC1945e {
    @Override // p204p.hk60.InterfaceC1945e
    public final hk60 create(Type type, Set set, p0i0 p0i0Var) {
        if (hla.class.isAssignableFrom(mp91.m62454g(type))) {
            return new kla();
        }
        return null;
    }
}
