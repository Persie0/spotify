package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class pde1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f176448a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f176449b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WidgetState.WrappedPlaylist f176450c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pde1(String str, String str2, WidgetState.WrappedPlaylist wrappedPlaylist) {
        super(0);
        this.f176448a = str;
        this.f176449b = str2;
        this.f176450c = wrappedPlaylist;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.WrappedClick(this.f176448a, this.f176449b, this.f176450c.getDeeplink());
    }
}
