package p204p;

import com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class jj40 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f112902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kj40 f112903b;

    public /* synthetic */ jj40(kj40 kj40Var, int i) {
        this.f112902a = i;
        this.f112903b = kj40Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f112902a) {
            case 0:
                ((InAppBrowserActivity) this.f112903b.f123232a).m2761w0(true);
                break;
            default:
                this.f112903b.f123233b.m51093a((String) obj);
                break;
        }
    }
}
