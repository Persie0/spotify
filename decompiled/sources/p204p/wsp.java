package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class wsp extends qnh0 {

    /* JADX INFO: renamed from: d */
    public final jnh0 f254663d;

    /* JADX INFO: renamed from: e */
    public final owh0 f254664e;

    /* JADX INFO: renamed from: f */
    public final qwh0 f254665f;

    /* JADX INFO: renamed from: g */
    public final ggc1 f254666g;

    /* JADX INFO: renamed from: h */
    public MobiusLoop.Controller f254667h;

    /* JADX INFO: renamed from: i */
    public final iwr f254668i = new iwr();

    /* JADX INFO: renamed from: t */
    public final Subject f254669t = BehaviorSubject.m23795f().m23811c();

    /* JADX INFO: renamed from: X */
    public final Subject f254662X = new PublishSubject().m23811c();

    public wsp(jnh0 jnh0Var, owh0 owh0Var, qwh0 qwh0Var, ggc1 ggc1Var) {
        this.f254663d = jnh0Var;
        this.f254664e = owh0Var;
        this.f254665f = qwh0Var;
        this.f254666g = ggc1Var;
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: e */
    public final void mo25474e() {
        m35107j();
        if (this.f254667h == null) {
            this.f254667h = this.f254663d.mo32865a(mo52221l(), new bi1(this, 11));
        }
        k1n k1nVar = new k1n(this, 14);
        Subject subject = this.f254669t;
        this.f254668i.m51848b(subject.skipWhile(k1nVar).firstOrError().subscribe(new vsp(this, 0), new vsp(this, 1)));
        MobiusLoop.Controller controller = this.f254667h;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.mo15604c(new gxi(this.f254662X, subject));
        controller.start();
    }

    @Override // p204p.d6a0
    /* JADX INFO: renamed from: f */
    public final void mo25475f() {
        this.f254668i.m51847a();
        MobiusLoop.Controller controller = this.f254667h;
        if (controller == null) {
            wj50.m88260d0("controller");
            throw null;
        }
        controller.stop();
        controller.disconnect();
    }

    @Override // p204p.qnh0
    /* JADX INFO: renamed from: k */
    public final CompositeDisposable mo73354k(Connectable connectable, ObservableTransformer observableTransformer) {
        Subject subject = this.f254662X;
        Connection connectionMo3269P = connectable.mo3269P(new hz0(subject, 9));
        return new CompositeDisposable(Disposable.m23398d(new s12(connectionMo3269P, 18)), this.f254669t.subscribe(new bnf(connectionMo3269P, 1)), this.f254666g.mo44686c().compose(observableTransformer).subscribe(new ujp(subject, 5)));
    }

    /* JADX INFO: renamed from: l */
    public Object mo52221l() {
        return this.f254664e.invoke();
    }
}
