package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class dic1 {

    /* JADX INFO: renamed from: a */
    public final String f49316a;

    public dic1(String str) {
        this.f49316a = str;
    }

    /* JADX INFO: renamed from: a */
    public final k791 m36074a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setFlags(67108864);
        intent.putExtra("is_internal_navigation", true);
        return new k791(context, this.f49316a, intent);
    }
}
