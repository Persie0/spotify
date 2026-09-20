package p204p;

import android.media.AudioManager;
import com.spotify.carapplibrary.app.instrumentation.events.proto.ExternalAccessoryRemoteError;

/* JADX INFO: loaded from: classes5.dex */
public final class gx6 implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85189a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f85190b;

    public /* synthetic */ gx6(Object obj, int i) {
        this.f85189a = i;
        this.f85190b = obj;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        switch (this.f85189a) {
            case 0:
                i26 i26Var = (i26) this.f85190b;
                qx6 qx6Var = qx6.f193524b;
                if (i == -3) {
                    i26Var.m49468o(qx6Var);
                    break;
                } else if (i == -2) {
                    i26Var.m49468o(qx6Var);
                    break;
                } else if (i == -1) {
                    i26Var.m49468o(qx6Var);
                    break;
                } else if (i == 1) {
                    i26Var.m49468o(qx6.f193523a);
                    break;
                }
                break;
            default:
                r6b r6bVar = (r6b) this.f85190b;
                if (i == -1) {
                    qre0 qre0Var = r6bVar.f196224b.f191108a;
                    fwx fwxVarM5543r = ExternalAccessoryRemoteError.m5543r();
                    fwxVarM5543r.m42983m("audio_recording");
                    fwxVarM5543r.m42985r();
                    fwxVarM5543r.m42984q("audio_focus_change|audiofocus loss");
                    qre0Var.m73616a((ExternalAccessoryRemoteError) fwxVarM5543r.build());
                    r6bVar.release();
                }
                break;
        }
    }
}
