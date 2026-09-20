package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class hu61 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f95332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f95333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu61(String str, String str2) {
        super(0);
        this.f95332a = str;
        this.f95333b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.RefreshWidget(this.f95332a, this.f95333b);
    }
}
