package p204p;

import android.media.AudioManager;
import java.util.function.Function;

/* JADX INFO: loaded from: classes5.dex */
public final class nz6 implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pz6 f160004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f160005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener f160006c;

    public nz6(pz6 pz6Var, int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f160004a = pz6Var;
        this.f160005b = i;
        this.f160006c = onAudioFocusChangeListener;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new mz6(this.f160004a, this.f160005b, this.f160006c);
    }
}
