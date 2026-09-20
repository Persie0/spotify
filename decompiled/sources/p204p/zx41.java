package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: classes9.dex */
public final class zx41 implements map0 {

    /* JADX INFO: renamed from: a */
    public final irw f287204a;

    /* JADX INFO: renamed from: b */
    public final dy41 f287205b;

    public zx41(irw irwVar, dy41 dy41Var) {
        this.f287204a = irwVar;
        this.f287205b = dy41Var;
    }

    @Override // p204p.map0
    /* JADX INFO: renamed from: a */
    public final Single mo51472a(boolean z) {
        return new CompletableFromAction(new yx41(this, z)).m23294e(this.f287204a.mo51472a(z));
    }

    @Override // p204p.map0
    public final Single setRepeatMode(int i) {
        return new CompletableFromAction(new h87(this, i, 3)).m23294e(this.f287204a.setRepeatMode(i));
    }
}
