package p204p;

import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: classes5.dex */
public final class c3j implements Disposable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hkp f33693b;

    public /* synthetic */ c3j(hkp hkpVar, int i) {
        this.f33692a = i;
        this.f33693b = hkpVar;
    }

    @Override // com.spotify.mobius.disposables.Disposable
    public final void dispose() {
        switch (this.f33692a) {
            case 0:
                this.f33693b.invoke();
                break;
            default:
                this.f33693b.invoke();
                break;
        }
    }
}
