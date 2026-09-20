package p204p;

import android.content.Intent;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class pe41 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ re41 f176631b;

    public /* synthetic */ pe41(re41 re41Var, int i) {
        this.f176630a = i;
        this.f176631b = re41Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.f176630a;
        re41 re41Var = this.f176631b;
        switch (i) {
            case 0:
                fv31 fv31Var = re41.f198277f;
                Intent intent = new Intent("com.spotify.music.metadatachanged");
                xre xreVar = (xre) re41Var.f198280b.get();
                iwo0.m51846a(intent, (PlayerState) obj, xreVar);
                ((wy3) xreVar).getClass();
                intent.putExtra("timeSent", System.currentTimeMillis());
                re41Var.f198279a.sendStickyBroadcast(intent);
                break;
            case 1:
                PlayerState playerState = (PlayerState) obj;
                fv31 fv31Var2 = re41.f198277f;
                Intent intent2 = new Intent("com.spotify.music.playbackstatechanged");
                xre xreVar2 = (xre) re41Var.f198280b.get();
                iwo0.m51846a(intent2, playerState, xreVar2);
                boolean z = false;
                intent2.putExtra("playing", !playerState.isPaused() && playerState.isPlaying());
                if (!playerState.isPaused() && playerState.isPlaying()) {
                    z = true;
                }
                intent2.putExtra("playstate", z);
                ((wy3) xreVar2).getClass();
                intent2.putExtra("timeSent", System.currentTimeMillis());
                re41Var.f198279a.sendStickyBroadcast(intent2);
                break;
            default:
                fv31 fv31Var3 = re41.f198277f;
                Intent intent3 = new Intent("com.spotify.music.queuechanged");
                ((wy3) ((xre) re41Var.f198280b.get())).getClass();
                intent3.putExtra("timeSent", System.currentTimeMillis());
                re41Var.f198279a.sendStickyBroadcast(intent3);
                break;
        }
    }
}
