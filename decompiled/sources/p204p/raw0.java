package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes2.dex */
public final class raw0 implements Action {

    /* JADX INFO: renamed from: b */
    public static final raw0 f197397b = new raw0(0);

    /* JADX INFO: renamed from: c */
    public static final raw0 f197398c = new raw0(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f197399a;

    public /* synthetic */ raw0(int i) {
        this.f197399a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f197399a) {
            case 0:
                Logger.m3969e("Resolver Async fetch attempt succeeded", new Object[0]);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m75123a() {
    }
}
