package p204p;

import com.spotify.widgets.npvwidget.WidgetInteraction;
import com.spotify.widgets.widgetstate.WidgetState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class i9p0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WidgetState.PlayPauseState f100057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f100058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f100059c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f100060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9p0(WidgetState.PlayPauseState playPauseState, String str, String str2, String str3) {
        super(0);
        this.f100057a = playPauseState;
        this.f100058b = str;
        this.f100059c = str2;
        this.f100060d = str3;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = h9p0.f89017a[this.f100057a.ordinal()];
        String str = this.f100059c;
        String str2 = this.f100058b;
        if (i == 1 || i == 2) {
            return new WidgetInteraction.PlayCommand(str2, str, this.f100060d);
        }
        if (i == 3 || i == 4) {
            return new WidgetInteraction.PauseCommand(str2, str);
        }
        throw new NoWhenBranchMatchedException();
    }
}
