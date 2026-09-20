package p204p;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;
import com.spotify.music.R;
import com.spotify.scannables.scannables.ScannablesException;
import io.reactivex.rxjava3.functions.Consumer;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public final class lcy0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f132007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zu0 f132008b;

    public /* synthetic */ lcy0(zu0 zu0Var, int i) {
        this.f132007a = i;
        this.f132008b = zu0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f132007a) {
            case 0:
                Throwable th = (Throwable) obj;
                ncy0 ncy0Var = (ncy0) ((WeakReference) this.f132008b.f286304g).get();
                if (ncy0Var != null) {
                    Activity activity = ncy0Var.f152610a;
                    ncy0Var.f152613d.dismiss();
                    if (!(th instanceof ScannablesException)) {
                        Toast.makeText(activity, R.string.scannables_error_message_toast, 0).show();
                        activity.setResult(0);
                        activity.finish();
                    } else {
                        Toast.makeText(activity, R.string.scannables_cant_retrieve_scannable, 1).show();
                    }
                    break;
                }
                break;
            default:
                yz30 yz30Var = (yz30) obj;
                ncy0 ncy0Var2 = (ncy0) ((WeakReference) this.f132008b.f286304g).get();
                if (ncy0Var2 != null) {
                    ncy0Var2.f152613d.dismiss();
                    String str = yz30Var.f277677a;
                    Intent intent = new Intent();
                    intent.putExtra("com.spotify.scannables.scannables.RESULT", str);
                    Activity activity2 = ncy0Var2.f152610a;
                    activity2.setResult(-1, intent);
                    activity2.finish();
                    break;
                }
                break;
        }
    }
}
