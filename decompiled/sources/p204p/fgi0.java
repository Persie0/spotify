package p204p;

import com.google.protobuf.Empty;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Optional;

/* JADX INFO: loaded from: classes.dex */
public final class fgi0 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final sme f69330a;

    /* JADX INFO: renamed from: b */
    public final Optional f69331b;

    public fgi0(sme smeVar, Optional optional) {
        this.f69330a = smeVar;
        this.f69331b = optional;
        if (((BehaviorSubject) optional.orElse(null)) == null) {
            BehaviorSubject.m23796g(Boolean.TRUE);
        }
        smeVar.f210640c.m51848b(smeVar.f210638a.f145127a.m56120L(Empty.m1933n()).map(njy0.f154676M0).subscribe(new cf8(smeVar, 28)));
        smeVar.f210642e.set(false);
        BehaviorSubject behaviorSubject = (BehaviorSubject) optional.orElse(null);
        if (behaviorSubject != null) {
            behaviorSubject.onNext(Boolean.TRUE);
        }
    }

    @Override // p204p.hgm
    public final void shutdown() {
        BehaviorSubject behaviorSubject = (BehaviorSubject) this.f69331b.orElse(null);
        if (behaviorSubject != null) {
            behaviorSubject.onNext(Boolean.FALSE);
        }
        sme smeVar = this.f69330a;
        smeVar.f210642e.set(true);
        smeVar.f210641d.onNext(x2a1.f257409a);
        smeVar.f210640c.m51847a();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}
