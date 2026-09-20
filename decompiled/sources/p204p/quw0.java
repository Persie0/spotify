package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class quw0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f192830a;

    static {
        int[] iArr = new int[DataSectionType.values().length];
        try {
            iArr[DataSectionType.ACCOUNT_DATA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataSectionType.EXTENDED_STREAMING_HISTORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataSectionType.TECHNICAL_LOG_INFORMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f192830a = iArr;
    }
}
