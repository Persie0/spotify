package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Map;

/* JADX INFO: renamed from: p.n0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2147n0 implements ObservableOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2435u0 f148843a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f148844b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f148845c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f148846d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String[] f148847e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Map f148848f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ eh00 f148849g;

    public C2147n0(C2435u0 c2435u0, String str, String str2, String str3, String[] strArr, Map map, eh00 eh00Var) {
        this.f148843a = c2435u0;
        this.f148844b = str;
        this.f148845c = str2;
        this.f148846d = str3;
        this.f148847e = strArr;
        this.f148848f = map;
        this.f148849g = eh00Var;
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public final void subscribe(ObservableEmitter observableEmitter) {
        C1880g0 c1880g0;
        C2035k0 c2035k0 = new C2035k0(observableEmitter);
        C2435u0 c2435u0 = this.f148843a;
        String str = this.f148844b;
        String str2 = this.f148845c;
        synchronized (c2435u0) {
            synchronized (c2435u0.f225337c) {
                c2435u0.f225337c.add(c2035k0);
            }
            C1880g0 c1880g1 = c2435u0.f225336b;
            if (c1880g1 == null) {
                C1797e0 c1797e0 = new C1797e0(c2435u0, str2);
                C2596y0 c2596y0 = new C2596y0(str);
                c2596y0.f267827i.m28216d(new C1724c0(c1797e0, 0));
                c1880g1 = new C1880g0(c2596y0);
                c2435u0.f225336b = c1880g1;
            }
            c1880g0 = c1880g1;
        }
        try {
            observableEmitter.setDisposable(Disposable.m23399e(new RunnableC1998j0(this.f148849g, c1880g0.m43250c(this.f148846d, this.f148847e, this.f148848f, new C2073l0(1, observableEmitter, ObservableEmitter.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 0), new C2110m0(1, 8, ObservableEmitter.class, observableEmitter, "tryOnError", "tryOnError(Ljava/lang/Throwable;)Z")), this.f148843a, c2035k0)));
        } catch (Exception e) {
            C2435u0 c2435u1 = this.f148843a;
            synchronized (c2435u1.f225337c) {
                c2435u1.f225337c.remove(c2035k0);
                observableEmitter.tryOnError(e);
            }
        }
    }
}
