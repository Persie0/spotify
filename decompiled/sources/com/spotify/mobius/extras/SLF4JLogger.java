package com.spotify.mobius.extras;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.Iterator;
import p204p.bsa0;
import p204p.xra0;

/* JADX INFO: loaded from: classes2.dex */
public class SLF4JLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {

    /* JADX INFO: renamed from: b */
    public static final xra0 f5751b = bsa0.m30425b(SLF4JLogger.class);

    /* JADX INFO: renamed from: a */
    public final String f5752a;

    public SLF4JLogger(String str) {
        this.f5752a = str;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        boolean zM15610d = next.m15610d();
        String str = this.f5752a;
        xra0 xra0Var = f5751b;
        if (zM15610d) {
            xra0Var.mo27133d("Mobius ({}) - Model updated: {}", str, next.m15613g());
        }
        Iterator<E> it = next.mo15561b().iterator();
        while (it.hasNext()) {
            xra0Var.mo27133d("Mobius ({}) - Effect dispatched: {}", str, it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        f5751b.mo27143n(obj, obj2, exc);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        Object objMo15560d = first.mo15560d();
        xra0 xra0Var = f5751b;
        String str = this.f5752a;
        xra0Var.mo27133d("Mobius ({}) - Loop initialized, starting from model: {}", str, objMo15560d);
        Iterator<E> it = first.mo15559a().iterator();
        while (it.hasNext()) {
            xra0Var.mo27133d("Mobius ({}) - Effect dispatched: {}", str, it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        f5751b.mo27133d("Mobius ({}) - Event received: {}", this.f5752a, obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
        f5751b.mo27132a(this.f5752a);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
        f5751b.mo27140k(obj, exc);
    }
}
