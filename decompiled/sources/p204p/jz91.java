package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class jz91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f117636a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f117637b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz91(String str, String str2) {
        super(0);
        this.f117636a = str;
        this.f117637b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Background(this.f117636a, this.f117637b, WidgetInteraction.BackgroundSessionState.UNAUTHENTICATED, null, 8, null);
    }
}
