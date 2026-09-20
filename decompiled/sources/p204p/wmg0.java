package p204p;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class wmg0 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sir0 f252884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cha0 f252885b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmg0(Handler handler, sir0 sir0Var, cha0 cha0Var) {
        super(handler);
        this.f252884a = sir0Var;
        this.f252885b = cha0Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.f252884a.mo30231j(Boolean.valueOf(cha0.m32752b(this.f252885b)));
    }
}
