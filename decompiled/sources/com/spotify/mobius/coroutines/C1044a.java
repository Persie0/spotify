package com.spotify.mobius.coroutines;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import java.util.LinkedHashMap;
import p204p.bqa;
import p204p.c9k;
import p204p.juk;
import p204p.kk40;
import p204p.lsi0;
import p204p.msi0;
import p204p.x0h1;
import p204p.xtm0;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C1044a implements Connectable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juk f5734a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CoroutinesSubtypeEffectHandlerBuilder f5735b;

    public /* synthetic */ C1044a(juk jukVar, CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder) {
        this.f5734a = jukVar;
        this.f5735b = coroutinesSubtypeEffectHandlerBuilder;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        final c9k c9kVarM56661c = kk40.m56661c(this.f5734a);
        final bqa bqaVarM92080a = xtm0.m92080a(0, 0, 7);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final lsi0 lsi0VarM62770a = msi0.m62770a();
        x0h1.m89578u(c9kVarM56661c, null, 0, new CoroutinesSubtypeEffectHandlerBuilder$build$1$1(bqaVarM92080a, consumer, null), 3);
        final CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder = this.f5735b;
        return new Connection<Object>() { // from class: com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder$build$1$2
            @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
            public final void accept(Object obj) {
                bqa bqaVar = bqaVarM92080a;
                lsi0 lsi0Var = lsi0VarM62770a;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilder2 = coroutinesSubtypeEffectHandlerBuilder;
                c9k c9kVar = c9kVarM56661c;
                x0h1.m89578u(c9kVar, null, 0, new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$accept$1(lsi0Var, obj, linkedHashMap2, coroutinesSubtypeEffectHandlerBuilder2, c9kVar, bqaVar, null), 3);
            }

            @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                kk40.m56682x(c9kVarM56661c, "Effect Handler disposed");
                bqaVarM92080a.mo30210A(null);
                x0h1.m89580w(new CoroutinesSubtypeEffectHandlerBuilder$build$1$2$dispose$1(lsi0VarM62770a, linkedHashMap, null));
            }
        };
    }
}
