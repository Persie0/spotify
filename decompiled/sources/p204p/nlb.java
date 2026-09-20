package p204p;

import com.spotify.campfire.datasource.impl.proto.ReceiptType;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class nlb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f155036a;

    static {
        int[] iArr = new int[gvd.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[lzu0.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[2] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[ReceiptType.values().length];
        try {
            iArr3[ReceiptType.RECEIPT_TYPE_PLAYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[ReceiptType.RECEIPT_TYPE_SAVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[ReceiptType.RECEIPT_TYPE_SEEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f155036a = iArr3;
    }
}
