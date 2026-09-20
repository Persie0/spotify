package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;

/* JADX INFO: loaded from: classes11.dex */
public final class f9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f67320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f67321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CurrentTrackMetadata f67322c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t5m f67323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9p0(String str, String str2, CurrentTrackMetadata currentTrackMetadata, t5m t5mVar) {
        super(0);
        this.f67320a = str;
        this.f67321b = str2;
        this.f67322c = currentTrackMetadata;
        this.f67323d = t5mVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        return new WidgetInteraction.CurateCommand(this.f67320a, this.f67321b, this.f67322c, this.f67323d);
    }
}
