package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class b9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f24982a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f24983b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9p0(String str, String str2) {
        super(0);
        this.f24982a = str;
        this.f24983b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.PreviousCommand(this.f24982a, this.f24983b);
    }
}
