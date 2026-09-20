package p204p;

import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;

/* JADX INFO: loaded from: classes11.dex */
public final class dg41 extends qe70 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RemoteViews f48716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg41(RemoteViews remoteViews, int i) {
        super(2);
        this.f48715a = i;
        this.f48716b = remoteViews;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f48715a) {
            case 0:
                ((AppWidgetManager) obj).partiallyUpdateAppWidget((int[]) obj2, this.f48716b);
                break;
            default:
                ((AppWidgetManager) obj).updateAppWidget((int[]) obj2, this.f48716b);
                break;
        }
        return w2a1.f247311a;
    }
}
