package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class chf {

    /* JADX INFO: renamed from: a */
    public final Scheduler f37998a;

    /* JADX INFO: renamed from: b */
    public final xre f37999b;

    /* JADX INFO: renamed from: c */
    public final vk9 f38000c;

    /* JADX INFO: renamed from: d */
    public final dhf f38001d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f38002e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f38003f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f38004g = new LinkedHashMap();

    /* JADX INFO: renamed from: h */
    public final Observable f38005h;

    /* JADX INFO: renamed from: i */
    public final PublishSubject f38006i;

    /* JADX INFO: renamed from: j */
    public final Observable f38007j;

    public chf(Observable observable, Scheduler scheduler, xre xreVar, vk9 vk9Var, dhf dhfVar) {
        this.f37998a = scheduler;
        this.f37999b = xreVar;
        this.f38000c = vk9Var;
        this.f38001d = dhfVar;
        this.f38005h = observable.filter(e8f.f57159N0).distinctUntilChanged();
        PublishSubject publishSubject = new PublishSubject();
        this.f38006i = publishSubject;
        this.f38007j = publishSubject.replay(1).m23777a(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m32764a(chf chfVar, String str, long j) {
        PublishSubject publishSubject = (PublishSubject) chfVar.f38004g.get(str);
        if (publishSubject != null) {
            publishSubject.onNext(new zgf(j, true));
        }
    }

    /* JADX INFO: renamed from: b */
    public final CompletableSubscribeOn m32765b(String str, boolean z) {
        if (z) {
            this.f38002e.clear();
        }
        return this.f38005h.firstOrError().flatMapCompletable(new np7(25, this, str)).m23303t(this.f37998a);
    }
}
