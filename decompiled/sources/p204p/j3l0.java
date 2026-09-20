package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class j3l0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108414a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e6a0 f108415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3l0(e6a0 e6a0Var, int i) {
        super(0);
        this.f108414a = i;
        this.f108415b = e6a0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f108414a) {
            case 0:
                e6a0 e6a0Var = this.f108415b;
                return PendingIntent.getBroadcast((Context) e6a0Var.f56598b, 0, new Intent((Context) e6a0Var.f56598b, (Class<?>) BulkRedownloadCancelReceiver.class), 201326592);
            default:
                e6a0 e6a0Var2 = this.f108415b;
                Context context = (Context) e6a0Var2.f56598b;
                return PendingIntent.getActivity(context, 0, ((g550) ((f550) e6a0Var2.f56599c)).m43588a(context), 67108864);
        }
    }
}
