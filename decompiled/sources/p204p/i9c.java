package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.carousel.CarouselFragment;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class i9c extends AbstractC2248p9 {

    /* JADX INFO: renamed from: c */
    public final h5c f99983c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f99984d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f99985e;

    public i9c(h5c h5cVar, Scheduler scheduler, Scheduler scheduler2, CarouselFragment carouselFragment) {
        super(carouselFragment);
        this.f99983c = h5cVar;
        this.f99984d = scheduler;
        this.f99985e = scheduler2;
    }

    @Override // p204p.AbstractC2248p9
    /* JADX INFO: renamed from: e */
    public final mic1 mo42754e(x8y0 x8y0Var) {
        return new d9c(new h9c(this), x8y0Var);
    }
}
