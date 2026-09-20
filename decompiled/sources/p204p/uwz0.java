package p204p;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public final class uwz0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f234751a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Intent f234752b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwz0(Context context, Intent intent) {
        super(0);
        this.f234751a = context;
        this.f234752b = intent;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        this.f234751a.startForegroundService(this.f234752b);
        return w2a1.f247311a;
    }
}
