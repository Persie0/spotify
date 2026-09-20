package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class bm40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetState.InactiveSession f28373a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f28374b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm40(WidgetState.InactiveSession inactiveSession, String str, String str2) {
        super(0);
        this.f28373a = inactiveSession;
        this.f28374b = str;
        this.f28375c = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.ItemClick.HeroItemClick(this.f28373a.getMetadata().f174722e, this.f28374b, this.f28375c, true, false);
    }
}
