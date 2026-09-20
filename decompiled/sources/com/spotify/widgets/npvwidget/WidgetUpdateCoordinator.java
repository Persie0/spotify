package com.spotify.widgets.npvwidget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import p204p.C2042k7;
import p204p.ctd1;
import p204p.edb;
import p204p.eud1;
import p204p.g6f;
import p204p.i6f;
import p204p.jud1;
import p204p.nzv;
import p204p.sk8;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/widgets/npvwidget/WidgetUpdateCoordinator;", "Lp/sk8;", "<init>", "()V", "src_main_java_com_spotify_widgets_npvwidget-npvwidget"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WidgetUpdateCoordinator extends sk8 {

    /* JADX INFO: renamed from: b */
    public static final Set f6989b;

    static {
        nzv nzvVar = ctd1.f41862i;
        ArrayList arrayList = new ArrayList(i6f.m49804T(nzvVar, 10));
        C2042k7 c2042k7 = new C2042k7(nzvVar, 0);
        while (c2042k7.hasNext()) {
            arrayList.add(((ctd1) c2042k7.next()).f41863a);
        }
        f6989b = g6f.m43736n1(arrayList);
    }

    @Override // p204p.sk8
    /* JADX INFO: renamed from: a */
    public final void mo13292a(Context context, Intent intent) {
        String stringExtra;
        String action = intent.getAction();
        if (!g6f.m43725i0(f6989b, action)) {
            action = null;
        }
        if (action == null) {
            Logger.m3973i(edb.m38564m("Rejected unsafe action: ", intent.getAction()), new Object[0]);
            return;
        }
        Intent intent2 = new Intent(action);
        if (action.equals("com.spotify.widgets.widgets.ACTION_TOOLTIP") && (stringExtra = intent.getStringExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE")) != null) {
            intent2.putExtra("com.spotify.widgets.widgets.EXTRA_WIDGET_TOOLTIP_MESSAGE", stringExtra);
        }
        Iterator it = eud1.f62953a.iterator();
        while (it.hasNext()) {
            context.sendBroadcast(new Intent(intent2).setComponent(new ComponentName(context, ((jud1) it.next()).f116101a)));
        }
    }
}
