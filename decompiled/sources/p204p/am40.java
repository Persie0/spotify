package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class am40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetState.InactiveSession f17037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f17038b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f17039c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am40(WidgetState.InactiveSession inactiveSession, String str, String str2) {
        super(0);
        this.f17037a = inactiveSession;
        this.f17038b = str;
        this.f17039c = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        WidgetState.InactiveSession inactiveSession = this.f17037a;
        return new WidgetInteraction.ItemClick.HeroItemClick(inactiveSession.getMetadata().f174722e, this.f17038b, this.f17039c, inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage());
    }
}
