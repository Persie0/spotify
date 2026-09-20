package p204p;

import com.spotify.allboarding.allboardingimpl.presentation.contentpicker.ContentPickerFragment;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class jsj extends AbstractC2248p9 {

    /* JADX INFO: renamed from: c */
    public final snj f115503c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f115504d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f115505e;

    public jsj(snj snjVar, Scheduler scheduler, Scheduler scheduler2, ContentPickerFragment contentPickerFragment) {
        super(contentPickerFragment);
        this.f115503c = snjVar;
        this.f115504d = scheduler;
        this.f115505e = scheduler2;
    }

    @Override // p204p.AbstractC2248p9
    /* JADX INFO: renamed from: e */
    public final mic1 mo42754e(x8y0 x8y0Var) {
        return new esj(new isj(this), x8y0Var);
    }
}
