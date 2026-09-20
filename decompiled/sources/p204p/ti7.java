package p204p;

import android.content.Intent;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class ti7 implements Function {

    /* JADX INFO: renamed from: a */
    public final Intent f220565a;

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            return p1j0.f173119a;
        }
        return new u1j0(hct0.class, new kct0(this.f220565a.getBooleanExtra("puffin_setup_flow_should_resume_music_when_exiting_flow", false)), new xzq0(1, false, 6));
    }
}
