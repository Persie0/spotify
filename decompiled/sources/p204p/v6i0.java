package p204p;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class v6i0 implements BiFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f237849a;

    public v6i0(Object obj) {
        this.f237849a = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Set setNewKeySet = (Set) obj2;
        if (setNewKeySet == null) {
            setNewKeySet = ConcurrentHashMap.newKeySet();
        }
        setNewKeySet.add(this.f237849a);
        return setNewKeySet;
    }
}
