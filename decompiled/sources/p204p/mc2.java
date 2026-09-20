package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes4.dex */
public final class mc2 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f142014a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nc2 f142015b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f142016c;

    public /* synthetic */ mc2(nc2 nc2Var, String str, int i) {
        this.f142014a = i;
        this.f142015b = nc2Var;
        this.f142016c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f142014a) {
            case 0:
                String str = (String) obj;
                if (str.length() <= 0) {
                    str = null;
                }
                this.f142015b.m64108c(this.f142016c, str);
                break;
            default:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, th.getMessage(), new Object[0]);
                this.f142015b.m64108c(this.f142016c, null);
                break;
        }
    }
}
