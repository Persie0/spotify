package p204p;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a4p0 {
    /* JADX INFO: renamed from: a */
    public static void m24708a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
        builder.addCustomAction(customAction);
    }

    /* JADX INFO: renamed from: b */
    public static PlaybackState.CustomAction m24709b(PlaybackState.CustomAction.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: c */
    public static PlaybackState m24710c(PlaybackState.Builder builder) {
        return builder.build();
    }

    /* JADX INFO: renamed from: d */
    public static PlaybackState.Builder m24711d() {
        return new PlaybackState.Builder();
    }

    /* JADX INFO: renamed from: e */
    public static PlaybackState.CustomAction.Builder m24712e(String str, CharSequence charSequence, int i) {
        return new PlaybackState.CustomAction.Builder(str, charSequence, i);
    }

    /* JADX INFO: renamed from: f */
    public static String m24713f(PlaybackState.CustomAction customAction) {
        return customAction.getAction();
    }

    /* JADX INFO: renamed from: g */
    public static long m24714g(PlaybackState playbackState) {
        return playbackState.getActions();
    }

    /* JADX INFO: renamed from: h */
    public static long m24715h(PlaybackState playbackState) {
        return playbackState.getActiveQueueItemId();
    }

    /* JADX INFO: renamed from: i */
    public static long m24716i(PlaybackState playbackState) {
        return playbackState.getBufferedPosition();
    }

    /* JADX INFO: renamed from: j */
    public static List<PlaybackState.CustomAction> m24717j(PlaybackState playbackState) {
        return playbackState.getCustomActions();
    }

    /* JADX INFO: renamed from: k */
    public static CharSequence m24718k(PlaybackState playbackState) {
        return playbackState.getErrorMessage();
    }

    /* JADX INFO: renamed from: l */
    public static Bundle m24719l(PlaybackState.CustomAction customAction) {
        return customAction.getExtras();
    }

    /* JADX INFO: renamed from: m */
    public static int m24720m(PlaybackState.CustomAction customAction) {
        return customAction.getIcon();
    }

    /* JADX INFO: renamed from: n */
    public static long m24721n(PlaybackState playbackState) {
        return playbackState.getLastPositionUpdateTime();
    }

    /* JADX INFO: renamed from: o */
    public static CharSequence m24722o(PlaybackState.CustomAction customAction) {
        return customAction.getName();
    }

    /* JADX INFO: renamed from: p */
    public static float m24723p(PlaybackState playbackState) {
        return playbackState.getPlaybackSpeed();
    }

    /* JADX INFO: renamed from: q */
    public static long m24724q(PlaybackState playbackState) {
        return playbackState.getPosition();
    }

    /* JADX INFO: renamed from: r */
    public static int m24725r(PlaybackState playbackState) {
        return playbackState.getState();
    }

    /* JADX INFO: renamed from: s */
    public static void m24726s(PlaybackState.Builder builder, long j) {
        builder.setActions(j);
    }

    /* JADX INFO: renamed from: t */
    public static void m24727t(PlaybackState.Builder builder, long j) {
        builder.setActiveQueueItemId(j);
    }

    /* JADX INFO: renamed from: u */
    public static void m24728u(PlaybackState.Builder builder, long j) {
        builder.setBufferedPosition(j);
    }

    /* JADX INFO: renamed from: v */
    public static void m24729v(PlaybackState.Builder builder, CharSequence charSequence) {
        builder.setErrorMessage(charSequence);
    }

    /* JADX INFO: renamed from: w */
    public static void m24730w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    /* JADX INFO: renamed from: x */
    public static void m24731x(PlaybackState.Builder builder, int i, long j, float f, long j2) {
        builder.setState(i, j, f, j2);
    }
}
