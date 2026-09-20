package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zsr implements v94 {

    /* JADX INFO: renamed from: a */
    public final Map f285989a;

    public zsr(btv0 btv0Var) {
        btv0 btv0Var2 = btv0.f30940g;
        Map mapUnmodifiableMap = btv0Var;
        if (!btv0Var2.isEmpty()) {
            LinkedHashMap linkedHashMapM92176o = xuf1.m92176o(btv0Var.f30943f);
            linkedHashMapM92176o.putAll(btv0Var);
            for (Map.Entry entry : btv0Var2.entrySet()) {
                linkedHashMapM92176o.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMapM92176o);
        }
        this.f285989a = mapUnmodifiableMap;
    }

    @Override // p204p.v94
    /* JADX INFO: renamed from: K0 */
    public final void mo24956K0(Object obj) {
        String name = obj.getClass().getName();
        Map map = this.f285989a;
        i4t0 i4t0Var = (i4t0) map.get(name);
        if (i4t0Var != null) {
            u94 u94Var = (u94) i4t0Var.get();
            try {
                u94Var.mo29348a(obj).mo24956K0(obj);
                return;
            } catch (ClassCastException e) {
                final String strM77252k = s571.m77252k(u94Var.getClass().getCanonicalName(), " does not implement AndroidInjector.Factory<", obj.getClass().getCanonicalName(), ">");
                throw new RuntimeException(strM77252k, e) { // from class: dagger.android.DispatchingAndroidInjector$InvalidInjectorBindingException
                };
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            if (map.containsKey(superclass.getCanonicalName())) {
                arrayList.add(superclass.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? s571.m77251j("No injector factory bound for Class<", obj.getClass().getCanonicalName(), ">") : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
    }
}
