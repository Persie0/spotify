package p204p;

import android.content.Intent;
import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class z1y0 {

    /* JADX INFO: renamed from: a */
    public Intent f278444a;

    /* JADX INFO: renamed from: a */
    public final Intent m95165a(vn80 vn80Var) {
        Intent intent = new Intent(this.f278444a);
        Bundle bundle = new Bundle();
        if (vn80Var == null) {
            vn80Var = new vn80(UUID.randomUUID().toString());
        }
        bundle.putParcelable("account_linking_id", vn80Var);
        intent.putExtra("account_linking_bundle", bundle);
        return intent;
    }
}
