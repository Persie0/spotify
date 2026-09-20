package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class yl40 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f273906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f273907b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl40(String str, String str2) {
        super(0);
        this.f273906a = str;
        this.f273907b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Background(this.f273906a, this.f273907b, WidgetInteraction.BackgroundSessionState.INACTIVE, null, 8, null);
    }
}
