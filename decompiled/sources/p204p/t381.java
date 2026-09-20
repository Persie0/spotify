package p204p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.templates.TooltipArrowDirection;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class t381 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f216728a;

    static {
        int[] iArr = new int[TooltipArrowDirection.values().length];
        try {
            iArr[TooltipArrowDirection.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TooltipArrowDirection.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TooltipArrowDirection.LEADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TooltipArrowDirection.TRAILING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f216728a = iArr;
    }
}
