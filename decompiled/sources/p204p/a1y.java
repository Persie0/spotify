package p204p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class a1y implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f11489a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yho f11490b;

    public /* synthetic */ a1y(yho yhoVar, int i) {
        this.f11489a = i;
        this.f11490b = yhoVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f11489a) {
            case 0:
                Uri uri = (Uri) obj;
                yho yhoVar = this.f11490b;
                yhoVar.m93678q();
                try {
                    ((cf0) yhoVar.f272928c).f37227a.startActivity(new Intent("android.intent.action.VIEW", uri));
                    ((k1e) yhoVar.f272929d).mo31129a();
                } catch (ActivityNotFoundException e) {
                    Logger.m3967c(e, "Couldn't launch external browser to handle URI %s", uri);
                    return;
                }
                break;
            default:
                this.f11490b.m93678q();
                Logger.m3967c((Throwable) obj, "Loading web token failed", new Object[0]);
                break;
        }
    }
}
