package com.spotify.mobius.coroutines;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p204p.c9k;
import p204p.fiz;
import p204p.juk;
import p204p.kk40;
import p204p.rlv0;
import p204p.x0h1;

/* JADX INFO: renamed from: com.spotify.mobius.coroutines.b */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C1045b implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ juk f5736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fiz[] f5737b;

    public /* synthetic */ C1045b(juk jukVar, fiz[] fizVarArr) {
        this.f5736a = jukVar;
        this.f5737b = fizVarArr;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        FlowEventSources.Companion companion = FlowEventSources.Companion.f5714a;
        final c9k c9kVarM56661c = kk40.m56661c(this.f5736a);
        final rlv0 rlv0Var = new rlv0();
        rlv0Var.f200373a = new AtomicBoolean(false);
        x0h1.m89578u(c9kVarM56661c, null, 0, new FlowEventSources$Companion$fromFlows$1$1(this.f5737b, rlv0Var, consumer, null), 3);
        return new Disposable() { // from class: p.ziz
            @Override // com.spotify.mobius.disposables.Disposable
            public final void dispose() {
                rlv0 rlv0Var2 = rlv0Var;
                c9k c9kVar = c9kVarM56661c;
                FlowEventSources.Companion companion2 = FlowEventSources.Companion.f5714a;
                synchronized (rlv0Var2.f200373a) {
                    ((AtomicBoolean) rlv0Var2.f200373a).set(true);
                }
                kk40.m56680v(c9kVar, new CancellationException("EventSource disposed"));
            }
        };
    }
}
