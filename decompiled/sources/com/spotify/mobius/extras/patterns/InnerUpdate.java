package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import com.spotify.mobius.functions.BiFunction;
import com.spotify.mobius.functions.Function;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class InnerUpdate<M, E, F, MI, EI, FI> implements Update<M, E, F> {

    public static abstract class Builder<M, E, F, MI, EI, FI> {
        /* JADX INFO: renamed from: a */
        public abstract InnerUpdate mo15638a();

        /* JADX INFO: renamed from: b */
        public abstract Builder mo15639b(Function function);

        /* JADX INFO: renamed from: c */
        public abstract Builder mo15640c(InnerEffectHandler innerEffectHandler);

        /* JADX INFO: renamed from: d */
        public abstract Builder mo15641d(Update update);

        /* JADX INFO: renamed from: e */
        public abstract Builder mo15642e(Function function);

        /* JADX INFO: renamed from: f */
        public abstract Builder mo15643f(BiFunction biFunction);
    }

    /* JADX INFO: renamed from: b */
    public static Builder m15645b() {
        return new AutoValue_InnerUpdate.Builder();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.Update
    /* JADX INFO: renamed from: a */
    public final Next mo15577a(Object obj, Object obj2) {
        AutoValue_InnerUpdate autoValue_InnerUpdate = (AutoValue_InnerUpdate) this;
        Object objApply = autoValue_InnerUpdate.f5757b.apply(obj);
        objApply.getClass();
        Object objApply2 = autoValue_InnerUpdate.f5758c.apply(obj2);
        objApply2.getClass();
        Next nextMo15577a = autoValue_InnerUpdate.f5756a.mo15577a(objApply, objApply2);
        nextMo15577a.getClass();
        boolean zM15610d = nextMo15577a.m15610d();
        if (zM15610d) {
            obj = autoValue_InnerUpdate.f5759d.apply(obj, nextMo15577a.m15613g());
        }
        Set setMo15561b = nextMo15577a.mo15561b();
        InnerEffectHandlers.C10472 c10472 = (InnerEffectHandlers.C10472) autoValue_InnerUpdate.f5760e;
        c10472.getClass();
        if (setMo15561b.isEmpty()) {
            return zM15610d ? Next.m15606h(obj) : Next.m15608j();
        }
        HashSet hashSet = new HashSet();
        Iterator<E> it = setMo15561b.iterator();
        while (it.hasNext()) {
            Object objApply3 = c10472.f5766a.apply(it.next());
            objApply3.getClass();
            hashSet.add(objApply3);
        }
        return zM15610d ? Next.m15607i(obj, hashSet) : Next.m15605a(hashSet);
    }
}
