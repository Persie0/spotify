package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class bev0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f26458a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f26459b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bev0(String str, String str2) {
        super(0);
        this.f26458a = str;
        this.f26459b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Login(this.f26458a, this.f26459b);
    }
}
