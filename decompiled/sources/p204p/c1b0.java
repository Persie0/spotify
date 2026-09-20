package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class c1b0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f33040a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f33041b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1b0(String str, String str2) {
        super(0);
        this.f33040a = str;
        this.f33041b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.SpotifyLogo(this.f33040a, this.f33041b, null, 4, null);
    }
}
