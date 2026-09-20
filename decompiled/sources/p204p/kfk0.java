package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;

/* JADX INFO: loaded from: classes11.dex */
public final class kfk0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CurrentTrackMetadata f122179a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f122180b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f122181c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfk0(CurrentTrackMetadata currentTrackMetadata, String str, String str2) {
        super(0);
        this.f122179a = currentTrackMetadata;
        this.f122180b = str;
        this.f122181c = str2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.NpvMetadata(this.f122180b, this.f122181c, this.f122179a.getUri());
    }
}
