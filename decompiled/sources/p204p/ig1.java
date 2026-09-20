package p204p;

import android.app.Activity;
import android.content.Intent;
import android.provider.CalendarContract;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class ig1 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101857a;

    /* JADX INFO: renamed from: b */
    public final Activity f101858b;

    public /* synthetic */ ig1(lwz lwzVar, Activity activity, int i) {
        this.f101857a = i;
        this.f101858b = activity;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f101857a) {
            case 0:
                my90 my90Var = ((pu90) obj).f181393b;
                String str = my90Var.f148366a;
                String str2 = my90Var.f148367b;
                String str3 = my90Var.f148368c;
                long j = my90Var.f148369d;
                this.f101858b.startActivity(new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI).putExtra(ContextTrack.Metadata.KEY_TITLE, str).putExtra("description", str2).putExtra("eventLocation", str3).putExtra("beginTime", j).putExtra("endTime", j + 4500000).putExtra("availability", 0));
                break;
            case 1:
                lwz.m60132b(this.f101858b, ((our0) obj).f170351c, err0.f62197t);
                break;
            default:
                lwz.m60132b(this.f101858b, ((hyr0) obj).f96653e, err0.f62172P0);
                break;
        }
    }

    public ig1(Activity activity) {
        this.f101857a = 0;
        this.f101858b = activity;
    }
}
