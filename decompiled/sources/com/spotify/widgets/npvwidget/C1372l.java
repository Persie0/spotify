package com.spotify.widgets.npvwidget;

import p204p.kv91;
import p204p.ndh0;
import p204p.qih0;
import p204p.r6j0;
import p204p.sag0;
import p204p.w6j0;

/* JADX INFO: renamed from: com.spotify.widgets.npvwidget.l */
/* JADX INFO: loaded from: classes11.dex */
public final class C1372l {

    /* JADX INFO: renamed from: a */
    public final kv91 f7047a;

    /* JADX INFO: renamed from: b */
    public final w6j0 f7048b;

    public C1372l(kv91 kv91Var, w6j0 w6j0Var) {
        this.f7047a = kv91Var;
        this.f7048b = w6j0Var;
    }

    /* JADX INFO: renamed from: a */
    public static sag0 m23088a(WidgetInteraction.ItemClick.GridItemClick gridItemClick) {
        qih0 qih0Var = new qih0(new ndh0(gridItemClick.getPageIdentifier(), 7));
        String string = gridItemClick.getItemUri().toString();
        int itemPosition = gridItemClick.getItemPosition();
        return new sag0(qih0Var, Integer.valueOf(itemPosition), gridItemClick.getItemReason(), string);
    }

    /* JADX INFO: renamed from: b */
    public final void m23089b(String str) {
        this.f7048b.m87296g(new r6j0(str, (String) null, (String) null));
    }
}
