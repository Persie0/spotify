package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes10.dex */
public final class zi10 {

    /* JADX INFO: renamed from: a */
    public final jzi f283060a;

    /* JADX INFO: renamed from: b */
    public final ik31 f283061b;

    /* JADX INFO: renamed from: c */
    public final exz0 f283062c;

    /* JADX INFO: renamed from: d */
    public final pvo0 f283063d;

    /* JADX INFO: renamed from: e */
    public final am71 f283064e;

    /* JADX INFO: renamed from: f */
    public final CompositeDisposable f283065f = new CompositeDisposable();

    /* JADX INFO: renamed from: g */
    public final PublishSubject f283066g = new PublishSubject();

    public zi10(jzi jziVar, ik31 ik31Var, exz0 exz0Var, pvo0 pvo0Var, am71 am71Var) {
        this.f283060a = jziVar;
        this.f283061b = ik31Var;
        this.f283062c = exz0Var;
        this.f283063d = pvo0Var;
        this.f283064e = am71Var;
    }

    /* JADX INFO: renamed from: b */
    public static final void m96184b(zi10 zi10Var, xxi xxiVar) {
        xxiVar.f267008b = 3;
        zi10Var.f283066g.onNext(xxiVar);
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m96185c() {
        Collection<xxi> collectionValues = this.f283060a.f117736a.values();
        ArrayList arrayList = new ArrayList();
        for (xxi xxiVar : collectionValues) {
            int i = xxiVar.f267008b;
            if (i == 2 || i == 3) {
                arrayList.add(xxiVar);
            }
        }
        return arrayList;
    }
}
