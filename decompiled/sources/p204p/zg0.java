package p204p;

import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.speech.tts.TextToSpeech;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Cancellable;
import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: loaded from: classes9.dex */
public final class zg0 implements Cancellable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f282452b;

    public /* synthetic */ zg0(Object obj, int i) {
        this.f282451a = i;
        this.f282452b = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Cancellable
    public final void cancel() throws IOException {
        switch (this.f282451a) {
            case 0:
                ((s1e1) this.f282452b).f204704c = null;
                break;
            case 1:
                ServerSocket serverSocket = (ServerSocket) this.f282452b;
                if (!serverSocket.isClosed()) {
                    serverSocket.close();
                }
                break;
            case 2:
                lh10 lh10Var = (lh10) this.f282452b;
                if (lh10Var.f133340b.isShowing()) {
                    ((eh10) lh10Var.f133339a.f197471b).cancel();
                }
                break;
            case 3:
                BluetoothSocket bluetoothSocket = (BluetoothSocket) this.f282452b;
                if (!bluetoothSocket.isConnected()) {
                    bluetoothSocket.close();
                    Logger.m3969e("Go: Socket closed", new Object[0]);
                }
                break;
            case 4:
                d6a0 d6a0Var = (d6a0) this.f282452b;
                d6a0Var.mo25475f();
                d6a0Var.f45638b.set(c6a0.f34467a);
                d6a0Var.f45639c.set(false);
                d6a0Var.f45637a = f6a0.f66344a;
                break;
            case 5:
                ((Disposable) this.f282452b).dispose();
                break;
            case 6:
                eyx0 eyx0Var = (eyx0) this.f282452b;
                TextToSpeech textToSpeech = eyx0Var.f64218e;
                if (textToSpeech != null) {
                    wj50.m88279p(textToSpeech);
                    textToSpeech.stop();
                    TextToSpeech textToSpeech2 = eyx0Var.f64218e;
                    wj50.m88279p(textToSpeech2);
                    textToSpeech2.shutdown();
                }
                break;
            case 7:
                ((iph0) this.f282452b).m51278a();
                break;
            case 8:
                ((h301) this.f282452b).f87107a = null;
                break;
            case 9:
                ((hk31) this.f282452b).f92332a.close();
                Logger.m3969e("Go: Stream closed", new Object[0]);
                break;
            case 10:
                y951 y951Var = (y951) this.f282452b;
                y951Var.f270513d.f238856b = null;
                y951Var.f270512c.m32006x4b82a326(null);
                break;
            case 11:
                ((ul91) this.f282452b).f231489b = null;
                break;
            default:
                whp whpVar = (whp) this.f282452b;
                whpVar.f251420c = null;
                ((Context) whpVar.f251419b).getContentResolver().unregisterContentObserver((ar8) whpVar.f251421d);
                break;
        }
    }
}
