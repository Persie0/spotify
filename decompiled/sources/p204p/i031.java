package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class i031 implements jx21, j031, hc80 {

    /* JADX INFO: renamed from: Y */
    public final CompletableOnErrorComplete f97121Y;

    /* JADX INFO: renamed from: Z */
    public final wg61 f97122Z;

    /* JADX INFO: renamed from: a */
    public final k331 f97123a;

    /* JADX INFO: renamed from: b */
    public final er70 f97124b;

    /* JADX INFO: renamed from: c */
    public final er70 f97125c;

    /* JADX INFO: renamed from: d */
    public final jy21 f97126d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f97127e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f97128f;

    /* JADX INFO: renamed from: g */
    public final Scheduler f97129g;

    /* JADX INFO: renamed from: h */
    public final ltx0 f97130h;

    /* JADX INFO: renamed from: i */
    public final oc80 f97131i = new oc80(this, true);

    /* JADX INFO: renamed from: t */
    public final Subject f97132t = new PublishSubject().m23811c();

    /* JADX INFO: renamed from: X */
    public final iwr f97120X = new iwr();

    public i031(k331 k331Var, er70 er70Var, er70 er70Var2, jy21 jy21Var, Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, ltx0 ltx0Var) {
        this.f97123a = k331Var;
        this.f97124b = er70Var;
        this.f97125c = er70Var2;
        this.f97126d = jy21Var;
        this.f97127e = scheduler;
        this.f97128f = scheduler2;
        this.f97129g = scheduler3;
        this.f97130h = ltx0Var;
        Completable completableIgnoreElement = ltx0Var.m59916i().filter(blr0.f28248N0).firstOrError().ignoreElement();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f97121Y = completableIgnoreElement.m23304u(15L, Completable.m23286j(new TimeoutException())).m23299p(Functions.f7232h);
        scheduler3.mo23384c(new zu3(this, 16));
        Logger.m3965a(edb.m38563l("SmartShuffleCore ", hashCode(), " created"), new Object[0]);
        this.f97122Z = new wg61(new cy11(this, 16));
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f97131i;
    }
}
