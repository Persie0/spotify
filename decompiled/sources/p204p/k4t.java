package p204p;

import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class k4t implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f119301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m500 f119302b;

    public /* synthetic */ k4t(m500 m500Var, int i) {
        this.f119301a = i;
        this.f119302b = m500Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f119301a) {
            case 0:
                m500 m500Var = this.f119302b;
                m500Var.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", m500Var.getPackageName(), null)));
                break;
            case 1:
                Toast.makeText(this.f119302b, R.string.error_general_title, 1).show();
                break;
            default:
                m500 m500Var2 = this.f119302b;
                m500Var2.startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", m500Var2.getPackageName(), null)));
                break;
        }
    }
}
