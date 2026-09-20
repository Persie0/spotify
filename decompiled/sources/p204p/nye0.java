package p204p;

import android.graphics.drawable.GradientDrawable;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.IconName;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.p110ui.ImageStyle;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class nye0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f159799a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f159800b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int[] f159801c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int[] f159802d;

    static {
        int[] iArr = new int[IconName.values().length];
        try {
            iArr[IconName.SHUFFLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IconName.SPOTIFYLOGO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IconName.X.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[IconName.EXCLAMATIONCIRCLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[IconName.CHEVRONRIGHT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[IconName.FOLLOWACTIVE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[IconName.DEVICETV.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[IconName.DEVICESPEAKER.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[IconName.PLUS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[IconName.EXTERNALLINK.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f159799a = iArr;
        int[] iArr2 = new int[ImageStyle.values().length];
        try {
            iArr2[ImageStyle.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[ImageStyle.SQUARE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[ImageStyle.FULL_WIDTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[ImageStyle.UNKNOWN_IMAGE_STYLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        f159800b = iArr2;
        int[] iArr3 = new int[GradientDrawable.Orientation.values().length];
        try {
            iArr3[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[GradientDrawable.Orientation.BL_TR.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[GradientDrawable.Orientation.TR_BL.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr3[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        f159801c = iArr3;
        int[] iArr4 = new int[EncoreFont.values().length];
        try {
            iArr4[EncoreFont.BODY_SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[EncoreFont.BODY_MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[EncoreFont.TITLE_SMALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[EncoreFont.TITLE_MEDIUM.ordinal()] = 4;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr4[EncoreFont.TITLE_LARGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr4[EncoreFont.HEADLINE_MEDIUM.ordinal()] = 6;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr4[EncoreFont.HEADLINE_LARGE.ordinal()] = 7;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr4[EncoreFont.BODY_MEDIUM_BOLD.ordinal()] = 8;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr4[EncoreFont.BODY_SMALL_BOLD.ordinal()] = 9;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr4[EncoreFont.MARGINAL.ordinal()] = 10;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr4[EncoreFont.MARGINAL_BOLD.ordinal()] = 11;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr4[EncoreFont.UNKNOWN_FONT.ordinal()] = 12;
        } catch (NoSuchFieldError unused34) {
        }
        f159802d = iArr4;
    }
}
