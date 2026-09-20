package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class uee1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f229496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f229497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WidgetState.WrappedStory f229498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uee1(String str, String str2, WidgetState.WrappedStory wrappedStory) {
        super(0);
        this.f229496a = str;
        this.f229497b = str2;
        this.f229498c = wrappedStory;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.WrappedClick(this.f229496a, this.f229497b, this.f229498c.getDeeplink());
    }
}
