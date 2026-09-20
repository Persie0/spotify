package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pza {

    /* JADX INFO: renamed from: a */
    public final qza f183650a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f183651b = BehaviorSubject.m23796g(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c */
    public final lwr f183652c;

    /* JADX INFO: renamed from: d */
    public final C2054kj f183653d;

    public pza(qza qzaVar) {
        this.f183650a = qzaVar;
        lwr lwrVar = new lwr();
        this.f183652c = lwrVar;
        lwrVar.m60127a(qzaVar.f194156a.hide().subscribe(new cf8(this, 15)));
        this.f183653d = C2054kj.f123160N0;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m71698a() {
        return this.f183651b.map(new id8(this, 6)).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b */
    public final Observable m71699b(String str) {
        return this.f183650a.f194156a.hide().filter(new ze8(str, 1)).map(e8f.f57173Z);
    }
}
