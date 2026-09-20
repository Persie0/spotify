package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class kz91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f128050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f128051b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz91(String str, String str2) {
        super(0);
        this.f128050a = str;
        this.f128051b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Login(this.f128050a, this.f128051b);
    }
}
