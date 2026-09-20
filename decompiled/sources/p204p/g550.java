package p204p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class g550 implements f550 {

    /* JADX INFO: renamed from: a */
    public final Context f76590a;

    /* JADX INFO: renamed from: b */
    public final dic1 f76591b;

    /* JADX INFO: renamed from: c */
    public final String f76592c;

    /* JADX INFO: renamed from: d */
    public final wg61 f76593d = new wg61(new ms40(this, 6));

    public g550(Context context, dic1 dic1Var, String str) {
        this.f76590a = context;
        this.f76591b = dic1Var;
        this.f76592c = str;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m43588a(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(context, this.f76592c);
        return intent;
    }
}
