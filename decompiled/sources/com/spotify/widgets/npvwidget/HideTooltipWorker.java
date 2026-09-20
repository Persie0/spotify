package com.spotify.widgets.npvwidget;

import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import p204p.e890;
import p204p.f890;
import p204p.u790;
import p204p.vgg1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/HideTooltipWorker;", "Lp/f890;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class HideTooltipWorker extends f890 {

    /* JADX INFO: renamed from: e */
    public final Context f6984e;

    public HideTooltipWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f6984e = context;
    }

    @Override // p204p.f890
    /* JADX INFO: renamed from: d */
    public final u790 mo1147d() {
        Context context = this.f6984e;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_UPDATE");
        context.sendBroadcast(intent);
        return vgg1.m85445A(e890.m38084a());
    }
}
