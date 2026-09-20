package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class arf extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetState.InactiveSession f19051a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f19052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arf(WidgetState.InactiveSession inactiveSession, String str, String str2) {
        super(0);
        this.f19051a = inactiveSession;
        this.f19052b = str;
        this.f19053c = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.ItemClick.HeroItemClick(this.f19051a.getMetadata().f174722e, this.f19052b, this.f19053c, true, false);
    }
}
