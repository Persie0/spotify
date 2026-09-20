package com.spotify.mobius.extras.patterns;

import com.spotify.mobius.functions.Function;

/* JADX INFO: loaded from: classes8.dex */
public abstract class InnerEffectHandlers {

    /* JADX INFO: renamed from: com.spotify.mobius.extras.patterns.InnerEffectHandlers$2 */
    class C10472 implements InnerEffectHandler<Object, Object, Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Function f5766a;

        public C10472(Function function) {
            this.f5766a = function;
        }
    }

    /* JADX INFO: renamed from: a */
    public static InnerEffectHandler m15644a(Function function) {
        return new C10472(function);
    }
}
