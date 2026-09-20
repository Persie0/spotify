package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class zqf extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetState.InactiveSession f285377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f285378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f285379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqf(WidgetState.InactiveSession inactiveSession, String str, String str2) {
        super(0);
        this.f285377a = inactiveSession;
        this.f285378b = str;
        this.f285379c = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        WidgetState.InactiveSession inactiveSession = this.f285377a;
        return new WidgetInteraction.ItemClick.HeroItemClick(inactiveSession.getMetadata().f174722e, this.f285378b, this.f285379c, inactiveSession.getShouldPlayRecommendations(), inactiveSession.getShouldOpenEntityPage());
    }
}
