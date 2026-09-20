package p204p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s8m extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ q261 f206681a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8m(q261 q261Var) {
        super(new Handler());
        this.f206681a = q261Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f206681a.m82587e();
    }
}
