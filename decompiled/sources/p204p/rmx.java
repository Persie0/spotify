package p204p;

import com.spotify.home.explicitfeedback.proto.Feedback;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.SerialDisposable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class rmx {

    /* JADX INFO: renamed from: a */
    public final Scheduler f200626a;

    /* JADX INFO: renamed from: b */
    public final Observable f200627b;

    /* JADX INFO: renamed from: c */
    public final uky f200628c;

    /* JADX INFO: renamed from: d */
    public String f200629d;

    /* JADX INFO: renamed from: f */
    public final nps f200631f;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f200630e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final SerialDisposable f200632g = new SerialDisposable();

    /* JADX INFO: renamed from: h */
    public BehaviorSubject f200633h = BehaviorSubject.m23796g(lau.f131415a);

    public rmx(Scheduler scheduler, Observable observable, uky ukyVar, xre xreVar) {
        this.f200626a = scheduler;
        this.f200627b = observable;
        this.f200628c = ukyVar;
        this.f200631f = new nps(xreVar);
    }

    /* JADX INFO: renamed from: e */
    public static HashSet m75981e(List list) {
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Feedback) it.next()).getUri());
        }
        return g6f.m43724h1(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final CompletableSubscribeOn m75982a(String str) {
        return new CompletableDefer(new pmx(this, str, 0)).m23303t(this.f200626a);
    }

    /* JADX INFO: renamed from: b */
    public final Set m75983b() {
        List list = (List) this.f200633h.m23798h();
        return list != null ? m75981e(list) : gbu.f78413a;
    }

    /* JADX INFO: renamed from: c */
    public final CompletableSubscribeOn m75984c(String str) {
        return new CompletableDefer(new pmx(this, str, 1)).m23303t(this.f200626a);
    }

    /* JADX INFO: renamed from: d */
    public final Observable m75985d() {
        return this.f200633h.map(new lb5(this, 11));
    }
}
