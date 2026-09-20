package androidx.car.app.model;

import android.os.Binder;
import p204p.sew0;

/* JADX INFO: renamed from: androidx.car.app.model.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0029c implements sew0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Binder f452b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f453c;

    public /* synthetic */ C0029c(Binder binder, String str, int i) {
        this.f451a = i;
        this.f452b = binder;
        this.f453c = str;
    }

    @Override // p204p.sew0
    /* JADX INFO: renamed from: b */
    public final Object mo205b() {
        switch (this.f451a) {
            case 0:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) this.f452b).lambda$onInputTextChanged$1(this.f453c);
            case 1:
                return ((InputCallbackDelegateImpl.OnInputCallbackStub) this.f452b).lambda$onInputSubmitted$0(this.f453c);
            default:
                return ((TabCallbackDelegateImpl.TabCallbackStub) this.f452b).lambda$onTabSelected$0(this.f453c);
        }
    }
}
