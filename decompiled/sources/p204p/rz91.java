package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;

/* JADX INFO: loaded from: classes11.dex */
public final class rz91 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f204100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f204101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz91(String str, String str2) {
        super(0);
        this.f204100a = str;
        this.f204101b = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.Login(this.f204100a, this.f204101b);
    }
}
