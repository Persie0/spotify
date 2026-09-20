package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class e03 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f54835b;

    public /* synthetic */ e03(String str, int i) {
        this.f54834a = i;
        this.f54835b = str;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f54834a) {
            case 0:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to fetch album entity ", this.f54835b), new Object[0]);
                break;
            case 1:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to fetch artist entity ", this.f54835b), new Object[0]);
                break;
            case 2:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to fetch artist entity ", this.f54835b), new Object[0]);
                break;
            case 3:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to invalidate card cache for ", this.f54835b), new Object[0]);
                break;
            case 4:
                na6.m63972t("LP dynamic feature load failed | roomUri> " + this.f54835b, (Throwable) obj);
                break;
            case 5:
                na6.m63972t("Failed to load metadata for " + this.f54835b, (Throwable) obj);
                break;
            case 6:
                na6.m63972t("Failed to load metadata for " + this.f54835b, (Throwable) obj);
                break;
            case 7:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to update selected-language: ", this.f54835b), new Object[0]);
                break;
            case 8:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to fetch playlist entity ", this.f54835b), new Object[0]);
                break;
            case 9:
                Logger.m3967c((Throwable) obj, edb.m38564m("Failed to fetch show entity ", this.f54835b), new Object[0]);
                break;
            default:
                Logger.m3966b(edb.m38566o("Error getting Smart Shuffle recommendations for ", this.f54835b, ": ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
        }
    }
}
