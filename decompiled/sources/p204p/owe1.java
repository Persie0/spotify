package p204p;

import com.spotify.yourupdates.badgingstate.models.BadgingState;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class owe1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f170705a;

    static {
        int[] iArr = new int[BadgingState.values().length];
        try {
            iArr[BadgingState.SHOW_BADGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgingState.HIDE_BADGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f170705a = iArr;
    }
}
