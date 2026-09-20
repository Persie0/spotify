package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class c9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f35609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f35610b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9p0(String str, String str2) {
        super(0);
        this.f35609a = str;
        this.f35610b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.SeekForwardCommand(this.f35609a, this.f35610b);
    }
}
