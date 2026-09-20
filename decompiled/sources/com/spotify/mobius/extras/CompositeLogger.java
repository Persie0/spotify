package com.spotify.mobius.extras;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class CompositeLogger<M, E, F> implements MobiusLoop.Logger<M, E, F> {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5739a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5740b;

    public CompositeLogger(ArrayList arrayList) {
        this.f5739a = arrayList;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f5740b = arrayList2;
        Collections.reverse(arrayList2);
    }

    /* JADX INFO: renamed from: g */
    public static CompositeLogger m15636g(MobiusLoop.Logger logger, MobiusLoop.Logger... loggerArr) {
        ArrayList arrayList = new ArrayList();
        logger.getClass();
        arrayList.add(logger);
        for (MobiusLoop.Logger logger2 : loggerArr) {
            logger2.getClass();
            arrayList.add(logger2);
        }
        return new CompositeLogger(arrayList);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: a */
    public final void mo15583a(Object obj, Object obj2, Next next) {
        Iterator<E> it = this.f5740b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15583a(obj, obj2, next);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: b */
    public final void mo15584b(Object obj, Object obj2, Exception exc) {
        Iterator<E> it = this.f5740b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15584b(obj, obj2, exc);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: c */
    public final void mo15585c(Object obj, First first) {
        Iterator<E> it = this.f5740b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15585c(obj, first);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: d */
    public final void mo15586d(Object obj, Object obj2) {
        Iterator<E> it = this.f5739a.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15586d(obj, obj2);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: e */
    public final void mo15587e(Object obj) {
        Iterator<E> it = this.f5739a.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15587e(obj);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    /* JADX INFO: renamed from: f */
    public final void mo15588f(Object obj, Exception exc) {
        Iterator<E> it = this.f5740b.iterator();
        while (it.hasNext()) {
            ((MobiusLoop.Logger) it.next()).mo15588f(obj, exc);
        }
    }
}
