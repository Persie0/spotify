package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class d9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f46871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f46872b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9p0(String str, String str2) {
        super(0);
        this.f46871a = str;
        this.f46872b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.NextCommand(this.f46871a, this.f46872b);
    }
}
