package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class jep0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public static final jep0 f111642a = new jep0();

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        Logger.m3967c((Throwable) obj, "Failed to update list items", new Object[0]);
    }
}
