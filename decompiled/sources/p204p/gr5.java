package p204p;

import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.view.View;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public final class gr5 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f83643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f83644c;

    public /* synthetic */ gr5(int i, Object obj, Object obj2) {
        this.f83642a = i;
        this.f83643b = obj;
        this.f83644c = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() {
        switch (this.f83642a) {
            case 0:
                ((Disposable) this.f83643b).dispose();
                ((Disposable) this.f83644c).dispose();
                break;
            case 1:
                sy9 sy9Var = (sy9) this.f83643b;
                sy9Var.f215190a.unregisterReceiver((y59) this.f83644c);
                sy9Var.f215191b.clear();
                break;
            case 2:
                ((ConnectivityManager) ((uho) this.f83643b).f230491b.getValue()).unregisterNetworkCallback((pi4) this.f83644c);
                break;
            case 3:
                try {
                    ((NsdManager) this.f83643b).unregisterService((tj4) this.f83644c);
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.toString();
                    return;
                } catch (IllegalArgumentException e2) {
                    e2.toString();
                    return;
                }
                break;
            case 4:
                ((hc80) this.f83643b).getLifecycle().mo31988d((zrb) this.f83644c);
                break;
            case 5:
                ((ago) this.f83643b).m25876m((xos) this.f83644c);
                break;
            case 6:
                q6u q6uVar = (q6u) this.f83643b;
                ObservableEmitter observableEmitter = (ObservableEmitter) this.f83644c;
                wj50.m88279p(observableEmitter);
                ((CopyOnWriteArraySet) q6uVar.f185926c).remove(observableEmitter);
                break;
            case 7:
                ((t040) this.f83643b).mo31539c((u040) this.f83644c);
                break;
            case 8:
                ((gb80) this.f83643b).mo31988d((ib80) this.f83644c);
                break;
            case 9:
                ((gb80) this.f83643b).mo31988d((ib80) this.f83644c);
                break;
            case 10:
                ((gb80) this.f83643b).mo31988d((ne2) this.f83644c);
                break;
            case 11:
                ((t040) this.f83643b).mo31539c((u040) this.f83644c);
                break;
            case 12:
                ((hc41) this.f83643b).f89693a.unregisterNetworkCallback((pi4) this.f83644c);
                break;
            default:
                ((View) this.f83643b).getViewTreeObserver().removeOnScrollChangedListener((khc1) this.f83644c);
                break;
        }
    }
}
