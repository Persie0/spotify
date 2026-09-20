package p204p;

import com.spotify.player.model.ContextTrack;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ygz0 {
    /* JADX INFO: renamed from: a */
    public static final boolean m93611a(ContextTrack contextTrack) {
        return contextTrack.metadata().containsKey(ContextTrack.Metadata.KEY_NARRATION_INTRO_SSML) || contextTrack.metadata().containsKey(ContextTrack.Metadata.KEY_NARRATION_INTRO_URI) || contextTrack.metadata().containsKey("narration.jump.ssml") || contextTrack.metadata().containsKey("narration.jump.uri");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m93612b(ContextTrack contextTrack) {
        return wj50.m88271j(contextTrack.metadata().get(ContextTrack.Metadata.KEY_JUMP_TRACK), "true");
    }

    /* JADX INFO: renamed from: c */
    public static final yls0 m93613c(p121 p121Var) {
        int iOrdinal = p121Var.ordinal();
        if (iOrdinal == 0) {
            return yls0.PROMPT_INPUT_TYPE_TEXT;
        }
        if (iOrdinal == 1) {
            return yls0.PROMPT_INPUT_TYPE_VOICE;
        }
        if (iOrdinal == 2) {
            return yls0.PROMPT_INPUT_TYPE_SUGGESTED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
