package p204p;

import android.view.View;
import com.spotify.legacyglue.widgetstate.ViewPagerIndicator;
import com.spotify.watchfeed.uiusecases.element.watchfeedpagerindicator.WatchFeedPagerIndicatorView;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class prh extends jkc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f180607a;

    /* JADX INFO: renamed from: b */
    public final Object f180608b;

    public /* synthetic */ prh(View view, int i) {
        this.f180607a = i;
        this.f180608b = view;
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: a */
    public void mo26274a(int i) {
        switch (this.f180607a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f180608b).iterator();
                    while (it.hasNext()) {
                        ((jkc1) it.next()).mo26274a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
            default:
                return;
        }
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: b */
    public final void mo26275b(int i, int i2, float f) {
        switch (this.f180607a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f180608b).iterator();
                    while (it.hasNext()) {
                        ((jkc1) it.next()).mo26275b(i, i2, f);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ((ViewPagerIndicator) this.f180608b).mo3277e(f, i);
                return;
            default:
                WatchFeedPagerIndicatorView watchFeedPagerIndicatorView = (WatchFeedPagerIndicatorView) this.f180608b;
                watchFeedPagerIndicatorView.f6946h.m79791B(f, i);
                watchFeedPagerIndicatorView.invalidate();
                return;
        }
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: c */
    public void mo26276c(int i) {
        switch (this.f180607a) {
            case 0:
                try {
                    Iterator it = ((ArrayList) this.f180608b).iterator();
                    while (it.hasNext()) {
                        ((jkc1) it.next()).mo26276c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                }
            case 1:
                ViewPagerIndicator viewPagerIndicator = (ViewPagerIndicator) this.f180608b;
                viewPagerIndicator.f5111c = i;
                viewPagerIndicator.postInvalidate();
                return;
            default:
                return;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m70719d(jkc1 jkc1Var) {
        ((ArrayList) this.f180608b).add(jkc1Var);
    }

    /* JADX INFO: renamed from: f */
    public void m70720f(jkc1 jkc1Var) {
        ((ArrayList) this.f180608b).remove(jkc1Var);
    }

    public prh() {
        this.f180607a = 0;
        this.f180608b = new ArrayList(3);
    }

    /* JADX INFO: renamed from: e */
    private final void m70718e(int i) {
    }
}
