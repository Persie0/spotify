package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;

/* JADX INFO: loaded from: classes11.dex */
public final class xc0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f260034a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f260035b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WidgetState.ActiveSession f260036c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc0(String str, String str2, WidgetState.ActiveSession activeSession) {
        super(0);
        this.f260034a = str;
        this.f260035b = str2;
        this.f260036c = activeSession;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Background(this.f260034a, this.f260035b, WidgetInteraction.BackgroundSessionState.ACTIVE, this.f260036c.getMetadata().getUri());
    }
}
