package p204p;

import android.content.Context;
import android.content.Intent;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;

/* JADX INFO: loaded from: classes2.dex */
public final class n200 {

    /* JADX INFO: renamed from: a */
    public final Context f149576a;

    public n200(Context context) {
        this.f149576a = context;
    }

    /* JADX INFO: renamed from: a */
    public Intent m63534a(x200 x200Var) {
        Intent intent = new Intent(this.f149576a.getApplicationContext(), (Class<?>) ForegroundKeeperService.class);
        intent.putExtra("notifier-action", x200Var);
        return intent;
    }
}
