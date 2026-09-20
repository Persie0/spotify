package com.spotify.mobius.android;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.internal_util.Preconditions;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class AndroidLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {
    public AndroidLogger(String str) {
        Preconditions.m15649b(str);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public void mo15583a(Object obj, Object obj2, Next next) {
        if (next.m15610d()) {
            Objects.toString(next.m15613g());
        }
        Iterator<E> it = next.mo15561b().iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        String.format("FATAL ERROR: exception updating model '%s' with event '%s'", obj, obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        Objects.toString(first.mo15560d());
        Iterator<E> it = first.mo15559a().iterator();
        while (it.hasNext()) {
            Objects.toString(it.next());
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        Objects.toString(obj2);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
        Objects.toString(obj);
    }
}
