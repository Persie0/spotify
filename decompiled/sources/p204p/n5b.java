package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class n5b implements j561 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o5b f150514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f150515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f150516c;

    public /* synthetic */ n5b(o5b o5bVar, int i, int i2) {
        this.f150514a = o5bVar;
        this.f150515b = i;
        this.f150516c = i2;
    }

    @Override // p204p.j561
    public final Object get() {
        o5b o5bVar = this.f150514a;
        lrw lrwVar = o5bVar.f161926a;
        int i = this.f150515b;
        int i2 = this.f150516c;
        FlowableRefCount flowableRefCount = new FlowableRefCount(lrwVar.mo53042c(i, i2).m23336Q());
        ConcurrentHashMap concurrentHashMap = o5bVar.f161927b;
        concurrentHashMap.putIfAbsent(new qqm0(Integer.valueOf(i), Integer.valueOf(i2)), flowableRefCount);
        return (Flowable) concurrentHashMap.get(new qqm0(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
