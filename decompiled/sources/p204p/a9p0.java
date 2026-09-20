package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class a9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f13619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f13620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9p0(String str, String str2) {
        super(0);
        this.f13619a = str;
        this.f13620b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.SeekBackwardCommand(this.f13619a, this.f13620b);
    }
}
