package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ht4 {

    /* JADX INFO: renamed from: a */
    public final Context f94919a;

    public ht4(Context context) {
        this.f94919a = context;
    }

    /* JADX INFO: renamed from: a */
    public final void m48571a(String str) {
        try {
            this.f94919a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(dq60.m36608h('.', "Can't open ", str), e);
        }
    }
}
