package p204p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: classes6.dex */
public final class n72 implements Connection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f151037a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Disposable f151038b;

    public /* synthetic */ n72(Disposable disposable, int i) {
        this.f151037a = i;
        this.f151038b = disposable;
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.functions.Consumer
    public final synchronized void accept(Object obj) {
        int i = this.f151037a;
        synchronized (this) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                default:
                    break;
            }
        }
    }

    @Override // com.spotify.mobius.Connection, com.spotify.mobius.disposables.Disposable
    public final synchronized void dispose() {
        int i = this.f151037a;
        synchronized (this) {
            switch (i) {
                case 0:
                    this.f151038b.dispose();
                    return;
                case 1:
                    this.f151038b.dispose();
                    return;
                case 2:
                    this.f151038b.dispose();
                    return;
                case 3:
                    this.f151038b.dispose();
                    return;
                case 4:
                    this.f151038b.dispose();
                    return;
                case 5:
                    this.f151038b.dispose();
                    return;
                case 6:
                    this.f151038b.dispose();
                    return;
                case 7:
                    this.f151038b.dispose();
                    return;
                case 8:
                    this.f151038b.dispose();
                    return;
                case 9:
                    this.f151038b.dispose();
                    return;
                case 10:
                    this.f151038b.dispose();
                    return;
                case 11:
                    this.f151038b.dispose();
                    return;
                case 12:
                    this.f151038b.dispose();
                    return;
                case 13:
                    this.f151038b.dispose();
                    return;
                case 14:
                    this.f151038b.dispose();
                    return;
                case 15:
                    this.f151038b.dispose();
                    return;
                case 16:
                    this.f151038b.dispose();
                    return;
                case 17:
                    this.f151038b.dispose();
                    return;
                case 18:
                    this.f151038b.dispose();
                    return;
                case 19:
                    this.f151038b.dispose();
                    return;
                default:
                    this.f151038b.dispose();
                    return;
            }
        }
    }
}
