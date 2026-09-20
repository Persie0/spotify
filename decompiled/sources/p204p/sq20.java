package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class sq20 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p7m f212990a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f212991b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f212992c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f212993d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f212994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq20(p7m p7mVar, String str, String str2, boolean z, boolean z2) {
        super(0);
        this.f212990a = p7mVar;
        this.f212991b = str;
        this.f212992c = str2;
        this.f212993d = z;
        this.f212994e = z2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.ItemClick.HeroItemClick(this.f212990a.f174722e, this.f212991b, this.f212992c, this.f212993d, this.f212994e);
    }
}
